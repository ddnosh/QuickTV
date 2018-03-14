package la.xiong.tv.ui.fragment.home;

import android.content.Context;

import javax.inject.Inject;

import la.xiong.androidquick.network.RetrofitManager;
import la.xiong.tv.MyApplication;
import la.xiong.tv.bean.HomeModel;
import la.xiong.tv.network.TVApis;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class HomePresenter extends HomeContract.Presenter {

    private RetrofitManager mRetrofitManager;
    private Context mContext;

    @Inject
    public HomePresenter(Context mContext, RetrofitManager mRetrofitManager) {
        this.mContext = mContext;
        this.mRetrofitManager = mRetrofitManager;
    }

    @Override
    public void getData() {
        addSubscription(mRetrofitManager.createApi(MyApplication.getInstance().getApplicationContext(), TVApis.class)
                .getHomeModel()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomeModel>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(HomeModel homeModel) {
                        mView.updateData(homeModel);
                    }
                }));
    }
}
