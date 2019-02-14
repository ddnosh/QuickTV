package la.xiong.tv.ui.fragment.home;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import la.xiong.tv.R;
import la.xiong.tv.base.BaseTFragment;
import la.xiong.tv.bean.HomeModel;
import la.xiong.tv.manager.UserManager;
import la.xiong.tv.ui.adapter.HomeAdapter;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class HomeFragment extends BaseTFragment<HomePresenter> implements HomeContract.View{

    @BindView(R.id.rv_home)
    RecyclerView mRecyclerView;

    private List<HomeModel.ListBean> beanList;

    private HomeAdapter mHomeAdapter;

    public static HomeFragment newInstance() {
        Bundle args = new Bundle();
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initViewsAndEvents() {
        beanList = new ArrayList<>();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(mHomeAdapter = new HomeAdapter(beanList, getActivity()));
        mHomeAdapter.setEnableLoadMore(true);
        mHomeAdapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        mPresenter.getData();
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initInjector() {
        getFragmentComponent().inject(this);
    }

    @Override
    public void showLoading() {
        showLoadingDialog();
    }

    @Override
    public void stopLoading() {
        dismissLoadingDialog();
    }

    @Override
    public void updateData(HomeModel homeModel) {
        UserManager.getInstance().setHomeModel(homeModel);
        for (int i = 0; i < homeModel.getList().size(); i++) {
            HomeModel.ListBean listBean = homeModel.getList().get(i);
            String name = listBean.getSlug();
            if ("app-index".equals(name)) {
                listBean.itemType = HomeModel.ListBean.TYPE_AD;
            } else if ("app-classification".equals(name)) {
                listBean.itemType = HomeModel.ListBean.TYPE_CLASSIFY;
            } else if ("app-recommendation".equals(name)) {
                listBean.itemType = HomeModel.ListBean.TYPE_RECOMMEND;
            } else {
                listBean.itemType = HomeModel.ListBean.TYPE_LIVE;
            }
        }
        mHomeAdapter.setNewData(homeModel.getList());
    }
}
