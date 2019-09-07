package com.example.imeeting.modules.story.ui.activity;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.SparseArray;
import android.view.View;

import com.example.imeeting.R;
import com.example.imeeting.base.activity.BaseActivity;
import com.example.imeeting.core.constant.Constants;
import com.example.imeeting.modules.story.contract.Contract;
import com.example.imeeting.modules.story.ui.fragment.SingleStoryFragment;
import com.example.imeeting.modules.story.ui.presenter.ActivityStoryPresenter;

import butterknife.BindView;

/**
 * description:
 * created by wangbin on 2019/6/13
 */
public class StoryActivity extends BaseActivity<ActivityStoryPresenter> implements Contract.ActivityIView {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tablayout_story)
    TabLayout tabLayout;
    @BindView(R.id.vp_story)
    ViewPager viewPager;
    private SparseArray<SingleStoryFragment> fragmentSparseArray = new SparseArray<>();
    @Override
    protected void initView() {
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                SingleStoryFragment fragment =fragmentSparseArray.get(i);
                if (fragment != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString(Constants.TYPE,String.valueOf(i));
                    fragment = SingleStoryFragment.newInstance(bundle);
                    fragmentSparseArray.put(i,fragment);
                }
                return fragment;
            }

            @Override
            public int getCount() {
                return Constants.STORY_LIST.length;
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return Constants.STORY_LIST[position];
            }
        });
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_story;
    }

    @Override
    protected void initToolbar() {
        setSupportActionBar(toolbar);
        ActionBar bar = getActionBar();
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

    }
}
