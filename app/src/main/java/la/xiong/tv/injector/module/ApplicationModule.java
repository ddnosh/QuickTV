package la.xiong.tv.injector.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import la.xiong.androidquick.network.RetrofitManager;
import la.xiong.tv.MyApplication;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
@Module
public class ApplicationModule {
    private final Context context;

    public ApplicationModule(MyApplication context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return context;
    }

    @Provides
    @Singleton
    RetrofitManager provideRetrofitManager() {
        return new RetrofitManager();
    }
}
