package com.example.imeeting.modules.search.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.imeeting.R;

import java.util.List;

/**
 * description:
 * created by wangbin on 2019/6/8
 */
public  class LocationAdappter<T> extends BaseAdapter {
    private Context context;
    private List<T> datas;
    public LocationAdappter(Context context){
        this.context = context;
    }
    public void setDatas(List<T> datas){
        this.datas = datas;
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return datas== null ? 0: datas.size();
    }

    @Override
    public T getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_sort,null);
        ((TextView)view.findViewById(R.id.tv_name_sort)).setText(getTitle(datas.get(position)));
        return view;
    }
    protected String getTitle(T t){
        return null;
    };
}
