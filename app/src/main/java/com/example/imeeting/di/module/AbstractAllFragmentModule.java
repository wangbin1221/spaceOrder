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


import com.example.imeeting.di.component.BaseFragmentComponent;
import com.example.imeeting.modules.homepage.ui.fragment.HomeFragment;
import com.example.imeeting.modules.homepage.ui.fragment.MineFragment;
import com.example.imeeting.modules.homepage.ui.fragment.StoryFragment;
import com.example.imeeting.modules.search.ui.fragment.SearchSingleFragment;
import com.example.imeeting.modules.story.ui.activity.StoryActivity;
import com.example.imeeting.modules.story.ui.fragment.SingleStoryFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(subcomponents = BaseFragmentComponent.class)
public abstract class AbstractAllFragmentModule {
    @ContributesAndroidInjector(modules = HomePageFragmentModule.class)
    abstract HomeFragment provideHomePageFragmentInject();
    @ContributesAndroidInjector(modules = SearchFragmentModule.class)
    abstract SearchSingleFragment proviceSearchListFragmentInject();
    @ContributesAndroidInjector(modules = StoryFragmentModule.class)
    abstract SingleStoryFragment provideStoryFragmentInject();
    @ContributesAndroidInjector(modules = StoryActivityModule.class)
    abstract StoryFragment contrtibutesStoryFragmentInject();
    @ContributesAndroidInjector(modules = MineFragmentModule.class)
    abstract MineFragment contributesMineFragmentInject();
}
