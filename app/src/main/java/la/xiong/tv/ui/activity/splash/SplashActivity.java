package la.xiong.tv.ui.activity.splash;

import java.util.concurrent.TimeUnit;

import la.xiong.tv.R;
import la.xiong.tv.base.BaseActivity;
import la.xiong.tv.ui.activity.main.MainActivity;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class SplashActivity extends BaseActivity {
    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initViewsAndEvents() {
        Observable.timer(1, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Long>() {
                    @Override
                    public void call(Long aLong) {
                        readyGoThenKill(MainActivity.class);
                    }
                });
    }
}
