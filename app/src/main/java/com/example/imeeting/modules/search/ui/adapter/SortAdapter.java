package com.example.imeeting.modules.search.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.core.constant.Constants;

/**
 * description:
 * created by wangbin on 2019/6/8
 */
public class SortAdapter extends BaseAdapter {
    private Context context;
    public SortAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return Constants.SORT_FIRST.length;
    }

    @Override
    public String getItem(int position) {
        return Constants.SORT_FIRST[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_sort,null);
        ((TextView)view.findViewById(R.id.tv_name_sort)).setText(Constants.SORT_FIRST[position]);
        return view;
    }
}
