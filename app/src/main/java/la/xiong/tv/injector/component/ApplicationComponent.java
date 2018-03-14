package la.xiong.tv.injector.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import la.xiong.androidquick.network.RetrofitManager;
import la.xiong.tv.MyApplication;
import la.xiong.tv.injector.module.ApplicationModule;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
@Singleton
@Component(
        modules = {
                ApplicationModule.class
        }
)
public interface ApplicationComponent {
    Context getContext();  // 提供App的Context

    RetrofitManager getRetrofitManager();  //提供http的帮助类

    void inject(MyApplication application);
}
