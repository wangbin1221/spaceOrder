package com.example.imeeting.modules.detail.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.HashMap;
import java.util.LinkedHashMap;


/**
 * description:
 * created by wangbin on 2019/6/10
 */
public class MyViewPager extends ViewPager {
    /**
     * 保存position与对于的View
     */
    private HashMap<Integer, View> mChildrenViews = new LinkedHashMap<Integer, View>();
    private boolean scrollable = true;
    private Context context;
    private int duration = 3000;
    private int current = 0;
    private int count;

    public MyViewPager(@NonNull Context context) {
        this(context, null);
    }

    public MyViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initView();
    }

    private void initView() {
    }

    private Handler handler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };
    private Runnable task = new Runnable() {
        @Override
        public void run() {
            if (count > 1) {
                current = (current + 1) % count;
//                Log.i(tag, "curr:" + currentItem + " count:" + count);
                setCurrentItem(current);
                postDelayed(task, duration);
            }
        }
    };

    public void startAutoPlay() {
        handler.removeCallbacks(task);
        handler.postDelayed(task, duration);
    }

    public void stopAutoPlay() {
        handler.removeCallbacks(task);
    }

    public void setCount(int i) {
        count = i;
        setScrollable(count > 1);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (this.scrollable) {
            if (getCurrentItem() == 0 && getChildCount() == 0) {
                return false;
            }
            return super.onTouchEvent(ev);
        } else {
            return false;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (this.scrollable) {
            if (getCurrentItem() == 0 && getChildCount() == 0) {
                return false;
            }
            return super.onInterceptTouchEvent(ev);
        } else {
            return false;
        }
    }

    public void setScrollable(boolean scrollable) {
        this.scrollable = scrollable;
    }

}
