package la.xiong.tv.injector.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import la.xiong.tv.injector.ActivityScope;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {this.mActivity = activity;}

    @Provides
    @ActivityScope
    public Activity provideActivity() {
        return mActivity;
    }
}
