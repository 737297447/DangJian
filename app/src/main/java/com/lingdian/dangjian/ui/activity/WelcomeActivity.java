package com.lingdian.dangjian.ui.activity;

import com.gyf.barlibrary.ImmersionBar;
import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseActivity;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.util.SPUtils;

import android.os.Handler;

/**
 * Created by longhy on 2017/6/22.
 */

public class WelcomeActivity extends BaseActivity {


    @Override
    public int getLayoutId() {
        return R.layout.activity_welcome;
    }

    @Override
    public void configViews() {
        ImmersionBar.with(this)
                .statusBarDarkFont(false)
                .statusBarColor(R.color.transparent)
                .init();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (SPUtils.getUser(WelcomeActivity.this) != null)
                    MainActivity.startActivity(WelcomeActivity.this);
                else
                    LoginActivity.startActivity(WelcomeActivity.this);
                finish();
            }
        }, 2000);

    }

    @Override
    public void initDatas() {

    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

    }

    @Override
    public void attachView() {

    }
}
