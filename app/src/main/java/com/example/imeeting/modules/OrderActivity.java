package com.example.imeeting.modules;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.SupportActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.modules.detail.model.OrderInputDetail;

import butterknife.BindView;

/**
 * description:
 * created by wangbin on 2019/7/27
 */
public class OrderActivity extends AppCompatActivity {

    private OrderInputDetail detail;
    @BindView(R.id.iv_icon)
    public ImageView iconIv;
    @BindView(R.id.tv_title)
    public TextView titleTv;
    @BindView(R.id.tv_price)
    public TextView priceTv;
    @BindView(R.id.tv_time)
    public EditText timeEt;
    @BindView(R.id.tv_person_count)
    EditText countEt;
    @BindView(R.id.tv_person_name)
    public EditText name;
    @BindView(R.id.tv_phone)
    EditText phone;
    @BindView(R.id.et_info)
    EditText info;
    @BindView(R.id.bt_submit)
    Button submit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_order);
        detail = (OrderInputDetail) getIntent().getSerializableExtra("detail");
        initView();
    }
    private void initView(){

    }
}
