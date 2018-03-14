package la.xiong.tv.ui.fragment.home;

import la.xiong.tv.base.BasePresenter;
import la.xiong.tv.base.BaseView;
import la.xiong.tv.bean.HomeModel;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface HomeContract {
    interface View extends BaseView {
        void showLoading();
        void stopLoading();
        void updateData(HomeModel homeModel);
    }

    abstract class Presenter extends BasePresenter<View> {

        public abstract void getData();
    }
}
