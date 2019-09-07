package com.example.imeeting.di.module;

import com.example.imeeting.app.IMeetingApplication;
import com.example.imeeting.core.DataManager;
import com.example.imeeting.core.http.HttpHelpImp;
import com.example.imeeting.core.http.HttpHelper;
import com.example.imeeting.core.preference.PreferenceHelpImp;
import com.example.imeeting.core.preference.PreferenceHelper;
import com.example.imeeting.db.DBHelpImp;
import com.example.imeeting.db.DBHelper;
import com.example.imeeting.db.IMeetingDBHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * description:
 * created by wangbin on 2019/6/3
 */
@Module
public class AppModule {
    private final IMeetingApplication application;

    public AppModule(IMeetingApplication iMeetingApplication) {
        this.application = iMeetingApplication;
    }

    @Provides
    @Singleton
    IMeetingApplication provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    IMeetingApplication provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    HttpHelper provideHttpHelper(HttpHelpImp httpHelperImpl) {
        return httpHelperImpl;
    }

    @Provides
    @Singleton
    PreferenceHelper providePreferenceHelper(PreferenceHelpImp preferenceHelper) {
        return preferenceHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(HttpHelper httpHelper, PreferenceHelper preferenceHelper,DBHelper dbHelper) {
        return new DataManager(httpHelper, preferenceHelper,dbHelper);
    }

    @Provides
    @Singleton
    DBHelper provideDBhelper(DBHelpImp imp){
        return imp;
    }


}
