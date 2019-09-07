package com.example.imeeting.modules.homepage.presenter;

import com.example.imeeting.base.presenter.BasePresenter;
import com.example.imeeting.modules.homepage.contract.MineContract;

import javax.inject.Inject;

/**
 * description:
 * created by wangbin on 2019/6/14
 */
public class MinePresenter extends BasePresenter<MineContract.MineContractIView> implements MineContract.MineContractIPresenter {
    @Inject
    public MinePresenter(){}
    @Override
    public void getUserInfo() {
        // todo
    }
}
