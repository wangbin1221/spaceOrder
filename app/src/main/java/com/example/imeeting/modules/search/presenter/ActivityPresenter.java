package com.example.imeeting.modules.search.presenter;

import com.example.imeeting.base.presenter.BasePresenter;
import com.example.imeeting.modules.search.contract.ActivityContract;

import javax.inject.Inject;

/**
 * description:
 * created by wangbin on 2019/6/6
 */
public class ActivityPresenter extends BasePresenter<ActivityContract.ActivityIView> implements ActivityContract.ActivityIPresenter {
    @Inject

    public ActivityPresenter() {
    }
}
