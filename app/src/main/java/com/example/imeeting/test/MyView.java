package com.example.imeeting.test;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * description:
 * created by wangbin on 2019/6/5
 */
public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == 0){
            Log.d("wangbin",""+event.getAction());
            return true;
        }
        Log.d("wangbin",""+event.getAction());
        return super.onTouchEvent(event);
    }
}
