package com.example.imeeting.modules.story.contract;

import com.example.imeeting.base.presenter.IPresenter;
import com.example.imeeting.base.view.IView;
import com.example.imeeting.modules.story.model.StoryResponse;

import java.util.List;

/**
 * description:
 * created by wangbin on 2019/6/14
 */
public interface SearchStoryActivityContract {
    interface SearchStoryIview extends IView{
        void showSearchHistory(List<String> historys);
        void showGuesslike(List<String> likes);
        void showSearchResult(List<StoryResponse> responses);
    }
    interface SearchStoryIPresenter extends IPresenter<SearchStoryIview>{
        void getGuesslike();
        void getSearchhistory();
        void searchWithKey(String type,String key);
        void add(String s);
    }
}
