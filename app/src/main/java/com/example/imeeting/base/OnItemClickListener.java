package com.example.imeeting.base;

import android.view.View;

/**
 * description:
 * created by wangbin on 2019/4/26
 */
public interface OnItemClickListener {
    void clickItem(View view, int pos);
    void clickLong(View view, int pos);
}
