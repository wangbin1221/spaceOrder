package com.example.imeeting.modules.story.contract;

import com.example.imeeting.base.presenter.IPresenter;
import com.example.imeeting.base.view.IView;
import com.example.imeeting.modules.story.model.StoryResponse;

import java.util.List;
import java.util.Map;

/**
 * description:
 * created by wangbin on 2019/6/13
 */
public interface StoryFragmentContract {
    interface StoryfragmentIView extends IView{
        void showStoryList(List<StoryResponse> response);
    }
    interface StroyfragmentIPresenter extends IPresenter<StoryfragmentIView>{
        void getStoryList(Map<String,String> map);
    }
}
