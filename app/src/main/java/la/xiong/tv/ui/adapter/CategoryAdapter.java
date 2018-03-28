package la.xiong.tv.ui.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import la.xiong.androidquick.ui.adapter.CommonAdapter;
import la.xiong.androidquick.ui.adapter.CommonViewHolder;
import la.xiong.tv.R;
import la.xiong.tv.bean.CategoryModel;
import la.xiong.tv.util.ScreenUtil;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class CategoryAdapter extends CommonAdapter<CategoryModel> {

    public CategoryAdapter(Context context, int layoutId, List<CategoryModel> datas) {
        super(context, layoutId, datas);
    }

    @Override
    public void convert(CommonViewHolder holder, CategoryModel categoryModel) {
        ImageView image = (ImageView) holder.getView(R.id.item_category_image);
        TextView name = (TextView) holder.getView(R.id.item_category_name);
        Glide.with(mContext)
                .load(categoryModel.getThumb())
                .bitmapTransform(new RoundedCornersTransformation(mContext, ScreenUtil.dp2px(mContext, 4), 0))
                .into(image);
        name.setText(categoryModel.getName());
    }
}
