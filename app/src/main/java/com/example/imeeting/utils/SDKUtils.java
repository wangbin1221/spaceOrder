package com.example.imeeting.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;

import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;

/**
 * description:
 * created by wangbin on 2019/7/13
 */
public class SDKUtils {

    private static EventHandler eventHandler;
    static {
        eventHandler = new EventHandler() {
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
                                // 请注意，此时只是完成了发送验证码的请求，验证码短信还需要几秒钟之后才送达
                            } else {
                                // TODO 处理错误的结果
                                //callback.handleThrowable((Throwable) data);
                            }
                        } else if (event == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) {
                            if (result == SMSSDK.RESULT_COMPLETE) {
                                // TODO 处理验证码验证通过的结果
                            } else {
                                // TODO 处理错误的结果
                                ((Throwable) data).printStackTrace();
                            }
                        }
                        // TODO 其他接口的返回结果也类似，根据event判断当前数据属于哪个接口
                        return false;
                    }
                }).sendMessage(msg);
            }
        };
        SMSSDK.setAskPermisionOnReadContact(true);
            // 注册一个事件回调，用于处理SMSSDK接口请求的结果
        SMSSDK.registerEventHandler(eventHandler);

    }


    interface SubmitCallBack{
        void submitSuccess();
        void submitFail();
    }
    interface RegisterCallback{
        void sendSuccess();
        void handleThrowable(Throwable t);
    }
    public static void submit(String phone){
        SMSSDK.getVerificationCode("86",phone);
    }


    public static void request(String country,String phone){
        SMSSDK.getVerificationCode("86",phone);
    }

    public static List<RegisterCallback> callback = new ArrayList<>();

    public static void request(String phone,RegisterCallback callback){
        request(DEAFULT_COUNTRY,phone);
    }

    public static final String DEAFULT_COUNTRY = "86";
    /*// 使用完EventHandler需注销，否则可能出现内存泄漏
    protected void onDestroy() {
        super.onDestroy();
        SMSSDK.unregisterEventHandler(eventHandler);
    }*/
}
