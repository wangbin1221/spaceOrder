package com.example.imeeting.modules.search.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.base.AbstractAdapter;
import com.example.imeeting.modules.homepage.model.RecommendResponse;
import com.example.imeeting.utils.CommonUtils;
import com.example.imeeting.utils.GlideUtil;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

/**
 * description:
 * created by wangbin on 2019/6/6
 */
public class SearchAdapter extends AbstractAdapter<SearchAdapter.ViewHolder,RecommendResponse.MeetingsBean> {
    public SearchAdapter(Context context){
        this.context = context;
    }
    private Context context;
    @Override
    protected View inflateview(ViewGroup group) {
        return LayoutInflater.from(context).inflate(R.layout.item_search_list,group,false);
    }

    @Override
    protected ViewHolder createVHolder(View view, int type) {
        return new ViewHolder(view);
    }

    @Override
    protected void onBindVHolder(ViewHolder holder, int i) {
        RecommendResponse.MeetingsBean item = datas.get(i);
        if (item == null){
            return;
        }
        holder.nameTv.setText(item.getTitle());
        StringBuffer buffer = new StringBuffer();
        if (!CommonUtils.stringIsNull(item.getMianji())){
            buffer.append("面积").append(item.getMianji()).append(" ");
        }
        if (!CommonUtils.stringIsNull(item.getFitnumber())){
            buffer.append("最大").append(item.getFitnumber()).append("人 ");
        }
        if (!CommonUtils.stringIsNull(item.getScore())){
            buffer.append(item.getScore()).append("分");
        }
        holder.descTv.setText(buffer.toString());
        holder.distanceTv.setText(item.getShangyequ().substring(0,item.getShangyequ().length()-1));
        SpannableStringBuilder builder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(context.getString(R.string.price,item.getPrice()));
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.colorPrimary)),0,spannableString.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new AbsoluteSizeSpan(14,true),0,spannableString.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        SpannableString spannableString1 = new SpannableString(context.getString(R.string.price,item.getShop()));
        spannableString1.setSpan(new ForegroundColorSpan(context.getColor(R.color.Grey400)),0,spannableString1.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString1.setSpan(new StrikethroughSpan(),0,spannableString1.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString1.setSpan(new AbsoluteSizeSpan(12,true),0,spannableString1.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        holder.priceTv.setText(builder.append(spannableString).append(spannableString1));
        GlideUtil.loadImage(context,item.getImage(),holder.imageView,20);
        String[] strings = item.getRecommend().split(",");
        if(item.getRecommend() == null || "".equals(item.getRecommend())|| strings.length == 0){
            holder.tagFlowLayout.setVisibility(View.GONE);
            return ;
        }else {
            holder.tagFlowLayout.setVisibility(View.VISIBLE);
        }
        holder.tagFlowLayout.setAdapter(new TagAdapter<String>(strings) {
            @Override
            public View getView(FlowLayout parent, int position, String o) {
                TextView tv = (TextView) LayoutInflater.from(context)
                        .inflate(R.layout.flow_layout_tv, parent, false);
                    tv.setText(strings[position]);
                    tv.setTextColor(CommonUtils.getRandomColor());
                return tv;
            }
        });
    }

    @Override
    protected int getItemViewType2(int pos) {
        return 0;
    }

    @Override
    public int getListItemCount() {
        return datas == null ? 0: datas.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTv;
        TextView descTv;
        TextView priceTv;
        TextView distanceTv;
        ImageView imageView;
        TagFlowLayout tagFlowLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTv = itemView.findViewById(R.id.tv_name);
            descTv = itemView.findViewById(R.id.tv_desc);
            priceTv = itemView.findViewById(R.id.tv_price);
            distanceTv = itemView.findViewById(R.id.tv_distance);
            imageView = itemView.findViewById(R.id.iv_search);
            tagFlowLayout = itemView.findViewById(R.id.tag_view);
            tagFlowLayout.invalidate();
        }
    }
}
