package com.example.imeeting.modules.story.presenter;

import com.example.imeeting.base.presenter.BasePresenter;
import com.example.imeeting.modules.homepage.contract.Contract;

import javax.inject.Inject;

/**
 * description:
 * created by wangbin on 2019/6/13
 */
public class StoryPresenter extends BasePresenter<Contract.HomepageIView> implements Contract.HomepageIPresenter {
    @Inject
    public StoryPresenter(){

    }
}
