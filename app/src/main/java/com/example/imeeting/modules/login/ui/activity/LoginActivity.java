package com.example.imeeting.modules.login.ui.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;

import com.example.imeeting.R;
import com.example.imeeting.base.activity.BaseActivity;
import com.example.imeeting.modules.login.contract.Contract;
import com.example.imeeting.modules.login.presenter.LoginActivityPresenter;
import com.example.imeeting.modules.login.ui.fragment.LoginFragment;
import com.example.imeeting.modules.login.ui.fragment.PhoneLoginFragment;

import butterknife.BindView;

/**
 * description:
 * created by wangbin on 2019/6/12
 */
public class LoginActivity extends BaseActivity<LoginActivityPresenter> implements Contract.LoginActivityIView,LoginFragment.LoginStyleListener {
    /**
     * type 为1是手机号登陆
     * @param type
     */
    @Override
    public void callback(int type) {
        if (type == 1){
            if (phoneLoginFragment == null){
                phoneLoginFragment = new PhoneLoginFragment();
            }
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.hide(loginFragment);
            transaction.add(R.id.fl_content,phoneLoginFragment);
            transaction.show(phoneLoginFragment);
            transaction.commit();
        }
    }

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.fl_content)
    FrameLayout frameLayout;
    FragmentManager manager = getSupportFragmentManager();
    LoginFragment loginFragment;
    PhoneLoginFragment phoneLoginFragment;
    @Override
    protected void initView() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initToolbar() {
        setSupportActionBar(toolbar);
        ActionBar bar = getSupportActionBar();
        if (bar != null){
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
        FragmentTransaction transaction = manager.beginTransaction();
        loginFragment = new LoginFragment();
        loginFragment.setLoginStyleListenter(this);
        transaction.add(R.id.fl_content,loginFragment);
        transaction.show(loginFragment);
        transaction.commit();
    }
}
