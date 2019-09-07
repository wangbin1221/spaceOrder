package com.example.imeeting.modules.homepage.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;

import com.example.imeeting.R;
import com.example.imeeting.base.fragment.BaseFragment;
import com.example.imeeting.core.constant.Constants;
import com.example.imeeting.modules.homepage.contract.Contract;
import com.example.imeeting.modules.homepage.presenter.HomePagePresenter;
import com.example.imeeting.modules.story.ui.activity.SearchStoryActivity;
import com.example.imeeting.modules.story.ui.fragment.SingleStoryFragment;

import butterknife.BindView;

/**
 * description:
 * created by wangbin on 2019/6/5
 */
public class StoryFragment extends BaseFragment<HomePagePresenter> implements Contract.HomepageIView {
    @BindView(R.id.tablayout_story)
    TabLayout tabLayout;
    @BindView(R.id.vp_story)
    ViewPager viewPager;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.iv_search)
    ImageView searchIv;
    private SparseArray<SingleStoryFragment> fragmentSparseArray = new SparseArray<>();

    public static StoryFragment newInstance(Bundle bundle) {
        assert (bundle != null);
        StoryFragment fragment = new StoryFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected void initView() {
        ((AppCompatActivity) _mActivity).setSupportActionBar(toolbar);
        ActionBar bar = ((AppCompatActivity) _mActivity).getSupportActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);
            bar.setDisplayShowTitleEnabled(true);
        }
        setHasOptionsMenu(true);
        viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                SingleStoryFragment fragment = fragmentSparseArray.get(i);
                if (fragment == null) {
                    Bundle bundle = new Bundle();
                    bundle.putString(Constants.TYPE, String.valueOf(i));
                    fragment = SingleStoryFragment.newInstance(bundle);
                    fragmentSparseArray.put(i, fragment);
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
        searchIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(_mActivity,SearchStoryActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_story;
    }

    @Override
    protected void initEventAndData() {

    }


}
