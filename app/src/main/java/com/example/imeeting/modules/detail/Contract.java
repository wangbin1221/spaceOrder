package com.example.imeeting.modules.detail;

import com.example.imeeting.base.presenter.IPresenter;
import com.example.imeeting.base.view.IView;
import com.example.imeeting.modules.detail.model.DetailResponse;

import java.util.Map;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public interface Contract {
    interface DetailIView extends IView{
        void showDetailData(DetailResponse response);
    }
    interface DetailIPresenter extends IPresenter<DetailIView>{
        void getDetailData(Map<String,String> request);
    }
}
