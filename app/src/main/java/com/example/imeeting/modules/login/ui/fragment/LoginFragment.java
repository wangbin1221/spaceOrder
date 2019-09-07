package com.example.imeeting.modules.login.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.imeeting.R;
import com.example.imeeting.modules.detail.view.BottomView;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.yokeyword.fragmentation.SupportFragment;

/**
 * description:
 * created by wangbin on 2019/6/12
 */
public class LoginFragment extends SupportFragment {
    Button phoneButton;
    Button wxButton;
    public LoginFragment(){}
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.login_select_view,container,false);
        phoneButton = view.findViewById(R.id.login_phone);
        wxButton = view.findViewById(R.id.login_wx);
        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null){
                    listener.callback(1);
                }
            }
        });
        wxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null){
                    listener.callback(2);
                }
            }
        });
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

    }
    private LoginStyleListener listener;
    public void setLoginStyleListenter(LoginStyleListener listenter){
        this.listener = listenter;
    }
    public interface LoginStyleListener{
        void callback(int type);
    }
}
