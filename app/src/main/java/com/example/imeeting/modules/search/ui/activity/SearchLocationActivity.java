package com.example.imeeting.modules.search.ui.activity;


import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.base.activity.BaseActivity;
import com.example.imeeting.core.constant.Constants;
import com.example.imeeting.modules.search.contract.SearchLocationActivityContract;
import com.example.imeeting.modules.search.model.LocationResponse;
import com.example.imeeting.modules.search.presenter.SearchLocationPresenter;
import com.example.imeeting.modules.search.ui.view.LocationDescView;

import butterknife.BindView;

/**
 * description:
 * created by wangbin on 2019/6/8
 */
public class SearchLocationActivity extends BaseActivity<SearchLocationPresenter> implements SearchLocationActivityContract.SearchLocatonIView {
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.ll_location_2)
    LocationDescView linearLayout2;

    @Override
    protected void initView() {
        linearLayout2.setCallback(new LocationDescView.callback() {
            @Override
            public void call(String address) {
                Intent intent = new Intent();
                intent.putExtra(Constants.ADDRESS,address);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_search_location;
    }

    @Override
    protected void initToolbar() {
        setSupportActionBar(toolbar);
        ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressedSupport();
            }
        });
    }

    @Override
    protected void initEventAndData() {
        mPresenter.getlocationData(null, null); // 为null默认调用南京
    }

    @Override
    public void showLocationData(LocationResponse response) {
        linearLayout2.setDatas(response);
    }
}
