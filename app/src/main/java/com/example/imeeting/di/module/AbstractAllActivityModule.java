

/*
 *     (C) Copyright 2019, ForgetSky.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package com.example.imeeting.di.module;


import com.example.imeeting.di.component.BaseActivityComponent;
import com.example.imeeting.modules.detail.ui.DeatilActivity;
import com.example.imeeting.modules.homepage.ui.activity.HomePageActivity;
import com.example.imeeting.modules.login.ui.activity.LoginActivity;
import com.example.imeeting.modules.search.ui.activity.SearchAllActivity;
import com.example.imeeting.modules.search.ui.activity.SearchLocationActivity;
import com.example.imeeting.modules.search.ui.fragment.SearchSingleFragment;
import com.example.imeeting.modules.story.ui.activity.SearchStoryActivity;
import com.example.imeeting.modules.story.ui.activity.StoryActivity;
import com.example.imeeting.modules.story.ui.activity.StoryDetailActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(subcomponents = {BaseActivityComponent.class})
public abstract class AbstractAllActivityModule {
    @ContributesAndroidInjector(modules = HomepageActivityModule.class)
    abstract HomePageActivity contributesHomePageActivityInject();

    @ContributesAndroidInjector(modules = SearchAllActivityModule.class)
    abstract SearchAllActivity contributesSearchActivityInject();

    @ContributesAndroidInjector(modules = SearchLocalActivityModule.class)
    abstract SearchLocationActivity contributesSearchLocationInject();

    @ContributesAndroidInjector(modules = DetailActivityModule.class)
    abstract DeatilActivity contributesDetailActivityInject();

    @ContributesAndroidInjector(modules = LoginActivityModule.class)
    abstract LoginActivity contributesLoginActivityInject();

    @ContributesAndroidInjector(modules = StoryActivityModule.class)
    abstract StoryActivity contrtibutesStoryFragmentInject();

    @ContributesAndroidInjector(modules = WebViewModule.class)
    abstract StoryDetailActivity contributesStoryDetailInject();

    @ContributesAndroidInjector(modules = SearchStoryActivityModule.class)
    abstract SearchStoryActivity contributesStorySearchInject();
}
