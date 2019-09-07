package com.example.imeeting.modules.search.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.modules.search.adapter.LocationAdappter;
import com.example.imeeting.modules.search.model.LocationResponse;
import com.example.imeeting.utils.CommonUtils;

/**
 * description:
 * created by wangbin on 2019/6/8
 */
public class LocationDescView extends LinearLayout {
    ListView listView1;
    ListView listView2;
    TextView tv_shangyequ;
    TextView tv_xingzhengqu;
    TextView tv_ditiexian;
    TextView tv_hot;
    LinearLayout linearLayout1;
    private Context context;
    private LocationAdappter<String> hotadapter;
    private LocationAdappter<LocationResponse.XingzhengquBean> xingzhengquadapter;
    private LocationAdappter<LocationResponse.ShangyequBean> shangyequadapter;
    private LocationAdappter<LocationResponse.DitiexianBean> ditieadapter;
    private LocationAdappter<LocationResponse.DitiexianBean.StationsBean> stationadapter;

    public LocationDescView(Context context) {
        this(context, null, 0);
    }

    public LocationDescView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LocationDescView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView();
    }

    private void initView() {

        LayoutInflater.from(context).inflate(R.layout.view_location_desc, this);
        listView1 = findViewById(R.id.lv_1);
        listView2 = findViewById(R.id.lv_2);
        tv_shangyequ = findViewById(R.id.tv_shangyequ);
        tv_ditiexian = findViewById(R.id.tv_ditiexian);
        tv_hot = findViewById(R.id.tv_hot);
        tv_xingzhengqu = findViewById(R.id.tv_xingzhengqu);
        linearLayout1 = findViewById(R.id.ll_location_1);
        tv_hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFirst(0);
            }
        });
        tv_shangyequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFirst(1);
            }
        });
        tv_xingzhengqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFirst(2);
            }
        });
        tv_ditiexian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFirst(3);
            }
        });
        hotadapter = new LocationAdappter<>(context);
        xingzhengquadapter = new LocationAdappter<LocationResponse.XingzhengquBean>(context) {
            @Override
            protected String getTitle(LocationResponse.XingzhengquBean xingzhengquBean) {
                return xingzhengquBean.getTitle();
            }
        };
        shangyequadapter = new LocationAdappter<LocationResponse.ShangyequBean>(context) {
            @Override
            protected String getTitle(LocationResponse.ShangyequBean shangyequBean) {
                return shangyequBean.getTitle();
            }
        };
        ditieadapter = new LocationAdappter<LocationResponse.DitiexianBean>(context) {
            @Override
            protected String getTitle(LocationResponse.DitiexianBean ditiexianBean) {
                return ditiexianBean.getTitle();
            }
        };
        stationadapter = new LocationAdappter<LocationResponse.DitiexianBean.StationsBean>(context) {
            @Override
            protected String getTitle(LocationResponse.DitiexianBean.StationsBean stationsBean) {
                return stationsBean.getContent();
            }
        };
        setFirst(0);
    }

    private LocationResponse response;

    public void setDatas(LocationResponse response) {
        this.response = response;
    }

    /**
     * 1 是两个 2是一个，三是灭有
     *
     * @param type
     */
    public void setFirst(int type) {
        currentfirst = type;
        switch (type) {
            case 0:
                listView1.setVisibility(INVISIBLE);
                listView2.setVisibility(INVISIBLE);
                listView1.setAdapter(hotadapter);
                break;
            case 1:
                setVisibility(View.VISIBLE);
                listView1.setVisibility(View.VISIBLE);
                listView2.setVisibility(View.GONE);
                LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) linearLayout1.getLayoutParams();
                params.width = CommonUtils.getScreenWidth(context) / 2;
                listView1.getLayoutParams().width = CommonUtils.getScreenWidth(context) / 2;
                shangyequadapter.setDatas(response.getShangyequ());
                listView1.setAdapter(shangyequadapter);
                break;
            case 2:
                setVisibility(View.VISIBLE);
                listView1.setVisibility(View.VISIBLE);
                listView2.setVisibility(View.GONE);
                linearLayout1.getLayoutParams().width = CommonUtils.getScreenWidth(context) / 2;
                listView1.getLayoutParams().width = CommonUtils.getScreenWidth(context) / 2;
                xingzhengquadapter.setDatas(response.getXingzhengqu());
                listView1.setAdapter(xingzhengquadapter);
                break;
            case 3:
                setVisibility(VISIBLE);
                listView1.setVisibility(View.VISIBLE);
                listView2.setVisibility(View.VISIBLE);
                linearLayout1.getLayoutParams().width = CommonUtils.getScreenWidth(context) / 3;
                listView2.getLayoutParams().width = CommonUtils.getScreenWidth(context) / 3;
                listView1.getLayoutParams().width = CommonUtils.getScreenWidth(context)/3;
                ditieadapter.setDatas(response.getDitiexian());
                listView1.setAdapter(ditieadapter);
                // todo

                break;
            default:
                break;

        }

            listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (currentfirst == 3){ // 是地铁
                        currentDitie = position;
                        stationadapter.setDatas(response.getDitiexian().get(currentDitie).getStations());
                        listView2.setAdapter(stationadapter);
                        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                callback.call(response.getDitiexian().get(currentDitie).getStations().get(position).getContent());
                            }
                        });
                    }else {
                        Object o  = listView1.getAdapter().getItem(position);
                        String address;
                        if (o instanceof LocationResponse.XingzhengquBean){
                            address=((LocationResponse.XingzhengquBean)o).getTitle();
                        }else if (o instanceof LocationResponse.ShangyequBean){
                            address=((LocationResponse.ShangyequBean)o).getTitle();
                        }else {
                            address ="";
                        }
                        callback.call(address);
                    }
                }
            });

        //requestLayout();
    }
    private  int currentDitie;
    private int currentfirst = 0;
    private callback callback;
    public void setCallback(callback callback){
        this.callback = callback;
    }
    public interface callback{
        void call(String address);
    }
}
