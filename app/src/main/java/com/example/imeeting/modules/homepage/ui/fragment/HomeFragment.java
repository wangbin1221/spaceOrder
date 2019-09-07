package com.example.imeeting.modules.homepage.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

import com.example.imeeting.R;
import com.example.imeeting.base.fragment.BaseFragment;
import com.example.imeeting.core.constant.Constants;
import com.example.imeeting.modules.detail.model.DetailRequest;
import com.example.imeeting.modules.detail.ui.DeatilActivity;
import com.example.imeeting.modules.homepage.contract.HomePageFragmentContract;
import com.example.imeeting.modules.homepage.model.RecommendResponse;
import com.example.imeeting.modules.homepage.presenter.HomePageFragmentPresenter;
import com.example.imeeting.modules.search.ui.activity.SearchAllActivity;
import com.example.imeeting.utils.CommonUtils;
import com.example.imeeting.view.RecommendDiyView;
import com.example.imeeting.view.TopHomePageView;

import java.util.List;

import butterknife.BindView;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public class HomeFragment extends BaseFragment<HomePageFragmentPresenter> implements HomePageFragmentContract.HomePageFragmentIView {
    @BindView(R.id.diyView_1)
    RecommendDiyView diyView1;
    @BindView(R.id.diyView_2)
    RecommendDiyView diyView2;
    @BindView(R.id.diyView_3)
    RecommendDiyView diyView3;
    @BindView(R.id.diyView_4)
    RecommendDiyView diyView4;
    @BindView(R.id.search_more)
    Button button;
    @BindView(R.id.top_homepageview)
    TopHomePageView topHomePageView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

    }

    @Override
    protected void initView() {
        ((AppCompatActivity) _mActivity).setSupportActionBar(toolbar);
        ActionBar bar = ((AppCompatActivity) _mActivity).getSupportActionBar();
        if (bar != null) {
            bar.setDisplayShowTitleEnabled(false);
        }
        setHasOptionsMenu(true);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(_mActivity, SearchAllActivity.class);
                CommonUtils.jumpUiUtil(_mActivity, intent);
            }
        });
        topHomePageView.setListener(new TopHomePageView.SearchInfoCallback() {
            @Override
            public void callback(String address, String personcount, String stime, String endTime) {
                Intent intent = new Intent(_mActivity, SearchAllActivity.class);
                intent.putExtra(Constants.ADDRESS, address);
                intent.putExtra(Constants.PERSON_COUNT, personcount);
                intent.putExtra(Constants.START_TIME, stime);
                intent.putExtra(Constants.END_TIME, endTime);
                startActivity(intent);
            }
        });
        diyView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lists == null){return;}
                RecommendResponse.MeetingsBean meetingsBean = lists.get(0);
                request.setId(meetingsBean.getId());
                request.setChannel("0");
                // todo
                jumpDetail();
            }
        });
        diyView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lists == null){return;}
                RecommendResponse.MeetingsBean meetingsBean = lists.get(1);
                request.setId(meetingsBean.getId());
                request.setChannel("0");
                // todo
                jumpDetail();
            }
        });
        diyView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lists == null){return;}
                RecommendResponse.MeetingsBean meetingsBean = lists.get(2);
                request.setId(meetingsBean.getId());
                request.setChannel("0");
                // todo
                jumpDetail();
            }
        });
        diyView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lists == null){return;}
                RecommendResponse.MeetingsBean meetingsBean = lists.get(3);
                request.setId(meetingsBean.getId());
                request.setChannel("0");
                // todo
                jumpDetail();
            }
        });
    }
    private DetailRequest request = new DetailRequest();
    private void jumpDetail(){
        Intent intent = new Intent(_mActivity,DeatilActivity.class);
        intent.putExtra(Constants.DETAIL_REQUEST,request);
        startActivity(intent);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_homepage;
    }

    @Override
    protected void initEventAndData() {
        mPresenter.getRecommendDatas();
    }
    private List<RecommendResponse.MeetingsBean> lists;
    @Override
    public void showRecommendDatas(List<RecommendResponse.MeetingsBean> list) {
        this.lists = list;
        if (list.size() == 4) {
            int i = 0;
            diyView1.setData(list.get(i).getImage(), list.get(i).getTitle(), list.get(i++).getPrice());
            diyView2.setData(list.get(i).getImage(), list.get(i).getTitle(), list.get(i++).getPrice());
            diyView3.setData(list.get(i).getImage(), list.get(i).getTitle(), list.get(i++).getPrice());
            diyView4.setData(list.get(i).getImage(), list.get(i).getTitle(), list.get(i++).getPrice());

        }


    }

    public static HomeFragment newInstance(Bundle bundle) {
        //assert (bundle != null);
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }
}
