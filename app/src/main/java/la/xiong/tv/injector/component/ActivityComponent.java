package la.xiong.tv.injector.component;

import android.app.Activity;
import android.content.Context;

import dagger.Component;
import la.xiong.tv.injector.ActivityScope;
import la.xiong.tv.injector.module.ActivityModule;
import la.xiong.tv.ui.activity.play.PlayActivity;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {

    Activity getActivity();
    Context getContext();

    void inject(PlayActivity playActivity);
}
