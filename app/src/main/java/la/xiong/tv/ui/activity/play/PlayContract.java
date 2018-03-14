package la.xiong.tv.ui.activity.play;

import la.xiong.tv.base.BasePresenter;
import la.xiong.tv.base.BaseView;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface PlayContract {
    interface View extends BaseView {
        void hideLoading();

        void showLoading();

        void showError(Throwable throwable);

        void setVideoPath(String path);

        void setTitle(String title);
    }

    abstract class Presenter extends BasePresenter<PlayContract.View> {

        public abstract void getVideoInfo(String uid);
    }
}
