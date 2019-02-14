package la.xiong.tv;

import android.app.Application;

import io.vov.vitamio.Vitamio;
import la.xiong.androidquick.network.retrofit.RetrofitManager;
import la.xiong.androidquick.tool.ToastUtil;
import la.xiong.tv.injector.component.ApplicationComponent;
import la.xiong.tv.injector.component.DaggerApplicationComponent;
import la.xiong.tv.injector.module.ApplicationModule;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class MyApplication extends Application {

    private static MyApplication INSTANCE;

    @Override
    public void onCreate() {
        super.onCreate();
        //获取全局变量Application
        if (INSTANCE == null) {
            INSTANCE = this;
        }
        //初始化ToastUtil
        ToastUtil.register(this);
        //初始化url
        RetrofitManager.initBaseUrl("http://www.quanmin.tv/json/");
        //vitamio
        Vitamio.isInitialized(this);
    }

    public static synchronized MyApplication getInstance() {
        return INSTANCE;
    }

    //dagger2:get ApplicationComponent
    public static ApplicationComponent getApplicationComponent() {
        return DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(INSTANCE)).build();
    }

}
