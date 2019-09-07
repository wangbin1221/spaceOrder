package com.example.imeeting.modules.homepage.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.base.activity.BaseActivity;
import com.example.imeeting.core.constant.Constants;
import com.example.imeeting.modules.homepage.contract.Contract;
import com.example.imeeting.modules.homepage.presenter.HomePagePresenter;
import com.example.imeeting.modules.homepage.ui.fragment.HomeFragment;
import com.example.imeeting.modules.homepage.ui.fragment.MineFragment;
import com.example.imeeting.modules.homepage.ui.fragment.OrderFragment;
import com.example.imeeting.modules.homepage.ui.fragment.StoryFragment;
import com.example.imeeting.utils.ToastUtils;

import butterknife.BindView;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public class HomePageActivity extends BaseActivity<HomePagePresenter> implements Contract.HomepageIView {
   /* @BindView(R.id.toolbar)
    Toolbar toolbar;*/
   /* @BindView(R.id.toolbar_title)
    TextView titleTv;*/
    @BindView(R.id.fl_content)
    FrameLayout contentView;
    @BindView(R.id.bottom_navigation_view)
    BottomNavigationView bottomNavigationView;
    // 首页
    HomeFragment homeFragment;
    StoryFragment storyFragment;
    MineFragment mineFragment;
    OrderFragment orderFragment;
    private int current = 0;
    private int last = -1;
    private static final int HOME_PAGE = 0;
    private static final int ORDER = 1;
    private static final int STORY = 2;
    private static final int MINE = 3;

    private FragmentManager manager = getSupportFragmentManager();

    private long clickTime;

    @Override
    protected void initView() {
        // 默认显示主页
        showFragment(current);
        initBottomView();
    }

    private void initBottomView() {
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.tab_main_pager:
                    showFragment(HOME_PAGE);
                    break;
                case R.id.tab_order:
                    showFragment(ORDER);
                    break;
                case R.id.tab_story:
                    showFragment(STORY);
                    break;
                case R.id.tab_mine:
                    showFragment(MINE);
                    break;
                default:
                    break;
            }
            return true;
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.actvity_homepage;
    }

    @Override
    protected void initToolbar() {
       /* setSupportActionBar(toolbar);
        ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });*/
    }

    @Override
    protected void initEventAndData() {

    }

    private void hideLastFragment(FragmentTransaction transition) {
        switch (last) {
            case HOME_PAGE:
                if (homeFragment != null) {
                    transition.hide(homeFragment);
                }
                break;
            case ORDER:
                if (orderFragment != null) {
                    transition.hide(orderFragment);
                }
                break;
            case STORY:
                if (storyFragment != null) {
                    transition.hide(storyFragment);
                }
                break;
            case MINE:
                if (mineFragment != null) {
                    transition.hide(mineFragment);
                }
                break;
            default:
                break;
        }
    }

    private void showFragment(int currentIndex) {
        FragmentTransaction transaction = manager.beginTransaction();
        last = current;
        hideLastFragment(transaction);
        current = currentIndex;
        switch (currentIndex) {
            case HOME_PAGE:
                if (homeFragment == null) {
                    homeFragment = HomeFragment.newInstance(null);
                    transaction.add(R.id.fl_content, homeFragment);
                }
                transaction.show(homeFragment);
                break;
            case ORDER:
                if (orderFragment == null) {
                    orderFragment = OrderFragment.newInstance(null);
                    transaction.add(R.id.fl_content, homeFragment);
                }
                transaction.show(orderFragment);
                break;
            case STORY:
                if (storyFragment == null) {
                    storyFragment = StoryFragment.newInstance(new Bundle());
                    transaction.add(R.id.fl_content, storyFragment);
                }
                transaction.show(storyFragment);
                break;
            case MINE:
                if (mineFragment == null) {
                    mineFragment = MineFragment.newInstance(null);
                    transaction.add(R.id.fl_content, mineFragment);
                }
                transaction.show(mineFragment);
                break;
            default:
                break;
        }
        transaction.commit();
    }

    @Override
    public void onBackPressedSupport() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            pop();
        } else {
            long currentTime = System.currentTimeMillis();
            if ((currentTime - clickTime) > Constants.DOUBLE_INTERVAL_TIME) {
                ToastUtils.showToast(HomePageActivity.this, getString(R.string.double_click_exit_toast));
                clickTime = System.currentTimeMillis();
            } else {
                finish();
            }
        }
    }
}
