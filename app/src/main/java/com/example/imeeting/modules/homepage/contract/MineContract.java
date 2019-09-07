package com.example.imeeting.modules.homepage.contract;

import com.example.imeeting.base.presenter.IPresenter;
import com.example.imeeting.base.view.IView;

/**
 * description:
 * created by wangbin on 2019/6/14
 */
public interface MineContract {
    interface MineContractIView extends IView{
        void setUserInfo(String iconlink,String name,String phone);
    }
    interface  MineContractIPresenter extends IPresenter<MineContractIView>{
        void getUserInfo();
    }
}
