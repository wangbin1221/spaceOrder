package com.example.imeeting.view;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;

/**
 * description:
 * created by wangbin on 2019/7/27
 */
public class StarView extends AppCompatTextView {
    public StarView(Context context) {
        super(context);
    }

    public StarView(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setText(CharSequence content, BufferType type) {

        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("*");
        spannableString.setSpan(new ForegroundColorSpan(Color.RED),0,1,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.append(spannableString);
        spannableStringBuilder.append(content);
        super.setText(spannableStringBuilder, type);
    }

    public void setText(String content){

    }
}
