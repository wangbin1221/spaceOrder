package com.example.imeeting.modules.detail.view;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.imeeting.R;
import com.example.imeeting.app.IMeetingApplication;
import com.example.imeeting.core.preference.PreferenceHelpImp;
import com.example.imeeting.core.preference.PreferenceHelper;
import com.example.imeeting.modules.poster.PoeterModel;
import com.example.imeeting.utils.CommonUtils;
import com.example.imeeting.view.PosterView;

import static android.view.Gravity.BOTTOM;

/**
 * description:
 * created by wangbin on 2019/6/10
 */
public class BottomView extends LinearLayout {
    private Context context;
    private boolean isCollect = false;
    private ImageView collectIv;
    private TextView sureTv;
    private PopupWindow shareWindow;
    private PopupWindow callWindow;
    private String phoneNumbler;
    private PreferenceHelper helper = new PreferenceHelpImp();
    private PoeterModel model; // post data
    public BottomView(Context context) {
        this(context,null,0);
    }

    public BottomView(Context context, AttributeSet attrs) {
        this(context,attrs,0);
    }

    public BottomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView();
    }

    public void setPosterData(PoeterModel model){
        this.model = model;
    }

    private void initView() {
        LayoutInflater.from(context).inflate(R.layout.view_bottom,this);
        collectIv = findViewById(R.id.iv_collect);
        collectIv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                isCollect = !isCollect;
                showCollect();
            }
        });
        findViewById(R.id.iv_share).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showSharePopupwindow();
            }
        });
        findViewById(R.id.iv_call).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showCallPopupWindow();
            }
        });
        sureTv = findViewById(R.id.tv_sure);
        sureTv.setOnClickListener((e) -> {
            gotoOrder();
        });
    }
    //TODO adapter
    private static final String MSG = "1、 空间最大可招待120人。\n2、 起订时间为2小时。\n3、 目前发票由空间商户提供。";
    private void gotoOrder(){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("温馨提示");
        builder.setMessage(MSG);
        builder.setNegativeButton("我知道了",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                jumpOrder();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void jumpOrder(){
        // detail page
        if (listener != null){
            listener.submit();
        }
    }

    private void showCallPopupWindow() {
        if (callWindow != null){
            callWindow.showAtLocation((View)getParent(),BOTTOM,0,0);
        }else {
            View  view = LayoutInflater.from(context).inflate(R.layout.popup_call,null);
            ((TextView)(view.findViewById(R.id.tv_phone_number))).setText(this.phoneNumbler);
            view.findViewById(R.id.view_backgroud).setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    if (callWindow != null && callWindow.isShowing()){
                        callWindow.dismiss();
                    }
                }
            });
            view.findViewById(R.id.tv_cancel_call).setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (callWindow != null && callWindow.isShowing()){
                        callWindow.dismiss();
                    }
                }
            });
            view.findViewById(R.id.tv_call_now).setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (callWindow != null && callWindow.isShowing()){
                        callWindow.dismiss();
                    }
                    jumpMakeCall();
                }
            });
            callWindow = new PopupWindow(view,ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT,true);
            callWindow.setOutsideTouchable(true);
            callWindow.setBackgroundDrawable(new ColorDrawable());
            callWindow.showAtLocation((View)getParent(),BOTTOM,0,0);
        }
    }

    private void jumpMakeCall() {
        // todo 可以申请权限直接拨打 此处不使用,后期实现吧
        if (CommonUtils.stringIsNull(phoneNumbler)){
            Toast.makeText(IMeetingApplication.getContext(),"error",Toast.LENGTH_LONG).show();
            return;
        }
        CommonUtils.callPhone(context,phoneNumbler);
    }

    private void showSharePopupwindow() {
        if (shareWindow != null){
            shareWindow.showAtLocation((View)getParent(),BOTTOM,0,0);
        }else {
            View view = LayoutInflater.from(context).inflate(R.layout.popup_share,null);
            view.findViewById(R.id.view_backgroud).setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    if (shareWindow != null && shareWindow.isShowing()){
                        shareWindow.dismiss();
                    }
                }
            });
            view.findViewById(R.id.tv_enter_daren).setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    // todo 达人页
                    if (shareWindow != null && shareWindow.isShowing()){
                        shareWindow.dismiss();
                    }
                }
            });
            view.findViewById(R.id.ll_share_haibao).setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    // todo shareWindow
                    createPostView();
                    if (shareWindow != null && shareWindow.isShowing()){
                        shareWindow.dismiss();
                    }
                }
            });
            view.findViewById(R.id.ll_share_friend).setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (shareWindow != null && shareWindow.isShowing()){
                        shareWindow.dismiss();
                    }
                    // todo share
                }
            });
            shareWindow =  new PopupWindow(view,ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT,true);
            shareWindow.setBackgroundDrawable(new ColorDrawable());
            shareWindow.setOutsideTouchable(true);
            shareWindow.showAtLocation((View) getParent(),BOTTOM,0,0);
        }
    }
    private void createPostView(){
        if (model == null){
            return;
        }
        View contentVIew = LayoutInflater.from(context).inflate(R.layout.popup_poster,null);
        ((PosterView)contentVIew.findViewById(R.id.view_post)).setData(model);
        PopupWindow window = new PopupWindow(contentVIew,ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
        window.setOutsideTouchable(true);
        window.setBackgroundDrawable(new ColorDrawable());
        window.showAtLocation((View) getParent(),BOTTOM,0,0);
    }

    private void showCollect() {
        // todo 加收藏功能 吐司
        if (helper.getLoginStatus()){
            collectIv.setImageResource(isCollect? R.mipmap.xing2:R.mipmap.xing1);
        }else {
            jumpLogin();
        }
    }

    private void jumpLogin() {
        if (listener != null){
            listener.jump();
        }
    }

    public void setPhoneNumber(String tel) {
        phoneNumbler = tel;
    }

    private LoginListener listener;
    public void setLoginListener(LoginListener listener){
        this.listener = listener;
    }
    public interface LoginListener{
        void jump();
        void submit();
    }
}
