package com.example.imeeting.modules.search.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.base.activity.BaseActivity;
import com.example.imeeting.core.constant.Constants;
import com.example.imeeting.core.event.SearchEvent;
import com.example.imeeting.core.event.SearchLocationEvent;
import com.example.imeeting.modules.search.contract.ActivityContract;
import com.example.imeeting.modules.search.model.Request;
import com.example.imeeting.modules.search.presenter.ActivityPresenter;
import com.example.imeeting.modules.search.ui.fragment.SearchSingleFragment;
import com.example.imeeting.modules.search.ui.view.SelectView;
import com.example.imeeting.utils.CommonUtils;

import org.simple.eventbus.EventBus;
import org.simple.eventbus.Subscriber;

import java.util.List;

import butterknife.BindView;

/**
 * description:
 * created by wangbin on 2019/6/6
 */
public class SearchAllActivity extends BaseActivity<ActivityPresenter> implements ActivityContract.ActivityIView {
    @BindView(R.id.tablayout_search)
    TabLayout tabLayout;
    @BindView(R.id.viewpager_search)
    ViewPager viewPager;
    @BindView(R.id.toolbar_title)
    TextView textView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.view_select)
    SelectView selectView;
    SparseArray<SearchSingleFragment> fragmentSparseArray = new SparseArray<>();
    private Request request = new Request(); // 存放请求参数

    @Override
    protected void initView() {
        textView.setText("爱米厅");
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_search_all;
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
        if (getIntent() != null){
            Intent intent = getIntent();
            String address = intent.getStringExtra(Constants.ADDRESS);
            String count = intent.getStringExtra(Constants.PERSON_COUNT);
            String stime = intent.getStringExtra(Constants.START_TIME);
            String endTime = intent.getStringExtra(Constants.END_TIME);
            if (!CommonUtils.stringIsNull(address)){
                request.setAddress(address);
            }
            if (!CommonUtils.stringIsNull(count)){
                request.setNumber(count);
            }
            if (!CommonUtils.stringIsNull(stime)){
                request.setTimebegin(stime);
                request.setTimeend(endTime);
            }
        }
        EventBus.getDefault().register(this);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                SearchSingleFragment fragment = fragmentSparseArray.get(i);
                if (fragment == null) {
                    Bundle bundle = new Bundle();
                    bundle.putString(Constants.TYPE, Constants.SEARCH_TYPE[i]);
                    bundle.putString(Constants.ADDRESS,request.getAddress());
                    bundle.putString(Constants.PERSON_COUNT,request.getNumber());
                    bundle.putString(Constants.START_TIME,request.getTimebegin());
                    bundle.putString(Constants.END_TIME,request.getTimeend());
                    fragment = SearchSingleFragment.newInstance(bundle);
                    fragmentSparseArray.put(i, fragment);
                }
                return fragment;
            }

            @Override
            public int getCount() {
                return Constants.SEARCH_TYPE.length;
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return Constants.SEARCH_TYPE[position];
            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //取消页面切换动画
                viewPager.setCurrentItem(tab.getPosition(), false);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Subscriber
    public void doEvent(SearchEvent event) {
        request.setSortflag(String.valueOf(event.sortBy));
        if (getCurrentFragment() != null) {
            getCurrentFragment().setRequestType(request);
        }
    }

    @Subscriber
    public void doJump(SearchLocationEvent event) {
        Intent i = new Intent(SearchAllActivity.this, SearchLocationActivity.class);
        startActivityForResult(i, 101);
    }

    private SearchSingleFragment getCurrentFragment() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        for (Fragment fragment : fragments) {
            if (fragment != null && fragment.isVisible()) {
                return (SearchSingleFragment) fragment;
            }
        }
        return null;
    }

    @Override
    protected void onDestroy() {
        EventBus.getDefault().unregister(this);
        if (fragmentSparseArray != null) {
            fragmentSparseArray.clear();
            fragmentSparseArray = null;
        }
        super.onDestroy();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 101) {
            if (resultCode == RESULT_OK) {
                request.setAddress(data.getStringExtra(Constants.ADDRESS));
                if (getCurrentFragment() != null) {
                    getCurrentFragment().setRequestType(request);
                }
                selectView.setAddressTitle(request.getAddress());
            }
        }
    }
}
