package com.lingdian.dangjian.ui.fragment;

import android.os.Bundle;
import android.widget.TextView;

import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseRVFragment;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.component.DaggerMainComponent;
import com.lingdian.dangjian.ui.contract.Main1Contract;
import com.lingdian.dangjian.ui.presenter.Main1Presenter;

import butterknife.BindView;


/**
 * Created by Administrator on 2017/1/22.
 * 办事中心页面
 */

public class Main1Fragment extends BaseRVFragment<Main1Presenter> implements Main1Contract.View {

    @BindView(R.id.center_text)
    TextView centerText;

    public static Main1Fragment newInstance() {
        Main1Fragment f = new Main1Fragment();
        Bundle b = new Bundle();
        b.putString("type", "Main2Fragment");
        f.setArguments(b);
        return f;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_main1;
    }

    @Override
    protected void immersionInit() {

    }

    @Override
    public void configViews() {
        centerText.setText("党员主页");
    }

    @Override
    public void initDatas() {

    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMainComponent.builder().appComponent(appComponent).build().inject(this);
    }

    @Override
    public void showError(String err) {
        dismissDialog();
    }

    @Override
    public void complete() {
        dismissDialog();
    }


}
