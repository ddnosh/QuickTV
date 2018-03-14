package la.xiong.tv.ui.adapter;

import android.content.Context;
import android.content.Intent;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

import la.xiong.tv.R;
import la.xiong.tv.bean.HomeModel;
import la.xiong.tv.bean.LinkObject;
import la.xiong.tv.manager.UserManager;
import la.xiong.tv.ui.activity.play.PlayActivity;
import la.xiong.tv.util.GlideImageLoader;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class HomeAdapter extends BaseMultiItemQuickAdapter<HomeModel.ListBean, BaseViewHolder> {
    private Context mContext;


    public HomeAdapter(List<HomeModel.ListBean> data, Context context) {
        super(data);
        this.mContext = context;
        addItemType(HomeModel.TYPE_AD, R.layout.item_home_ad);
        addItemType(HomeModel.TYPE_CLASSIFY, R.layout.item_home_classify);
        addItemType(HomeModel.TYPE_RECOMMEND, R.layout.item_home_recommend);
        addItemType(HomeModel.TYPE_LIVE, R.layout.item_home_live);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, HomeModel.ListBean bean) {
        switch (baseViewHolder.getItemViewType()) {
            case HomeModel.TYPE_AD:
                Banner mBanner = (Banner) baseViewHolder.itemView.findViewById(R.id.item_home_banner);
                final List<HomeModel.AppindexBean> appindex = UserManager.getInstance().getHomeModel().getAppindex();
                List<String> imageUrls = new ArrayList<>();
                List<String> titles = new ArrayList<>();
                for (int i = 0, size = appindex.size(); i < size; i++) {
                    HomeModel.AppindexBean appindexBean = appindex.get(i);
                    LinkObject object = appindexBean.getLink_object();
                    imageUrls.add(object.getRecommend_image());
                    titles.add(object.getTitle());
                }
                mBanner.setOnBannerListener(new OnBannerListener() {
                    @Override
                    public void OnBannerClick(int position) {
                        String uid = appindex.get(position).getLink_object().getUid();
                        Intent intent = new Intent(mContext, PlayActivity.class);
                        intent.putExtra("uid", uid);
                        mContext.startActivity(intent);
                    }
                });

                mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE)
                        .setIndicatorGravity(BannerConfig.RIGHT)
                        .setImageLoader(new GlideImageLoader())
                        .setImages(imageUrls)
                        .setBannerTitles(titles)
                        .setDelayTime(3000)
                        .start();
        }
    }
}
