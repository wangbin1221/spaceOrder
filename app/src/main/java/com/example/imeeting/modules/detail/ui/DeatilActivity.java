package com.example.imeeting.modules.detail.ui;


import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.imeeting.R;
import com.example.imeeting.app.IMeetingApplication;
import com.example.imeeting.base.activity.BaseActivity;
import com.example.imeeting.core.constant.Constants;
import com.example.imeeting.modules.OrderActivity;
import com.example.imeeting.modules.detail.BannerGlideImageLoader;
import com.example.imeeting.modules.detail.Contract;
import com.example.imeeting.modules.detail.model.DetailRequest;
import com.example.imeeting.modules.detail.model.DetailResponse;
import com.example.imeeting.modules.detail.model.OrderInputDetail;
import com.example.imeeting.modules.detail.presenter.DetailPresenter;
import com.example.imeeting.modules.detail.view.BottomView;
import com.example.imeeting.modules.detail.view.MyLindicator;
import com.example.imeeting.modules.detail.view.MyViewPager;
import com.example.imeeting.modules.login.ui.activity.LoginActivity;
import com.example.imeeting.modules.poster.PoeterModel;
import com.example.imeeting.utils.CommonUtils;
import com.example.imeeting.utils.GlideUtil;
import com.example.imeeting.utils.QRCodeUtil;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.BannerScroller;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.transformer.AccordionTransformer;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;

import static com.example.imeeting.core.constant.Constants.DETAIL_BOTTOM_GIF;

/**
 * description:
 * created by wangbin on 2019/6/9
 */
public class DeatilActivity extends BaseActivity<DetailPresenter> implements Contract.DetailIView,BottomView.LoginListener {
    private DetailResponse data;

