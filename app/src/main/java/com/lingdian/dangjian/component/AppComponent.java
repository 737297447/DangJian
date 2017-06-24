package com.lingdian.dangjian.component;

import android.content.Context;

import com.lingdian.dangjian.api.Api;
import com.lingdian.dangjian.module.ApiModule;
import com.lingdian.dangjian.module.AppModule;

import dagger.Component;

/** Component(组件)
 * Created by Administrator on 2016/11/7.
 */
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {

    Context getContext();

    Api getApi();

}
