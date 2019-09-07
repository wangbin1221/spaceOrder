package com.example.imeeting.modules.homepage.contract;

import com.example.imeeting.base.presenter.IPresenter;
import com.example.imeeting.base.view.IView;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public interface Contract {
    interface HomepageIView extends IView {

    }

    interface HomepageIPresenter extends IPresenter<HomepageIView> {
    }
}