    @Override
    public void jump() {
        Intent intent= new Intent(DeatilActivity.this,LoginActivity.class);
        startActivityForResult(intent,102);
    }
    private OrderInputDetail detail;
    @Override
    public void submit() {
        detail = new OrderInputDetail();
        detail.id = data.getId();
        detail.imgUrl = data.getImage1();
        detail.price = data.getPrice();
        detail.title = data.getTitle();
        Intent intent = new Intent(this,OrderActivity.class);
        intent.putExtra("detail",detail);
    }

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.banner)
    Banner mBanner;
    @BindView(R.id.tv_price)
    TextView priceTv;
    @BindView(R.id.tv_title)
    TextView titleTv;
    @BindView(R.id.tv_desc)
    TextView descTv;
    @BindView(R.id.tag_detail)
    TagFlowLayout flowLayout;
    @BindView(R.id.tv_score)
    TextView scoreTv;
    @BindView(R.id.ll_star)
    LinearLayout starlayout;
    @BindView(R.id.tv_zan)
    TextView zanTv;
    @BindView(R.id.tv_click_comment)
    TextView commentdescTv;
    @BindView(R.id.tv_user_name)
    TextView userNameTv;
    @BindView(R.id.iv_user_icon)
    ImageView userIconIv;
    @BindView(R.id.tv_comment_time)
    TextView commentTime;
    @BindView(R.id.tv_comment_desc)
    TextView commentDescTv;
    @BindView(R.id.view_comment_desc)
    LinearLayout ll_desc;
    @BindView(R.id.view_divider)
    View divider;
    @BindView(R.id.tv_space_content)
    TextView spaceContentTv;
    @BindView(R.id.iv_down)
    ImageView downIv;
    @BindView(R.id.tv_yingyetime_1)
    TextView yingyeTv1;
    @BindView(R.id.tv_yingyetime_2)
    TextView yingyeTv2;
    @BindView(R.id.tv_max_num)
    TextView maxnumTv;
    @BindView(R.id.tl_dingwei)
    TagFlowLayout dingweiTag;
    @BindView(R.id.tl_device)
    TagFlowLayout diviceTaglayout;
    @BindView(R.id.tv_rule)
    TextView ruleTv;
    @BindView(R.id.tv_special_desc)
    TextView specialDesc;
    @BindView(R.id.view_pager)
    MyViewPager viewPager;
    @BindView(R.id.lindicator)
    MyLindicator lindicator;
    @BindView(R.id.iv_gif)
    ImageView gifview;
    @BindView(R.id.view_bottom)
    BottomView bottomView;
    private boolean isShowAll = false;
    private DetailRequest request;
    private OnBannerListener listener;

    @Override
    protected void initView() {
        bottomView.setLoginListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_detail;
    }

    @Override
    protected void initToolbar() {
        setSupportActionBar(toolbar);
        ActionBar bar = getSupportActionBar();
        if (bar != null) {
            bar.setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressedSupport();
            }
        });
    }

    @Override
    protected void initEventAndData() {
        Intent intent = getIntent();
        if (intent == null || (request = (DetailRequest) intent.getSerializableExtra(Constants.DETAIL_REQUEST)) == null) {
            showEmpty();
            return;
        }
        mPresenter.getDetailData(CommonUtils.entityToMap(request));
    }

    @Override
    public void showDetailData(DetailResponse response) {
        if (response == null) {
            showEmpty();
            return;
        }
        this.data = response;
        showBannerData(response);
        showTop(response);
    }

    private void showTop(DetailResponse response) {
        titleTv.setText(response.getTitle());
        SpannableStringBuilder builder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(getString(R.string.price, response.getPrice()));
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.red)), 0, spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new AbsoluteSizeSpan(14, true), 0, spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new StyleSpan(Typeface.BOLD),0,spannableString.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        SpannableString spannableString1 = new SpannableString(getString(R.string.price, response.getShop()));
        spannableString1.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.Grey400)), 0, spannableString1.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString1.setSpan(new StrikethroughSpan(), 0, spannableString1.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString1.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString1.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        builder.append(spannableString).append("   ").append(spannableString1);
        priceTv.setText(builder);
        StringBuffer buffer = new StringBuffer();
        buffer.append(response.getSlogan()).append("  ").append(response.getMianji());
        descTv.setText(buffer.toString());
        String recommend = response.getRecommend();
        String[] ss = recommend.split(",");
        List<String> lists = Arrays.asList(ss);
        List<String> all = new ArrayList<>();
        all.add(response.getKind());
        all.addAll(lists);
        flowLayout.setAdapter(new TagAdapter<String>(all) {
            @Override
            public View getView(FlowLayout parent, int position, String s) {
                TextView tv = (TextView) LayoutInflater.from(DeatilActivity.this)
                        .inflate(R.layout.flow_layout_tv, parent, false);
                tv.setText(s);
                tv.setTextColor(CommonUtils.getRandomColor());
                return tv;
            }
        });

        // comment
        scoreTv.setText(response.getScore());
        try {
            float starcount = Float.valueOf(response.getEvaluate_score());
            int count = (int) starcount;
            boolean flag = false;
            if (Math.round(starcount) == count + 1) { // 带.5的
                flag = true;
            } else {

            }
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(CommonUtils.dip2px(DeatilActivity.this, 8), CommonUtils.dip2px(DeatilActivity.this, 8));
            for (int i = 0; i < count; i++) {
                ImageView imageView = new ImageView(DeatilActivity.this);
                imageView.setImageResource(R.mipmap.one_star);
                starlayout.addView(imageView, params);
            }
            if (flag) {
                ImageView imageView = new ImageView(DeatilActivity.this);
                imageView.setImageResource(R.mipmap.half_star);
                starlayout.addView(imageView, params);
            }
        }catch (Exception e){

        }
        finally {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(CommonUtils.dip2px(DeatilActivity.this, 8), CommonUtils.dip2px(DeatilActivity.this, 8));
            for (int i = 0; i < 5; i++) {
                ImageView imageView = new ImageView(DeatilActivity.this);
                imageView.setImageResource(R.mipmap.one_star);
                starlayout.addView(imageView, params);
            }
        }
        if (CommonUtils.stringIsNull(response.getCommentcount()) || "0".equals(response.getCommentcount())) {
            commentdescTv.setVisibility(View.GONE);
        } else {
            commentdescTv.setText(getString(R.string.see_all_comment, response.getCommentcount()));
        }
        commentdescTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // todo jump 点评页
            }
        });
        if (CommonUtils.stringIsNull(response.getEvaluate_name())) {
            ll_desc.setVisibility(View.GONE);
        } else {
            commentTime.setText(response.getEvaluate_date());
            ll_desc.setVisibility(View.VISIBLE);
            userNameTv.setText(response.getEvaluate_name());
            if (CommonUtils.stringIsNull(response.getEvaluate_content())) {
                commentDescTv.setVisibility(View.GONE);
            } else {
                commentDescTv.setVisibility(View.VISIBLE);
                commentDescTv.setText(response.getEvaluate_content());
            }
            GlideUtil.loadImage(DeatilActivity.this, response.getEvaluate_photo(), userIconIv, 5);
        }
        // map
        showMap(response);
        // 空间介绍
        String content = response.getContent();
        if (content.length() > 80) {
            divider.setVisibility(View.VISIBLE);
            downIv.setVisibility(View.VISIBLE);
            downIv.setImageResource(R.mipmap.xiangxia2);
            downIv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isShowAll) { // 已经展开全部
                        downIv.setImageResource(R.mipmap.xiangxia2);
                        spaceContentTv.setMaxLines(4);
                    } else {
                        downIv.setImageResource(R.mipmap.xiangshang2);
                        spaceContentTv.setMaxLines(Integer.MAX_VALUE);
                    }
                    isShowAll = !isShowAll;

                }
            });
        } else {
            divider.setVisibility(View.GONE);
            downIv.setVisibility(View.GONE);
        }
        spaceContentTv.setText(response.getContent());

        // 营业时间
        yingyeTv1.setText(response.getOpeningdays());
        yingyeTv2.setText(response.getOpeningtime());

        maxnumTv.setText(response.getFitnumber());
        //功能定位
        String[] dingweis = response.getGoodstypewords().split(",");
        dingweiTag.setAdapter(new TagAdapter<String>(dingweis) {
            @Override
            public View getView(FlowLayout parent, int position, String o) {
                TextView tv = (TextView) LayoutInflater.from(DeatilActivity.this)
                        .inflate(R.layout.flow_layout_tv, parent, false);
                tv.setText(dingweis[position]);
                return tv;
            }
        });
        //免费设备和服务
        String[] devices = response.getTags().split(",");
        diviceTaglayout.setAdapter(new TagAdapter<String>(devices) {
            @Override
            public View getView(FlowLayout parent, int position, String o) {
                TextView tv = (TextView) LayoutInflater.from(DeatilActivity.this)
                        .inflate(R.layout.flow_layout_tv, parent, false);
                tv.setText(devices[position]);
                return tv;
            }
        });
        // 特别说明
        StringBuffer specialBuffer = new StringBuffer();
        specialBuffer.append(getString(R.string.special_desc, response.getSpecial(), response.getSpecial2(), response.getSpecial3(), response.getSpecial4()));
        if (CommonUtils.stringIsNull(response.getSpecial5())) {
            specialBuffer.append(getString(R.string.special_4));
        } else {
            specialBuffer.append(response.getSpecial5());
        }
        if (!CommonUtils.stringIsNull(response.getSpecial6())) {
            specialBuffer.append("\n" + response.getSpecial6());
        }
        specialDesc.setText(specialBuffer.toString());
        // 退订规则
        ruleTv.setText(getString(R.string.rule, response.getRule1(), response.getRule2()));

        showRecommend(response);
        //动画
        GlideUtil.loadGifImage(DeatilActivity.this,DETAIL_BOTTOM_GIF,gifview);
        // bottom
        PoeterModel model = new PoeterModel();
        model.title = response.getTitle();
        model.desc = response.getRecommend();
        model.name = "陪你看花开成海";
        model.bgurl = response.getImage1();
        model.iconurl = R.mipmap.ic_launcher;
        File file = new File(IMeetingApplication.getContext().getExternalCacheDir(),Constants.POST_PATH);
        QRCodeUtil.createQRImage("wangbin",CommonUtils.dip2px(DeatilActivity.this,120),CommonUtils.dip2px(DeatilActivity.this,120),null,file.getAbsolutePath());
        model.codeurl = file.getAbsolutePath();
        bottomView.setPosterData(model);
        // todo
        bottomView.setPhoneNumber(response.getTel());
    }

    private void initViewPagerScroll() {
        try {
            Field mField = ViewPager.class.getDeclaredField("mScroller");
            mField.setAccessible(true);
            BannerScroller mScroller = new BannerScroller(viewPager.getContext());
            mScroller.setDuration(800);
            mField.set(viewPager, mScroller);
        } catch (Exception e) {
            //Log.e(tag, e.getMessage());
        }
    }
    /**
     * 展示
     *
     * @param response
     */
    private void showRecommend(DetailResponse response) {
        initViewPagerScroll();
        viewPager.setCount(2);
        lindicator.setNum(2);
        viewPager.setFocusable(true);
        listener = new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                Intent intent = new Intent(DeatilActivity.this, DeatilActivity.class);
                intent.putExtra(Constants.DETAIL_REQUEST, new DetailRequest((response.getOthermeetings().get(position).getId())));
                startActivity(intent);
            }
        };
        List<DetailResponse.OthermeetingsBean> othermeetings = response.getOthermeetings();
        viewPager.setAdapter(new PagerAdapter() {


            @Override
            public int getCount() {
                return othermeetings.size();
            }

            @Override
            public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
                return view == o;
            }

            @NonNull
            @Override
            public Object instantiateItem(@NonNull ViewGroup container, int position) {
                View view = LayoutInflater.from(DeatilActivity.this).inflate(R.layout.view_other, null);
                container.addView(view);
                GlideUtil.loadImage(DeatilActivity.this, othermeetings.get(position).getImage(), view.findViewById(R.id.iv_pic), 10);
                ((TextView) view.findViewById(R.id.tv_title)).setText(othermeetings.get(position).getTitle());
                DetailResponse.OthermeetingsBean item = othermeetings.get(position);
                String desc = item.getMianji() + "可容纳" + item.getFitnumber();
                ((TextView) view.findViewById(R.id.tv_desc)).setText(desc);
                int length = item.getRecommend().split(",").length;
                String[] recommendtag = item.getRecommend().split(",");
                String[] s = new String[length + 1];
                s[0] = item.getKind();
                System.arraycopy(recommendtag, 0, s, 1, length);
                ((TagFlowLayout) view.findViewById(R.id.tag_view)).setAdapter(new TagAdapter<String>(s) {
                    @Override
                    public View getView(FlowLayout parent, int position, String o) {
                        TextView tv = (TextView) LayoutInflater.from(DeatilActivity.this)
                                .inflate(R.layout.flow_layout_tv, parent, false);
                        tv.setText(s[position]);
                        tv.setTextColor(CommonUtils.getRandomColor());
                        return tv;
                    }
                });
                ((TextView) view.findViewById(R.id.tv_price)).setText(getString(R.string.price, item.getPrice()));
                if (listener != null) {
                    view.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            listener.OnBannerClick(position);
                        }
                    });
                }
                return view;
            }

            @Override
            public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
                container.removeView((View) object);
            }
        });
        viewPager.setCurrentItem(0);
        viewPager.setPageTransformer(false, new AccordionTransformer());
        viewPager.startAutoPlay();
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if (lindicator != null) {

                lindicator.setSelectNum(i);
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }

    private void showMap(DetailResponse response) {
        //todo
    }

    public void showBannerData(DetailResponse response) {
        List<String> bannerData = new ArrayList<>();

        // todo 待改进，最多先展示6个吧，接口给的太zz
        if (response.getImage1() != null) {
            bannerData.add(response.getImage1());
        }
        if (response.getImage2() != null) {
            bannerData.add(response.getImage2());
        }
        if (response.getImage3() != null) {
            bannerData.add(response.getImage3());
        }
        if (response.getImage4() != null) {
            bannerData.add(response.getImage4());
        }
        if (response.getImage5() != null) {
            bannerData.add(response.getImage5());
        }
        if (response.getImage6() != null) {
            bannerData.add(response.getImage6());
        }
        //设置banner样式
        mBanner.setBannerStyle(BannerConfig.NUM_INDICATOR);
        //设置图片加载器
        mBanner.setImageLoader(new BannerGlideImageLoader());
        //设置图片集合
        mBanner.setImages(bannerData);
        //设置banner动画效果
        mBanner.setBannerAnimation(Transformer.Accordion);
        //设置自动轮播，默认为true
        mBanner.isAutoPlay(true);
        //设置轮播时间
        mBanner.setDelayTime(2500);
        //设置指示器位置（当banner模式中有指示器时）
        mBanner.setIndicatorGravity(BannerConfig.CENTER);

        mBanner.setOnBannerListener(new OnBannerListener() {
                                        @Override
                                        public void OnBannerClick(int position) {
                                            // todo 大图加载
                                        }
                                    }
        );
        //banner设置方法全部调用完毕时最后调用
        mBanner.start();
    }
}
