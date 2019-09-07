package com.example.imeeting.di.component;

import com.example.imeeting.app.IMeetingApplication;
import com.example.imeeting.di.module.AbstractAllActivityModule;
import com.example.imeeting.di.module.AbstractAllFragmentModule;
import com.example.imeeting.di.module.AppModule;
import com.example.imeeting.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AbstractAllActivityModule.class,
        AbstractAllFragmentModule.class,
        AppModule.class,
        HttpModule.class})
public interface AppComponent {

    void inject(IMeetingApplication wanAndroidApp);
}
