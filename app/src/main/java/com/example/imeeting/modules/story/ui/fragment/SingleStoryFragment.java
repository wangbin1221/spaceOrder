package com.example.imeeting.modules.story.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.base.fragment.BaseFragment;
import com.example.imeeting.core.constant.Constants;
import com.example.imeeting.modules.story.contract.StoryFragmentContract;
import com.example.imeeting.modules.story.model.StoryResponse;
import com.example.imeeting.modules.story.ui.activity.StoryDetailActivity;
import com.example.imeeting.modules.story.ui.presenter.SingleFragmentPresenter;
import com.example.imeeting.utils.CommonUtils;
import com.example.imeeting.utils.GlideUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

/**
 * description:
 * created by wangbin on 2019/6/13
 */
public class SingleStoryFragment extends BaseFragment<SingleFragmentPresenter> implements StoryFragmentContract.StoryfragmentIView {
    @BindView(R.id.lv_story)
    ListView listView;
    private StoryAdapter adapter;
    private View headerView;
    private ImageView headerImage;
    private TextView headerTitle;
    private TextView headerDate;
    private Map<String, String> request = new HashMap<>();
    private List<StoryResponse> datas;

    @Override
    protected void initView() {
        headerView = LayoutInflater.from(_mActivity).inflate(R.layout.header_story, null);
        headerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump2Webview(0);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                jump2Webview(position);
            }
        });
        headerImage = headerView.findViewById(R.id.iv_story);
        headerDate = headerView.findViewById(R.id.tv_date);
        headerTitle = headerView.findViewById(R.id.tv_desc);
    }

    private void jump2Webview(int i) {
        // todo
        if (datas == null) {
            return;
        }
        if (i >= datas.size()) {
            return;
        }
        StoryResponse response = datas.get(i);
        if (response == null || CommonUtils.stringIsNull(response.getLink())){
            return ;
        }
        Intent intent= new Intent(_mActivity,StoryDetailActivity.class);
        intent.putExtra(Constants.LINK,response.getLink());
        startActivity(intent);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_story;
    }

    @Override
    protected void initEventAndData() {
        Bundle bundle = getArguments();
        // assert bundle != null;
        type = bundle.getString(Constants.TYPE, "1");
        request.put(Constants.TYPE, type);
        adapter = new StoryAdapter(_mActivity);
        listView.addHeaderView(headerView);
        listView.setAdapter(adapter);
        mPresenter.getStoryList(request);
    }

    @Override
    public void showStoryList(List<StoryResponse> response) {
        if (response == null || response.size() == 0) {
            return;
        }
        datas = response;
        StoryResponse header = response.get(0);
        GlideUtil.loadImage(_mActivity, header.getImage(), headerImage, 0);
        headerTitle.setText(header.getTitle());
        headerDate.setText(header.getDate());
        adapter.setData(response);
    }

    private String type = "1";

    public static SingleStoryFragment newInstance(Bundle bundle) {
        SingleStoryFragment fragment = new SingleStoryFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    public static class StoryAdapter extends BaseAdapter {
        private List<StoryResponse> datas;

        public StoryAdapter(Context context) {
            this.context = context;
        }

        public void setData(List<StoryResponse> responseList) {
            this.datas = responseList;
            notifyDataSetChanged();
        }

        Context context;

        @Override
        public int getCount() {
            return datas == null ? 0 : datas.size() - 1;
        }

        @Override
        public StoryResponse getItem(int position) {
            return datas.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.item_story, null);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            } else {
                holder = ((ViewHolder) convertView.getTag());
            }
            StoryResponse item = datas.get(position);
            if (item == null) {
                return null;
            }
            holder.dateTv.setText(item.getDate());
            holder.titleTv.setText(item.getTitle());
            GlideUtil.loadImage(context, item.getImage(), holder.imageView, CommonUtils.dip2px(context, 38));
            return convertView;
        }

        class ViewHolder {
            ImageView imageView;
            TextView titleTv;
            TextView dateTv;

            public ViewHolder(View view) {
                imageView = view.findViewById(R.id.iv_icon);
                titleTv = view.findViewById(R.id.tv_title);
                dateTv = view.findViewById(R.id.tv_date);
            }
        }
    }

}
