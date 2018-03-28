package la.xiong.tv.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.glide.transformations.CropCircleTransformation;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import la.xiong.androidquick.tool.ToastUtil;
import la.xiong.androidquick.ui.adapter.CommonAdapter;
import la.xiong.androidquick.ui.adapter.CommonViewHolder;
import la.xiong.tv.R;
import la.xiong.tv.bean.HomeModel;
import la.xiong.tv.bean.LinkObject;
import la.xiong.tv.manager.UserManager;
import la.xiong.tv.ui.activity.play.PlayActivity;
import la.xiong.tv.util.GlideImageLoader;
import la.xiong.tv.util.ScreenUtil;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class HomeAdapter extends BaseMultiItemQuickAdapter<HomeModel.ListBean, BaseViewHolder> {
    private Context mContext;
    private HomeRecommendAdapter mHomeRecommendAdapter;
    private LiveAdapter mHomeLiveAdapter;

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
                Banner mBanner = (Banner) baseViewHolder.getView(R.id.item_home_banner);
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
                break;
            case HomeModel.TYPE_CLASSIFY:
                RecyclerView mRecyclerViewClassify = (RecyclerView) baseViewHolder.getView(R.id.item_classify_rv);
                LinearLayoutManager layoutManager1 = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
                mRecyclerViewClassify.setLayoutManager(layoutManager1);
                final List<HomeModel.AppclassificationBean> appclassification = UserManager.getInstance().getHomeModel().getAppclassification();
                HomeClassifyAdapter adapter = new HomeClassifyAdapter(mContext, R.layout.home_item_classify, appclassification);
                mRecyclerViewClassify.setAdapter(adapter);
                break;
            case HomeModel.TYPE_RECOMMEND:
                baseViewHolder.setText(R.id.item_tv_title, bean.getName());
                baseViewHolder.setOnClickListener(R.id.item_tv_more, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mHomeRecommendAdapter.switchData();
                    }
                });
                RecyclerView mRecyclerViewRecommend = (RecyclerView) baseViewHolder.getView(R.id.item_recommend_rv);
                LinearLayoutManager layoutManager2 = new GridLayoutManager(mContext, 2);
                mRecyclerViewRecommend.setLayoutManager(layoutManager2);
                mHomeRecommendAdapter = new HomeRecommendAdapter(mContext, R.layout.item_live, UserManager.getInstance().getHomeModel().getApprecommendation());
                mRecyclerViewRecommend.setAdapter(mHomeRecommendAdapter);
                break;
            case HomeModel.TYPE_LIVE:
                baseViewHolder.setText(R.id.item_tv_title, "  " + bean.getName());
                GridLayoutManager layoutManager3 = new GridLayoutManager(mContext, 2);
                RecyclerView mRecyclerViewLive = (RecyclerView) baseViewHolder.getView(R.id.item_live_rv);
                mRecyclerViewLive.setLayoutManager(layoutManager3);

                final List<LinkObject> data;
                data = new ArrayList<>();

                String slug = bean.getCategory_slug();
                baseViewHolder.setText(R.id.item_tv_more, "瞅一瞅");
                baseViewHolder.setOnClickListener(R.id.item_tv_more, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ToastUtil.showToast("瞅一瞅");
                    }
                });
                if ("lol".equals(slug)) {
                    for (HomeModel.ApplolBean value : UserManager.getInstance().getHomeModel().getApplol()) {
                        data.add(value.getLink_object());
                    }
                } else if ("beauty".equals(slug)) {
                    for (HomeModel.AppbeautyBean value : UserManager.getInstance().getHomeModel().getAppbeauty()) {
                        data.add(value.getLink_object());
                    }
                } else if ("heartstone".equals(slug)) {
                    for (HomeModel.AppheartstoneBean value : UserManager.getInstance().getHomeModel().getAppheartstone()) {
                        data.add(value.getLink_object());
                    }
                } else if ("huwai".equals(slug)) {
                    for (HomeModel.ApphuwaiBean value : UserManager.getInstance().getHomeModel().getApphuwai()) {
                        data.add(value.getLink_object());
                    }
                } else if ("overwatch".equals(slug)) {
                    for (HomeModel.AppoverwatchBean value : UserManager.getInstance().getHomeModel().getAppoverwatch()) {
                        data.add(value.getLink_object());
                    }
                } else if ("blizzard".equals(slug)) {
                    for (HomeModel.AppblizzardBean value : UserManager.getInstance().getHomeModel().getAppblizzard()) {
                        data.add(value.getLink_object());
                    }
                } else if ("qqfeiche".equals(slug)) {
                    for (HomeModel.AppqqfeicheBean value : UserManager.getInstance().getHomeModel().getAppqqfeiche()) {
                        data.add(value.getLink_object());
                    }
                } else if ("mobilegame".equals(slug)) {
                    for (HomeModel.AppmobilegameBean value : UserManager.getInstance().getHomeModel().getAppmobilegame()) {
                        data.add(value.getLink_object());
                    }
                } else if ("wangzhe".equals(slug)) {
                    for (HomeModel.AppwangzheBean value : UserManager.getInstance().getHomeModel().getAppwangzhe()) {
                        data.add(value.getLink_object());
                    }
                } else if ("dota2".equals(slug)) {
                    for (HomeModel.Appdota2Bean value : UserManager.getInstance().getHomeModel().getAppdota2()) {
                        data.add(value.getLink_object());
                    }
                } else if ("tvgame".equals(slug)) {
                    for (HomeModel.ApptvgameBean value : UserManager.getInstance().getHomeModel().getApptvgame()) {
                        data.add(value.getLink_object());
                    }
                } else if ("webgame".equals(slug)) {
                    for (HomeModel.AppwebgameBean value : UserManager.getInstance().getHomeModel().getAppwebgame()) {
                        data.add(value.getLink_object());
                    }
                } else if ("dnf".equals(slug)) {
                    for (HomeModel.AppdnfBean value : UserManager.getInstance().getHomeModel().getAppdnf()) {
                        data.add(value.getLink_object());
                    }
                } else if ("minecraft".equals(slug)) {
                    for (HomeModel.AppminecraftBean value : UserManager.getInstance().getHomeModel().getAppminecraft()) {
                        data.add(value.getLink_object());
                    }
                }

                mHomeLiveAdapter = new LiveAdapter(mContext, R.layout.item_live, data);
                mRecyclerViewLive.setAdapter(mHomeLiveAdapter);
                break;
        }
    }

    private class HomeClassifyAdapter extends CommonAdapter<HomeModel.AppclassificationBean> {

        public HomeClassifyAdapter(Context context, int layoutId, List<HomeModel.AppclassificationBean> datas) {
            super(context, layoutId, datas);
        }

        @Override
        public void convert(CommonViewHolder holder, final HomeModel.AppclassificationBean appclassificationBean) {
            ImageView image = (ImageView) holder.getView(R.id.item_classify_image);
            Glide.with(mContext)
                    .load(appclassificationBean.getThumb())
                    .bitmapTransform(new CropCircleTransformation(mContext))
                    .into(image);
            holder.setText(R.id.item_classify_name, appclassificationBean.getTitle());

            holder.setOnClickListener(R.id.item_classify_image, new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ToastUtil.showToast(appclassificationBean.getTitle());
                }
            });
        }
    }

    private class HomeRecommendAdapter extends CommonAdapter<HomeModel.ApprecommendationBean> {

        private int mIndex = 0;
        private List<HomeModel.ApprecommendationBean> mAllData;

        public HomeRecommendAdapter(Context context, int layoutId, List<HomeModel.ApprecommendationBean> datas) {
            super(context, layoutId, datas);
            mAllData = datas;
        }

        @Override
        public void convert(CommonViewHolder holder, final HomeModel.ApprecommendationBean apprecommendationBean) {
            ImageView image = (ImageView) holder.getView(R.id.live_item_image);
            ImageView avatar = (ImageView) holder.getView(R.id.live_item_avatar);

            LinkObject link_object = apprecommendationBean.getLink_object();

            Glide.with(mContext)
                    .load(link_object.getThumb())
                    .placeholder(R.mipmap.live_default)
                    .bitmapTransform(new RoundedCornersTransformation(mContext, ScreenUtil.dp2px(mContext, 5), 0))
                    .into(image);

            int view = link_object.getView();
            String text;
            if (view > 10000) {
                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                text = decimalFormat.format(view / (double) 10000) + "W";
            } else {
                text = String.valueOf(view);
            }
            holder.setText(R.id.live_item_count, text);

            Glide.with(mContext)
                    .load(link_object.getAvatar())
                    .placeholder(R.mipmap.img_touxiang_default)
                    .bitmapTransform(new CropCircleTransformation(mContext))
                    .into(avatar);

            holder.setText(R.id.live_item_nick, link_object.getNick());
            holder.setText(R.id.live_item_title, apprecommendationBean.getTitle());
            holder.setOnClickListener(R.id.live_item_image, new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ToastUtil.showToast(apprecommendationBean.getContent());
                }
            });
        }

        @Override
        public int getItemCount() {
            return 2;
        }

        public void switchData() {
            /**
             * 如果是单数，则移除最后一个
             */
            int size = mAllData.size();
            if (size % 2 != 0) {
                mAllData.remove(size - 2);
            }
            mIndex++;
            if (mIndex * 2 == size) {
                mIndex = 0;
            }

            List<HomeModel.ApprecommendationBean> list = mAllData.subList(mIndex * 2, mIndex * 2 + 2);
            update(list);
            notifyDataSetChanged();
        }

        public void update(List<HomeModel.ApprecommendationBean> data) {
            if (data != null) {
                mDatas = data;
                this.notifyDataSetChanged();
            }
        }
    }

    private class LiveAdapter extends CommonAdapter<LinkObject> {

        public LiveAdapter(Context context, int layoutId, List<LinkObject> datas) {
            super(context, layoutId, datas);
        }

        @Override
        public void convert(CommonViewHolder holder, final LinkObject linkObject) {
            ImageView image = (ImageView) holder.getView(R.id.live_item_image);
            TextView count = (TextView) holder.getView(R.id.live_item_count);
            ImageView avatar = (ImageView) holder.getView(R.id.live_item_avatar);
            TextView nick = (TextView) holder.getView(R.id.live_item_nick);
            TextView title = (TextView) holder.getView(R.id.live_item_title);
            Glide.with(mContext)
                    .load(linkObject.getThumb())
                    .bitmapTransform(new RoundedCornersTransformation(mContext, ScreenUtil.dp2px(mContext, 5), 0))
                    .into(image);

            int view = linkObject.getView();
            String text;
            if (view > 10000) {
                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                text = decimalFormat.format(view / (double) 10000) + "W";
            } else {
                text = String.valueOf(view);
            }
            count.setText(text);

            Glide.with(mContext)
                    .load(linkObject.getAvatar())
                    .placeholder(R.mipmap.img_touxiang_default)
                    .bitmapTransform(new CropCircleTransformation(mContext))
                    .into(avatar);

            nick.setText(linkObject.getNick());
            title.setText(linkObject.getTitle());
            holder.setOnClickListener(R.id.live_item_image, new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ToastUtil.showToast(linkObject.getTitle());
                }
            });
        }
    }
}
