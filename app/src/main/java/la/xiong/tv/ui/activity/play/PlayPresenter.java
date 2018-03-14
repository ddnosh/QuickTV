package la.xiong.tv.ui.activity.play;

import android.content.Context;

import javax.inject.Inject;

import la.xiong.androidquick.network.RetrofitManager;
import la.xiong.tv.MyApplication;
import la.xiong.tv.bean.Video;
import la.xiong.tv.network.TVApis;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class PlayPresenter extends PlayContract.Presenter {

    private RetrofitManager mRetrofitManager;
    private Context mContext;

    @Inject
    public PlayPresenter(Context mContext, RetrofitManager mRetrofitManager) {
        this.mContext = mContext;
        this.mRetrofitManager = mRetrofitManager;
    }

    @Override
    public void getVideoInfo(String uid) {
        addSubscription(mRetrofitManager.createApi(MyApplication.getInstance().getApplicationContext(), TVApis.class)
                .getVideoInfo(uid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Video>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Video data) {
                        mView.setVideoPath(data.getLive().getWs().getFlv().get_$5().getSrc());
                        mView.setTitle(data.getTitle());
                    }
                }));
    }
}
