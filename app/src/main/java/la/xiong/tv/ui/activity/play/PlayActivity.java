package la.xiong.tv.ui.activity.play;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.widget.VideoView;
import la.xiong.androidquick.constant.Constant;
import la.xiong.androidquick.tool.ToastUtil;
import la.xiong.tv.R;
import la.xiong.tv.base.BaseTActivity;
import la.xiong.tv.util.LightController;
import la.xiong.tv.util.ScreenUtil;
import la.xiong.tv.util.VolumController;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class PlayActivity extends BaseTActivity<PlayPresenter> implements PlayContract.View, Handler.Callback, GestureDetector.OnGestureListener, MediaPlayer.OnPreparedListener, View.OnTouchListener {
    private static final int CHANGE_HEADER_STATUS = 10;
    private static final long DELAY_TIME = 3000;
    @BindView(R.id.play_video_view)
    VideoView mVideoView;

    @BindView(R.id.play_image_loading)
    ImageView mLoadingImage;

    @BindView(R.id.play_tv_title)
    TextView mTitleTv;

    @BindView(R.id.play_linear_big_control1)
    View mHeaderView;

    private Handler mHandler;

    private boolean mIsShow = true;

    private int mThreshold = 3;
    private int mHeightPixels;
    private int mWidthPixels;
    private GestureDetector mGestureDetector;

    private Bundle bundle;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_play;
    }

    @Override
    protected void getBundleExtras(Bundle extras) {
        bundle = extras;
    }

    @Override
    protected void initViewsAndEvents() {
        hideStatusBarAndNavigation();

        mHandler = new Handler(this);

        mHeightPixels = ScreenUtil.getScreenHeight(this);
        mWidthPixels = ScreenUtil.getScreenWidth(this);
        mGestureDetector = new GestureDetector(this, this);

        String uid = bundle.getString("uid");


        showLoading();
        mVideoView.setOnTouchListener(this);
        mVideoView.setOnPreparedListener(this);
        mPresenter.getVideoInfo(uid);
    }

    @Override
    protected void initInjector() {
        getActivityComponent().inject(this);
    }

    @Override
    public void hideLoading() {
        mLoadingImage.getAnimation().cancel();
        mLoadingImage.setVisibility(View.GONE);
    }

    @Override
    public void showLoading() {
        mLoadingImage.setVisibility(View.VISIBLE);
        Animation animation = AnimationUtils.loadAnimation(PlayActivity.this, R.anim.anim_rotate);
        mLoadingImage.startAnimation(animation);
    }

    @Override
    public void showError(Throwable throwable) {
        finish();
        Toast.makeText(this, throwable.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setVideoPath(String path) {
        mVideoView.setVideoPath(path);
    }

    @Override
    public void setTitle(String title) {
        mTitleTv.setText(title);
    }

    @Override
    public boolean handleMessage(Message msg) {
        switch (msg.what) {
            case CHANGE_HEADER_STATUS:
                if (mIsShow) {
                    mHeaderView.setVisibility(View.GONE);
                } else {
                    mHeaderView.setVisibility(View.VISIBLE);
                }
                mIsShow = !mIsShow;
                return true;
        }
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        mHandler.sendEmptyMessage(CHANGE_HEADER_STATUS);
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        int x = (int) e1.getX();
        if (Math.abs(distanceY) > mThreshold) {
            if (x > (mWidthPixels / 2 + 0.2 * mWidthPixels)) {  //音量改变
                if (distanceY > 0) {
                    VolumController.volumUp(this, distanceY, mHeightPixels);
                } else {
                    VolumController.volumDown(this, distanceY, mHeightPixels);
                }
            } else if (x < (mWidthPixels / 2 - 0.2 * mWidthPixels)) {
                if (distanceY > 0) {
                    LightController.lightUp(this, distanceY, mHeightPixels);
                } else {
                    LightController.lightDown(this, distanceY, mHeightPixels);
                }
            }
        }
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        hideStatusBarAndNavigation();
        switch (v.getId()) {
            case R.id.play_video_view:
                mGestureDetector.onTouchEvent(event);
                return true;
        }
        return false;
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        mVideoView.start();
        mHandler.sendEmptyMessageDelayed(CHANGE_HEADER_STATUS, DELAY_TIME);
        hideLoading();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mVideoView.pause();
    }

    public void showToast(String text, boolean flag) {
        ToastUtil.showToast(text);
    }

    private void hideStatusBarAndNavigation() {
        View decorView = getWindow().getDecorView();
        int option = View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        decorView.setSystemUiVisibility(option);
    }
}
