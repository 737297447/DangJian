package com.lingdian.dangjian;

import android.app.Application;

import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.component.DaggerAppComponent;
import com.lingdian.dangjian.module.ApiModule;
import com.lingdian.dangjian.module.AppModule;
import com.lingdian.dangjian.util.FileUtil;

/**
 * Created by C on 2017/5/17.
 */

public class App extends Application {

    private static App instance;
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.instance = this;

        initComponent();

        FileUtil.initFileCache(this);

    }


    public static App getInstance() {
        return instance;
    }

    private void initComponent() {
        appComponent = DaggerAppComponent.builder()
                .apiModule(new ApiModule())
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
