package com.example.imeeting.modules.search.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.imeeting.R;
import com.example.imeeting.base.OnItemClickListener;
import com.example.imeeting.base.fragment.BaseFragment;
import com.example.imeeting.core.constant.Constants;
import com.example.imeeting.modules.detail.model.DetailRequest;
import com.example.imeeting.modules.detail.ui.DeatilActivity;
import com.example.imeeting.modules.homepage.model.RecommendResponse;
import com.example.imeeting.modules.search.adapter.SearchAdapter;
import com.example.imeeting.modules.search.contract.Contract;
import com.example.imeeting.modules.search.model.Request;
import com.example.imeeting.modules.search.presenter.SearchMorePresenter;
import com.example.imeeting.utils.CommonUtils;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

/**
 * description:
 * created by wangbin on 2019/6/6
 */
public class SearchSingleFragment extends BaseFragment<SearchMorePresenter> implements Contract.SearchIView {
    @BindView(R.id.smart_refresh_layout)
    SmartRefreshLayout mRefreshLayout;
    @BindView(R.id.project_list_recycler_view)
    RecyclerView mRecyclerView;
    SearchAdapter adapter;
    private Map<String, String> map = new HashMap<>();
    private List<RecommendResponse.MeetingsBean> datas ;

    public void setRequestType(Request request) {
        map.put("sortflag", request.getSortflag());
        map.put("address", request.getAddress());
        mPresenter.search(map);
    }

    @Override
    protected void initView() {
        initRecyclerView();
    }

    private void initRecyclerView() {
        List<RecommendResponse.MeetingsBean> list = new ArrayList<>();
        adapter = new SearchAdapter(_mActivity);
        adapter.setItemClickListener(new OnItemClickListener() {
            @Override
            public void clickItem(View view, int pos) {
                if (datas == null || pos <0 || pos >= datas.size()){
                    return ;
                }
                RecommendResponse.MeetingsBean bean = datas.get(pos);
                request.setId(bean.getId());
                request.setChannel("0");
                jumpDetail();
            }

            @Override
            public void clickLong(View view, int pos) {

            }
        });
        adapter.setDatas(list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(_mActivity));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(adapter);
    }
    private DetailRequest request = new DetailRequest();
    private void jumpDetail(){
        Intent intent = new Intent(_mActivity,DeatilActivity.class);
        intent.putExtra(Constants.DETAIL_REQUEST,request);
        startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_project_list;
    }

    @Override
    protected void initEventAndData() {
        Bundle bundle = getArguments();
        if (bundle != null){
           /* map.put("address",bundle.getString(Constants.ADDRESS));
            map.put("timebegin",bundle.getString(Constants.START_TIME));
            map.put("timeend",bundle.getString(Constants.END_TIME));
            map.put("number",bundle.getString(Constants.PERSON_COUNT));*/
            map.put("sortflag",bundle.getString(Constants.TYPE));
        }
        initRefreshLayout();
        mPresenter.search(map);

    }

    private void initRefreshLayout() {
        mRefreshLayout.setOnRefreshListener(refreshLayout -> {
            mPresenter.search(map);
            refreshLayout.finishRefresh();
        });
    }

    @Override
    public void showDatas(List<RecommendResponse.MeetingsBean> beans) {
        if (beans == null || beans.size() == 0) {
            showEmpty();
        }
        this.datas = beans;
        adapter.setDatas(beans);

    }

    public static SearchSingleFragment newInstance(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        SearchSingleFragment fragment = new SearchSingleFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

}
