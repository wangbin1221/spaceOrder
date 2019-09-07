package com.example.imeeting.modules.homepage.presenter;

import com.example.imeeting.base.presenter.BasePresenter;
import com.example.imeeting.modules.homepage.contract.Contract;

import javax.inject.Inject;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public class HomePagePresenter extends BasePresenter<Contract.HomepageIView> implements Contract.HomepageIPresenter {

    @Inject

    public HomePagePresenter() {
    }
}
