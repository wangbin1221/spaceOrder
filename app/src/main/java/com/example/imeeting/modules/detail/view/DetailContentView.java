package com.example.imeeting.modules.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.youth.banner.BannerConfig;

import java.util.List;

/**
 * description:
 * created by wangbin on 2019/6/9
 */
public class DetailContentView extends ScrollView {
    private LinearLayout indicator;
    private LinearLayout indicatorInside;
    private int count = 0;
    private List<ImageView> indicatorImages;
    private Context context;

    public DetailContentView(Context context) {
        super(context);
        this.context = context;
        initvView();
    }

    private void initvView() {
    }

    public DetailContentView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initvView();
    }

    public DetailContentView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initvView();
    }

    /*private void createIndicator() {
        indicatorImages.clear();
        indicator.removeAllViews();
        indicatorInside.removeAllViews();
        for (int i = 0; i < count; i++) {
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(12, 12);
            params.leftMargin = 16;
            params.rightMargin = 16;
            if (i == 0) {
                imageView.setImageResource(mIndicatorSelectedResId);
            } else {
                imageView.setImageResource(mIndicatorUnselectedResId);
            }
            indicatorImages.add(imageView);
            indicator.addView(imageView, params);
        }
    }*/


}
