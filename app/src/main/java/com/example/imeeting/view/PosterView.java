package com.example.imeeting.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.modules.poster.PoeterModel;
import com.example.imeeting.utils.GlideUtil;

/**
 * description: imeeting 海报view
 * created by wangbin on 2019/6/27
 */
public class PosterView extends LinearLayout {
    private Context context;
    public PosterView(Context context) {
        super(context);
        this.context = context;
        initView();
    }


    public PosterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initView();
    }
    private ImageView bgiv;
    private TextView titleTv;
    private TextView descTv;
    private ImageView iconIv;
    private TextView nameTv;
    private ImageView imeetingIv;
    private ImageView codeIv;
    private void initView() {
        View contentview = LayoutInflater.from(context).inflate(R.layout.view_poster,this);
        bgiv = contentview.findViewById(R.id.iv_bg);
        titleTv = contentview.findViewById(R.id.tv_title);
        descTv = contentview.findViewById(R.id.tv_desc);
        iconIv = contentview.findViewById(R.id.iv_icon);
        nameTv = contentview.findViewById(R.id.tv_name);
        imeetingIv = contentview.findViewById(R.id.iv_immeting_icon);
        codeIv = contentview.findViewById(R.id.iv_code);
    }

    public void setData(PoeterModel model){
        if (model == null) {
            return;
        }
        titleTv.setText(model.title);
        descTv.setText(model.desc);
        nameTv.setText(model.name);
        GlideUtil.loadImage(context,model.bgurl,bgiv,0);
        GlideUtil.loadImage(context,model.codeurl,codeIv,0);
        GlideUtil.loadImage(context,model.iconurl,iconIv,0);
        // todo imeetingicon

    }

}
