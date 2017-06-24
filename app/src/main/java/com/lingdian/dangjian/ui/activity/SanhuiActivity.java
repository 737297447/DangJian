package com.lingdian.dangjian.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.gyf.barlibrary.ImmersionBar;
import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseRVActivity;
import com.lingdian.dangjian.base.Constant;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.component.DaggerMainComponent;
import com.lingdian.dangjian.ui.adapter.SanhuiAdapter;
import com.lingdian.dangjian.ui.bean.Sanhui;
import com.lingdian.dangjian.ui.contract.SanhuiContract;
import com.lingdian.dangjian.ui.presenter.SanhuiPresenter;
import com.lingdian.dangjian.util.SPUtils;
import com.lingdian.dangjian.util.ToastView;
import com.lingdian.dangjian.view.yrecycleview.YRecycleview;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/6/24.
 */

public class SanhuiActivity extends BaseRVActivity<SanhuiPresenter> implements SanhuiContract.View {


    @BindView(R.id.center_text)
    TextView centerText;
    @BindView(R.id.tv_bumen)
    TextView tvBumen;
    @BindView(R.id.recycleView)
    YRecycleview yrecycleView;
    @BindView(R.id.right_image)
    ImageView rightImage;

    private String SESSIONID;
    private int page = 1;
    private SanhuiAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_sanhui;
    }

    @Override
    public void configViews() {
        ImmersionBar.with(this)
                .statusBarDarkFont(false)
                .statusBarColor(R.color.colorPrimary)
                .fitsSystemWindows(true)
                .init();

        centerText.setText("三会一课");
        rightImage.setVisibility(View.VISIBLE);
        rightImage.setImageResource(R.mipmap.sousuo);


        SESSIONID = SPUtils.getUser(this).getSESSIONID();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        yrecycleView.setLayoutManager(layoutManager);
        adapter = new SanhuiAdapter(this);
        yrecycleView.setAdapter(adapter);

        yrecycleView.setRefreshAndLoadMoreListener(new YRecycleview.OnRefreshAndLoadMoreListener() {
            @Override
            public void onRefresh() {
                page = 1;
                mPresenter.sendWenti(SESSIONID, page + "");
            }

            @Override
            public void onLoadMore() {
                mPresenter.sendWenti(SESSIONID, page + "");
            }
        });

    }

    @Override
    public void initDatas() {
        showDialog("");
        mPresenter.sendWenti(SESSIONID, page + "");
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
    public void showSanhui(Sanhui sanhui) {
        if (sanhui.getLevel().equals(Constant.LEVEL_SUCCESS)) {
            if (page == 1) {
                adapter.onReference(sanhui.getDataList());
            } else {
                adapter.addOnReference(sanhui.getDataList());
            }
            page++;
        } else if (sanhui.getLevel().equals(Constant.LEVEL_LOGINOUT)) {
            showUserDialog();

        } else {
            ToastView.initToast().textToast(this, sanhui.getMsgContent());
        }
    }

    @Override
    public void complete() {
        dismissDialog();
        yrecycleView.setReFreshComplete();
        yrecycleView.setloadMoreComplete();
    }

    public static void startActivity(Context context) {
        Intent i = new Intent(context, SanhuiActivity.class);
        context.startActivity(i);
    }


    @OnClick({R.id.left_image, R.id.right_text})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.left_image:
                finish();
                break;
            case R.id.right_text:
                break;
        }
    }
}
