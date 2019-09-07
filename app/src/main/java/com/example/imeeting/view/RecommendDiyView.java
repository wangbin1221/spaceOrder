package com.example.imeeting.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.utils.GlideUtil;

/**
 * description:
 * created by wangbin on 2019/6/6
 */
public class RecommendDiyView extends LinearLayout {
    private Context context;
    private ImageView imageViewByXfermode;
    private TextView titleTv;
    private TextView priceTv;
    public RecommendDiyView(Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public RecommendDiyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initView();
    }

    private void initView() {
        LayoutInflater.from(context).inflate(R.layout.item_recommend,this);
        imageViewByXfermode = findViewById(R.id.iv_recommend);
        priceTv = findViewById(R.id.tv_price);
        titleTv = findViewById(R.id.tv_title);
        setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void setData(String url,String title,String price){
        GlideUtil.loadImage(context,url,imageViewByXfermode,12);
        titleTv.setText(title);
        priceTv.setText(context.getString(R.string.price,price));
    }
    public RecommendDiyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView();
    }
}
