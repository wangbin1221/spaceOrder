package com.example.imeeting.modules.search.contract;

import com.example.imeeting.base.presenter.IPresenter;
import com.example.imeeting.base.view.IView;
import com.example.imeeting.modules.homepage.model.RecommendResponse;

import java.util.List;
import java.util.Map;

/**
 * description:
 * created by wangbin on 2019/6/6
 */
public interface Contract {
    interface SearchIView extends IView{
        void showDatas(List<RecommendResponse.MeetingsBean> beans);
    }
    interface SearchIPresenter extends IPresenter<SearchIView>{
        void search(Map<String, String> map);
    }
}
