package com.example.imeeting.modules.login.contract;

import com.example.imeeting.base.presenter.IPresenter;
import com.example.imeeting.base.view.IView;

/**
 * description:
 * created by wangbin on 2019/6/12
 */
public interface Contract {
    interface LoginActivityIView extends IView{

    }
    interface LoginActivityIPresenter extends IPresenter<LoginActivityIView>{

    }
}
