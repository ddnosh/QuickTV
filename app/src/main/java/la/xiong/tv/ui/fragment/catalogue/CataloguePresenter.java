package la.xiong.tv.ui.fragment.catalogue;

import android.content.Context;

import java.util.List;

import javax.inject.Inject;

import la.xiong.androidquick.network.retrofit.RetrofitManager;
import la.xiong.tv.MyApplication;
import la.xiong.tv.bean.CategoryModel;
import la.xiong.tv.network.TVApis;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2018/3/28.
 */

public class CataloguePresenter extends CatalogueContract.Presenter {

    private RetrofitManager mRetrofitManager;
    private Context mContext;

    @Inject
    public CataloguePresenter(Context mContext, RetrofitManager mRetrofitManager) {
        this.mContext = mContext;
        this.mRetrofitManager = mRetrofitManager;
    }

    @Override
    public void getCatalogues() {
        addSubscription(mRetrofitManager.createApi(MyApplication.getInstance().getApplicationContext(), TVApis.class)
                .getCategoryModelList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<CategoryModel>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<CategoryModel> categoryModelList) {
                        mView.updateCatalogues(categoryModelList);
                    }
                }));
    }
}
