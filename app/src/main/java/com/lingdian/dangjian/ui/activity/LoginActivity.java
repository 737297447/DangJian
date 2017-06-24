package com.lingdian.dangjian.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.EditText;

import com.gyf.barlibrary.ImmersionBar;
import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseRVActivity;
import com.lingdian.dangjian.base.Constant;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.component.DaggerMainComponent;
import com.lingdian.dangjian.ui.bean.User;
import com.lingdian.dangjian.ui.contract.LoginContract;
import com.lingdian.dangjian.ui.presenter.LoginPresenter;
import com.lingdian.dangjian.util.SPUtils;
import com.lingdian.dangjian.util.ToastView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by longhy on 2017/6/22.
 */

public class LoginActivity extends BaseRVActivity<LoginPresenter> implements LoginContract.View {


    @BindView(R.id.tv_name)
    EditText tvName;
    @BindView(R.id.tv_psd)
    EditText tvPsd;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void configViews() {

        ImmersionBar.with(this)
                .statusBarDarkFont(false)
                .statusBarColor(R.color.colorPrimary)
                .fitsSystemWindows(true)
                .init();


        tvName.setText("18100000002");
        tvPsd.setText("123456");

    }

    @Override
    public void initDatas() {

    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMainComponent.builder().appComponent(appComponent).build().inject(this);
    }

    @Override
    public void showLogin(User user) {
        if (user.getLevel().equals(Constant.LEVEL_SUCCESS)){
            ToastView.initToast().textToast(this,"登录成功");
            SPUtils.setUser(this,user);
            finish();
            MainActivity.startActivity(this);
        }else{
            ToastView.initToast().textToast(this,user.getMsgContent());
        }


    }

    @Override
    public void showError(String err) {
        dismissDialog();
    }

    @Override
    public void complete() {
        dismissDialog();
    }

    public static void startActivity(Context context) {
        Intent i = new Intent(context, LoginActivity.class);
        context.startActivity(i);
    }

    public static void startCleanActivity(Context context) {
        Intent i = new Intent(new Intent(context, LoginActivity.class));
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity(i);
    }


    @OnClick(R.id.tv_login)
    public void onViewClicked() {
        String account = tvName.getText().toString();
        if (TextUtils.isEmpty(account)){
            ToastView.initToast().textToast(this,"请输入账号");
            return;
        }
        String pwd = tvPsd.getText().toString();
        if (TextUtils.isEmpty(pwd)){
            ToastView.initToast().textToast(this,"请输入密码");
            return;
        }
        showDialog("正在登录中...");
        mPresenter.sendLogin(account,pwd);

    }
}
