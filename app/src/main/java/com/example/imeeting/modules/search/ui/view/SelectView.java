package com.example.imeeting.modules.search.ui.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.core.constant.Constants;
import com.example.imeeting.core.event.SearchEvent;
import com.example.imeeting.core.event.SearchLocationEvent;
import com.example.imeeting.modules.search.ui.adapter.SortAdapter;
import com.example.imeeting.utils.CommonUtils;

import org.simple.eventbus.EventBus;

/**
 * description:
 * created by wangbin on 2019/6/6
 */
public class SelectView extends LinearLayout {
    private TextView timeTv;
    private TextView loactionTv;
    private TextView sortTv;
    private TextView chooseTv;
    private Context context;
    private ListView listView;
    private LinearLayout linearLayout;
    private PopupWindow window;
    private String addressTitle;
    public SelectView(Context context) {
        super(context);
        this.context = context;
        initview();
    }
    public void setAddressTitle(String title){
        this.addressTitle = title;
        loactionTv.setText(title);
    }
    private void initview() {
        LayoutInflater.from(context).inflate(R.layout.view_select,this);
        linearLayout = findViewById(R.id.ll_sort);
        timeTv = findViewById(R.id.tv_time);
        loactionTv = findViewById(R.id.tv_location);
        sortTv = findViewById(R.id.tv_sort);
        chooseTv = findViewById(R.id.tv_choose);
        View list = LayoutInflater.from(context).inflate(R.layout.view_sort,null);
        listView = list.findViewById(R.id.lv_sort);
        listView.setAdapter(new SortAdapter(context));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                sortTv.setText(Constants.SORT_FIRST[position]);
                if (window != null){
                    window.dismiss();
                }
                sendEvent(String.valueOf(position));
            }
        });
        loactionTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new SearchLocationEvent());
            }
        });
        sortTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                window = CommonUtils.showPopupWindowFromUpToDown(list,linearLayout);

            }
        });
    }

    public SelectView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initview();
    }

    public SelectView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initview();
    }
    private void sendEvent(String type){
        EventBus.getDefault().post(new SearchEvent(type));
    }

}
