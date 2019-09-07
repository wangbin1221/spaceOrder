package com.example.imeeting.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatDelegate;

import com.example.imeeting.core.DataManager;
import com.example.imeeting.di.component.DaggerAppComponent;
import com.example.imeeting.di.module.AppModule;
import com.example.imeeting.di.module.HttpModule;
import com.mob.MobSDK;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
public class IMeetingApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> mAndroidInjector;

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mAndroidInjector;
    }

    private static Context context;
    private RefWatcher refWatcher;
    @Inject
    public DataManager mDataManager;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        MobSDK.init(context);
        DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .httpModule(new HttpModule())
                .build().inject(this);

        if (mDataManager.isNightMode()) {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_NO);
        }

        refWatcher = setupLeakCanary();

    }

    private RefWatcher setupLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return RefWatcher.DISABLED;
        }
        return LeakCanary.install(this);
    }

    public static RefWatcher getRefWatcher(Context context) {
        IMeetingApplication application = (IMeetingApplication) context.getApplicationContext();
        return application.refWatcher;
    }

    public static Context getContext() {
        return context;
    }

    public static boolean isNightMode() {
        IMeetingApplication application = (IMeetingApplication) context.getApplicationContext();
        return application.mDataManager.isNightMode();
    }
}
