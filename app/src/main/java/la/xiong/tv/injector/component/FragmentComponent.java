package la.xiong.tv.injector.component;

import android.app.Activity;

import dagger.Component;
import la.xiong.tv.injector.FragmentScope;
import la.xiong.tv.injector.module.FragmentModule;
import la.xiong.tv.ui.fragment.catalogue.CatalogueFragment;
import la.xiong.tv.ui.fragment.home.HomeFragment;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
@FragmentScope
@Component(dependencies = ApplicationComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {

    Activity getActivity();

    void inject(HomeFragment homeFragment);
    void inject(CatalogueFragment catalogueFragment);
}
