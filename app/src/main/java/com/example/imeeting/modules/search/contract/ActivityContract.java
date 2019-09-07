package com.example.imeeting.modules.search.contract;

import com.example.imeeting.base.presenter.IPresenter;
import com.example.imeeting.base.view.IView;

/**
 * description:
 * created by wangbin on 2019/6/6
 */
public interface ActivityContract {
    interface ActivityIView extends IView{

    }
    interface ActivityIPresenter extends IPresenter<ActivityIView>{

    }
}
