package com.example.imeeting.modules.story.ui.activity;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.base.activity.BaseActivity;
import com.example.imeeting.modules.story.contract.SearchStoryActivityContract;
import com.example.imeeting.modules.story.model.StoryResponse;
import com.example.imeeting.modules.story.presenter.StorySearchPresenter;
import com.example.imeeting.modules.story.ui.fragment.SingleStoryFragment;
import com.example.imeeting.utils.CommonUtils;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * description:
 * created by wangbin on 2019/6/14
 * //todo 优化，在返回之后再插入数据库，防止卡顿
 */
public class SearchStoryActivity extends BaseActivity<StorySearchPresenter> implements SearchStoryActivityContract.SearchStoryIview {
    @BindView(R.id.et_search)
    EditText editText;
    @BindView(R.id.iv_delete)
    ImageView deleteIv;
    @BindView(R.id.tv_cancel)
    TextView cancelTv;
    @BindView(R.id.lv_content)
    ListView listView;
    @BindView(R.id.ll_content)
    LinearLayout linearLayout;
    @BindView(R.id.tag_1)
    TagFlowLayout tagFlowLayout1;
    @BindView(R.id.tag_2)
    TagFlowLayout tagFlowLayout2;
    @BindView(R.id.ll_empty)
    LinearLayout empty;
    private String content;
    private List<String> guesslikes = new ArrayList<>();
    private List<String> historys = new ArrayList<>();
    private SingleStoryFragment.StoryAdapter  adapter;
    private List<StoryResponse> datas;
    private boolean isClick = false;
    @Override
    protected void initView() {
        empty.setVisibility(View.GONE);
        linearLayout.setVisibility(View.VISIBLE);
        listView.setVisibility(View.GONE);
        deleteIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.getText().clear();
                showHistory();
            }
        });
        tagFlowLayout1.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, FlowLayout parent) {
                if (historys.size() == 0 || position >= historys.size()){
                    return false;
                }else {
                    searchWithKey(historys.get(position));
                }
                return false;
            }
        });
        tagFlowLayout2.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, FlowLayout parent) {
                if (guesslikes.size() == 0 || position >= guesslikes.size()){
                    return false;
                }else {
                    addtodb(guesslikes.get(position));
                    searchWithKey(guesslikes.get(position));
                }
                return false;
            }
        });
        adapter = new SingleStoryFragment.StoryAdapter(SearchStoryActivity.this);
        listView.setAdapter(adapter);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                content = String.valueOf(s);
                if (CommonUtils.stringIsNull(content)){
                    deleteIv.setVisibility(View.INVISIBLE);
                    cancelTv.setTextColor(getResources().getColor(R.color.black));
                    cancelTv.setText("取消");
                }else {
                    deleteIv.setVisibility(View.VISIBLE);
                    cancelTv.setTextColor(getResources().getColor(R.color.colorPrimary));
                    cancelTv.setText("搜索");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        cancelTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cancelTv.getText().toString().equals("取消")){
                    finish();
                }else {
                    if (CommonUtils.stringIsNull(content)){
                        return;
                    }
                    searchWithKey(content);
                }

            }
        });
    }

    private void addtodb(String content) {
        editText.setText(content);
        mPresenter.add(content);
    }

    private void showHistory() {
        listView.setVisibility(View.GONE);
        linearLayout.setVisibility(View.VISIBLE);
        empty.setVisibility(View.GONE);
        cancelTv.setText("取消");
        cancelTv.setTextColor(getResources().getColor(R.color.black));
    }

    private void searchWithKey(String key){
        //linearLayout.setVisibility(View.GONE);
        // todo search
        // todo update history
        //editText.setText(key);
        deleteIv.setVisibility(View.VISIBLE);
        cancelTv.setText("搜索");
        cancelTv.setTextColor(getResources().getColor(R.color.colorPrimary));
        mPresenter.searchWithKey("",key);
    }

    @Override
    public void showSearchResult(List<StoryResponse> responses) {
        if (responses == null || responses.size() == 0){
            showcContentEmpty();
        }else {
            showcontent();
            datas = responses;
            adapter.setData(datas);
        }
    }

    private void showcontent() {
        empty.setVisibility(View.GONE);
        listView.setVisibility(View.VISIBLE);
        linearLayout.setVisibility(View.GONE);
    }

    private void showcContentEmpty() {
        listView.setVisibility(View.GONE);
        linearLayout.setVisibility(View.GONE);
        empty.setVisibility(View.VISIBLE);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_search_story;
    }

    @Override
    protected void initToolbar() {

    }

    @Override
    protected void initEventAndData() {
        mPresenter.getGuesslike();
        mPresenter.getSearchhistory();
    }

    @Override
    public void showSearchHistory(List<String> historys) {
        this.historys = historys;
        tagFlowLayout1.setAdapter(new TagAdapter<String>(historys) {
            @Override
            public View getView(FlowLayout parent, int position, String o) {
                    TextView tv = (TextView) LayoutInflater.from(SearchStoryActivity.this)
                            .inflate(R.layout.flow_layout_tv, parent, false);
                    tv.setText(historys.get(position));
                    return tv;
                }
        });
    }

    @Override
    public void showGuesslike(List<String> likes) {
        this.guesslikes = likes;
        tagFlowLayout2.setAdapter(new TagAdapter<String>(likes) {
            @Override
            public View getView(FlowLayout parent, int position, String o) {
                TextView tv = (TextView) LayoutInflater.from(SearchStoryActivity.this)
                        .inflate(R.layout.flow_layout_tv, parent, false);
                tv.setText(likes.get(position));
                return tv;
            }
        });
    }
}
