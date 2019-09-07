package com.example.imeeting.modules.detail.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.imeeting.R;
import com.example.imeeting.utils.CommonUtils;

/**
 * description:
 * created by wangbin on 2019/6/10
 */
public class MyLindicator extends LinearLayout {
    public MyLindicator(Context context) {
        this(context,null,0);
    }

    public MyLindicator(Context context, AttributeSet attrs) {
        this(context,attrs,0);
    }

    public MyLindicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView();
    }
    private void initView(){
        setOrientation(HORIZONTAL);
        setGravity(Gravity.CENTER_VERTICAL);
    }
    private int num;
    private Context context;
    private GradientDrawable greydrawable;
    private GradientDrawable blackdrawable;
    public void setNum(int num){
        this.num = num;
        greydrawable =new GradientDrawable();
        greydrawable.setShape(GradientDrawable.RECTANGLE);
        greydrawable.setGradientType(GradientDrawable.RECTANGLE);
        greydrawable.setCornerRadius(CommonUtils.dip2px(context,4));
        greydrawable.setColor(getResources().getColor(R.color.Grey400));
        blackdrawable =new GradientDrawable();
        blackdrawable.setShape(GradientDrawable.RECTANGLE);
        blackdrawable.setGradientType(GradientDrawable.RECTANGLE);
        blackdrawable.setCornerRadius(CommonUtils.dip2px(context,4));
        blackdrawable.setColor(getResources().getColor(R.color.black));
        for (int i = 0;i< num;i++){
            View view  =  new View(context);

            view.setBackground(greydrawable);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(CommonUtils.dip2px(context,8),CommonUtils.dip2px(context,8));
            params.leftMargin = CommonUtils.dip2px(context,3);
            addView(view,params);
        }
        setSelectNum(0);
    }
    public void setSelectNum(int target){
        View childView;
       for (int  i = 0;i<num;i++){
           childView = getChildAt(i);
           if (i == target){
               childView.setBackground(blackdrawable);
           }else {
               childView.setBackground(greydrawable);
           }
       }
    }
}
