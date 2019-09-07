package com.example.imeeting.modules.login.presenter;

import com.example.imeeting.base.presenter.BasePresenter;
import com.example.imeeting.modules.login.contract.Contract;

import javax.inject.Inject;

/**
 * description:
 * created by wangbin on 2019/6/12
 */
public class LoginActivityPresenter extends BasePresenter<Contract.LoginActivityIView> implements Contract.LoginActivityIPresenter {
    @Inject
    public LoginActivityPresenter(){};
}
