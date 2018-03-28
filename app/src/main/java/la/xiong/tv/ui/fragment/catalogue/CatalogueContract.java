package la.xiong.tv.ui.fragment.catalogue;

import java.util.List;

import la.xiong.tv.base.BasePresenter;
import la.xiong.tv.base.BaseView;
import la.xiong.tv.bean.CategoryModel;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface CatalogueContract {
    interface View extends BaseView {
        void showLoading();
        void stopLoading();
        void updateCatalogues(List<CategoryModel> data);
    }

    abstract class Presenter extends BasePresenter<View> {

        public abstract void getCatalogues();
    }
}
