package com.example.imeeting.modules.story.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.base.activity.BaseActivity;
import com.example.imeeting.core.constant.Constants;
import com.example.imeeting.modules.homepage.contract.Contract;
import com.example.imeeting.modules.story.presenter.StoryPresenter;

import butterknife.BindView;

/**
 * description:
 * created by wangbin on 2019/6/13
 */
public class StoryDetailActivity extends BaseActivity<StoryPresenter> implements Contract.HomepageIView {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.webview)
    WebView webView;
    @BindView(R.id.toolbar_title)
    TextView mTitle;
    private String link;
    private MenuItem mCollectItem;
    private boolean isCollected  = false;
    private boolean isShowCollectIcon = true;

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_story_detail;
    }

    @Override
    protected void initToolbar() {
        setSupportActionBar(toolbar);
        ActionBar bar = getSupportActionBar();
        if (bar != null){
            bar.setDisplayShowHomeEnabled(true);
            bar.setHomeButtonEnabled(true);
            bar.setDisplayHomeAsUpEnabled(true);
            bar.setDisplayShowTitleEnabled(true);
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    protected void initEventAndData() {
        link = getIntent().getStringExtra(Constants.LINK);
        link.replaceAll("\\/","/");
        link+="&flag=true";
        Log.d("wangbin",link);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //return super.shouldOverrideUrlLoading(view, url);
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl(link);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_acticle_detail, menu);
        mCollectItem = menu.findItem(R.id.item_collect);
        mCollectItem.setVisible(isShowCollectIcon);
        mCollectItem.setIcon(isCollected ? R.drawable.ic_like_white : R.drawable.ic_like_not_white);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_share:
                // todo
                break;
            case R.id.item_collect:
                //todo collectClickEvent();
                break;
            case R.id.item_system_browser:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(link)));
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
