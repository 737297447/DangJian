package com.lingdian.dangjian.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.gyf.barlibrary.ImmersionBar;
import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseActivity;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.ui.fragment.Gz1Fragment;
import com.lingdian.dangjian.ui.fragment.Gz2Fragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/6/24.
 */

public class GenzongActivity extends BaseActivity {


    @BindView(R.id.center_text)
    TextView centerText;
    @BindView(R.id.right_image)
    ImageView rightImage;
    @BindView(R.id.tv_left)
    TextView tvLeft;
    @BindView(R.id.tv_right)
    TextView tvRight;

    private Gz1Fragment gz1Fragment;
    private Gz2Fragment gz2Fragment;
    private FragmentTransaction ft;


    @Override
    public int getLayoutId() {
        return R.layout.activity_genzong_ducha;
    }

    @Override
    public void configViews() {
        ImmersionBar.with(this)
                .statusBarDarkFont(false)
                .statusBarColor(R.color.colorPrimary)
                .fitsSystemWindows(true)
                .init();

        centerText.setText("跟踪督查");
        rightImage.setVisibility(View.VISIBLE);
        rightImage.setImageResource(R.mipmap.icon_search);

        tvLeft.setSelected(true);
        tvRight.setSelected(false);
        setTabSelection(1);
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

    public void setTabSelection(int index) {
        // 开启一个Fragment事务
        ft = getSupportFragmentManager().beginTransaction();
        // 先隐藏掉所有的Fragment，以防止有多个Fragment显示在界面上的情况
        hideFragments(ft);
        switch (index) {
            case 1:
                if (gz1Fragment == null) {
                    gz1Fragment = new Gz1Fragment();
                    ft.add(R.id.content_frame, gz1Fragment);
                } else {
                    ft.show(gz1Fragment);
                }
                break;
            case 2:
                if (gz2Fragment == null) {
                    gz2Fragment = new Gz2Fragment();
                    ft.add(R.id.content_frame, gz2Fragment);
                } else {
                    ft.show(gz2Fragment);
                }
                break;

        }
        ft.commitAllowingStateLoss();

    }

    private void hideFragments(FragmentTransaction transaction) {
        if (gz1Fragment != null) {
            transaction.hide(gz1Fragment);
        }
        if (gz2Fragment != null) {
            transaction.hide(gz2Fragment);
        }
    }

    @OnClick({R.id.left_image, R.id.tv_left, R.id.tv_right})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.left_image:
                finish();
                break;
            case R.id.tv_left:
                tvLeft.setSelected(true);
                tvRight.setSelected(false);
                setTabSelection(1);
                break;
            case R.id.tv_right:
                tvLeft.setSelected(false);
                tvRight.setSelected(true);
                setTabSelection(2);
                break;
        }
    }

    public static void startActivity(Context context) {
        Intent i = new Intent(context, GenzongActivity.class);
        context.startActivity(i);
    }
}
