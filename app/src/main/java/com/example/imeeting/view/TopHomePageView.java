package com.example.imeeting.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

import com.example.imeeting.R;

/**
 * description:
 * created by wangbin on 2019/6/6
 */
public class TopHomePageView extends FrameLayout {
    private EditText editText;
    private Context context;
    private Button sureSearch;
    public TopHomePageView(Context context) {
        super(context);
        this.context = context;
        initView();
    }

    private void initView() {
        LayoutInflater.from(context).inflate(R.layout.view_header,this);
        editText = findViewById(R.id.et_person_count);
        sureSearch = findViewById(R.id.bt_search);
        sureSearch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (check()){
                    if (callback != null){
                        callback.callback(address,personCount,starttime,endtime);
                    }
                }
            }
        });
    }

    private boolean check() {
        // todo 正则匹配是否输入正确的人数
        return true;
    }

    public TopHomePageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initView();
    }

    public TopHomePageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView();
    }
    private SearchInfoCallback callback;
    private String address;
    private String personCount;
    private String starttime;
    private String endtime;
    public void setListener(SearchInfoCallback callback){
        this.callback =  callback;
    }
    public interface SearchInfoCallback{
        void callback(String address,String personcount,String starttime,String endTime);
    }
}
