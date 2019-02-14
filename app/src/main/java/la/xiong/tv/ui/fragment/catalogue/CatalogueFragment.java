package la.xiong.tv.ui.fragment.catalogue;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import la.xiong.tv.R;
import la.xiong.tv.base.BaseTFragment;
import la.xiong.tv.bean.CategoryModel;
import la.xiong.tv.ui.adapter.CategoryAdapter;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class CatalogueFragment extends BaseTFragment<CataloguePresenter> implements CatalogueContract.View{

    @BindView(R.id.rv_category)
    RecyclerView mCategoryRv;
    private CategoryAdapter mAdapter;
    private List<CategoryModel> categoryModelList;

    public static CatalogueFragment newInstance() {
        Bundle args = new Bundle();
        CatalogueFragment fragment = new CatalogueFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initViewsAndEvents() {
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 3);
        mCategoryRv.setLayoutManager(layoutManager);
        categoryModelList = new ArrayList<>();
        mAdapter = new CategoryAdapter(getContext(), R.layout.item_catalogue, categoryModelList);
        mCategoryRv.setAdapter(mAdapter);
        mPresenter.getCatalogues();
    }

    @Override
    protected void initInjector() {
        getFragmentComponent().inject(this);
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_catalogue;
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
    public void updateCatalogues(List<CategoryModel> data) {
        categoryModelList.addAll(data);
        mAdapter.notifyDataSetChanged();
    }
}
