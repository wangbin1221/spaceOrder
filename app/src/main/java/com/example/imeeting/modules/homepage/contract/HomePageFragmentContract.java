package com.example.imeeting.modules.homepage.contract;

import com.example.imeeting.base.presenter.IPresenter;
import com.example.imeeting.base.view.IView;
import com.example.imeeting.modules.homepage.model.RecommendResponse;

import java.util.List;

/**
 * description:
 * created by wangbin on 2019/6/5
 */
public interface HomePageFragmentContract {
    interface HomePageFragmentIView extends IView{
        void showRecommendDatas(List<RecommendResponse.MeetingsBean> list);
    }
    interface HomePageFragmentIPresenter extends IPresenter<HomePageFragmentIView>{
        void getRecommendDatas();
        void search(String location,int count,int  times);
    }
}
