package com.example.imeeting.modules.login.ui.fragment;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.imeeting.R;
import com.example.imeeting.app.IMeetingApplication;
import com.example.imeeting.core.DataManager;
import com.example.imeeting.core.event.RegisterEvent;
import com.example.imeeting.modules.login.model.LoginModel;
import com.example.imeeting.utils.CommonUtils;
import com.example.imeeting.utils.NetUtils;
import com.example.imeeting.utils.SDKUtils;

import org.simple.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import me.yokeyword.fragmentation.SupportFragment;

/**
 * description:
 * created by wangbin on 2019/6/12
 */
public class PhoneLoginFragment extends SupportFragment {
    TextInputLayout phoneinput;
    Button getcodeButton;
    TextInputLayout codeinput;
    Button loginbutton;
    private String phonenumber;
    private String code;
    EventHandler eventHandler = new EventHandler() {
        public void afterEvent(int event, int result, Object data) {
            // afterEvent会在子线程被调用，因此如果后续有UI相关操作，需要将数据发送到UI线程
            Message msg = new Message();
            msg.arg1 = event;
            msg.arg2 = result;
            msg.obj = data;
            new Handler(Looper.getMainLooper(), new Handler.Callback() {
                @Override
                public boolean handleMessage(Message msg) {
                    int event = msg.arg1;
                    int result = msg.arg2;
                    Object data = msg.obj;
                    if (event == SMSSDK.EVENT_GET_VERIFICATION_CODE) {
                        if (result == SMSSDK.RESULT_COMPLETE) {
                            // TODO 处理成功得到验证码的结果
                            //callback.sendSuccess();
                            Toast.makeText(_mActivity,"code send success",Toast.LENGTH_LONG).show();
                            // 请注意，此时只是完成了发送验证码的请求，验证码短信还需要几秒钟之后才送达
                        } else {
                            // TODO 处理错误的结果
                            Toast.makeText(_mActivity,"code send fail",Toast.LENGTH_LONG).show();
                            //callback.handleThrowable((Throwable) data);
                        }
                    } else if (event == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) {
                        if (result == SMSSDK.RESULT_COMPLETE) {
                            // TODO 处理验证码验证通过的结果
                            Toast.makeText(_mActivity,"login  success",Toast.LENGTH_LONG).show();
                            handleLoginSuccess();
                        } else {
                            // TODO 处理错误的结果
                            Toast.makeText(_mActivity,"login  fali",Toast.LENGTH_LONG).show();
                            ((Throwable) data).printStackTrace();
                        }
                    }
                    // TODO 其他接口的返回结果也类似，根据event判断当前数据属于哪个接口
                    return false;
                }
            }).sendMessage(msg);
        }
    };
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_phone_login,container,false);
        phoneinput = view.findViewById(R.id.tl_phone);
        getcodeButton = view.findViewById(R.id.bt_code);
        codeinput = view.findViewById(R.id.tl_code);
        loginbutton = view.findViewById(R.id.bt_sure);
        initView();
        return view;
    }

    private void initView() {
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code = codeinput.getEditText().getText().toString();
                check();
            }
        });
        getcodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phonenumber = phoneinput.getEditText().getText().toString();
                if (CommonUtils.isMobile(phonenumber)){
                    phoneinput.setErrorEnabled(false);
                    loginbutton.setClickable(true);
                    getCode();
                }else {
                    loginbutton.setClickable(false);
                    phoneinput.setErrorEnabled(true);
                    phoneinput.setError("请输入正确的手机号");
                }
            }
        });
    }

    private void check() {
        // 提交验证码，其中的code表示验证码，如“1357”
        SMSSDK.submitVerificationCode("86", phonenumber, code);
        NetUtils.request(_mActivity,new LoginModel("2bb2baff8c851",phonenumber,"86",code));
    }

    private Handler handler = new Handler(Looper.getMainLooper()){

    };
    private static  int COUNT= 60;

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            COUNT--;
            if (COUNT > 0){
                getcodeButton.setClickable(false);
                GradientDrawable drawable=(GradientDrawable)getcodeButton.getBackground() ;
                drawable.setColor(Color.parseColor("#3D3D3D"));
                getcodeButton.setText(COUNT +" s");
                handler.postDelayed(this,1000);
            }else {
                COUNT = 60;
                getcodeButton.setClickable(true);
                GradientDrawable drawable=(GradientDrawable)getcodeButton.getBackground() ;
                drawable.setColor(Color.parseColor("#00ACC1"));
                getcodeButton.setText("获取验证码");
                handler.removeCallbacks(this);
            }
        }
    };
    private void getCode() {
        SMSSDK.setAskPermisionOnReadContact(true);
        // 注册一个事件回调，用于处理SMSSDK接口请求的结果
        SMSSDK.registerEventHandler(eventHandler);
        SMSSDK.getVerificationCode("86",phonenumber);
        handler.postDelayed(runnable,1000);
    }

    private void handleLoginSuccess(){
        // todo registersuccess
        IMeetingApplication application = (IMeetingApplication)_mActivity.getApplicationContext();
        if ( application== null){
            return ;
        }
        DataManager manager = application.mDataManager;
        manager.setLoginStatus(true);
        manager.setLoginAccount(phonenumber);
        EventBus.getDefault().post(new RegisterEvent());
        _mActivity.finish();
    }
}
