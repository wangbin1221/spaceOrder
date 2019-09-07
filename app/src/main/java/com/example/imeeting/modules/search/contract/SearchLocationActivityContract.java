package com.example.imeeting.modules.search.contract;

import com.example.imeeting.base.presenter.IPresenter;
import com.example.imeeting.base.view.IView;
import com.example.imeeting.modules.search.model.LocationResponse;

/**
 * description:
 * created by wangbin on 2019/6/8
 */
public interface SearchLocationActivityContract {
    interface SearchLocatonIView extends IView{
        void showLocationData(LocationResponse response);
    }
    interface SearchLocationPresenter extends IPresenter<SearchLocatonIView>{
        void getlocationData(String openId,String city);
    }

}
