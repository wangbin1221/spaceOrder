package com.example.imeeting.modules.homepage.ui.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.base.AbstractAdapter;
import com.example.imeeting.base.fragment.BaseFragment;
import com.example.imeeting.core.constant.Constants;
import com.example.imeeting.modules.homepage.contract.MineContract;
import com.example.imeeting.modules.homepage.presenter.MinePresenter;

import butterknife.BindView;

/**
 * description:
 * created by wangbin on 2019/6/5
 */
public class MineFragment extends BaseFragment<MinePresenter> implements MineContract.MineContractIView {
    @BindView(R.id.iv_user_icon)
    ImageView userIconIv;
    @BindView(R.id.tv_user_name)
    TextView userName;
    @BindView(R.id.tv_user_phone)
    TextView phoneTv;
    @BindView(R.id.rl_mine)
    RecyclerView recyclerView;
    private MineCardAdapter adapter;

    @Override
    protected void initView() {
        adapter = new MineCardAdapter(_mActivity);
        GridLayoutManager manager = new GridLayoutManager(_mActivity, 3);
        manager.setOrientation(GridLayout.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initEventAndData() {

    }

    @Override
    public void setUserInfo(String iconlink, String name, String phone) {

    }

    public static MineFragment newInstance(Bundle bundle) {
        assert (bundle != null);
        MineFragment fragment = new MineFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    static class MineCardAdapter extends AbstractAdapter<MineCardAdapter.ViewHolder, String> {
        class ViewHolder extends RecyclerView.ViewHolder {
            private TextView name;
            private ImageView icon;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                this.name = itemView.findViewById(R.id.tv_mine_item);
                this.icon = itemView.findViewById(R.id.iv_mine_item);
            }
        }

        public MineCardAdapter(Context context) {
            this.context = context;
        }

        private Context context;

        @Override
        protected View inflateview(ViewGroup group) {
            return LayoutInflater.from(context).inflate(R.layout.item_mine, group, false);
        }

        @Override
        protected ViewHolder createVHolder(View view, int type) {
            return new ViewHolder(view);
        }

        @Override
        protected void onBindVHolder(ViewHolder holder, int i) {
            String s = Constants.MINE_ITEM[i];
            holder.name.setText(s);
            Drawable drawable;
            switch (i) {
                case 0:
                    drawable = context.getResources().getDrawable(R.mipmap.cooperate);
                    break;
                case 1:
                    drawable = context.getResources().getDrawable(R.mipmap.order);
                    break;
                case 2:
                    drawable = context.getResources().getDrawable(R.mipmap.redevo);
                    break;
                case 3:
                    drawable = context.getResources().getDrawable(R.mipmap.shoucang);
                    break;
                case 4:
                    drawable = context.getResources().getDrawable(R.mipmap.fenxiang);
                    break;
                case 5:
                    drawable = context.getResources().getDrawable(R.mipmap.invoice);
                    break;
                case 6:
                    drawable = context.getResources().getDrawable(R.mipmap.invite);
                    break;
                case 7:
                    drawable = context.getResources().getDrawable(R.mipmap.xiaoxi);
                    break;
                case 8:
                    drawable = context.getResources().getDrawable(R.mipmap.kefu);
                    break;
                default:
                    drawable = context.getResources().getDrawable(R.mipmap.kefu);
                    break;
            }
            holder.icon.setImageDrawable(drawable);
        }

        @Override
        protected int getItemViewType2(int pos) {
            return 0;
        }

        @Override
        public int getListItemCount() {
            return Constants.MINE_ITEM.length;
        }
    }
}
