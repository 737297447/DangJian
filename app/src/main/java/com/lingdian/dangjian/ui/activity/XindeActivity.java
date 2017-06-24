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
import com.lingdian.dangjian.ui.adapter.XindeAdapter;
import com.lingdian.dangjian.ui.bean.Xinde;
import com.lingdian.dangjian.ui.contract.XindeContract;
import com.lingdian.dangjian.ui.presenter.XindePresenter;
import com.lingdian.dangjian.util.SPUtils;
import com.lingdian.dangjian.util.ToastView;
import com.lingdian.dangjian.view.yrecycleview.YRecycleview;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by C on 2017/6/23.
 */

public class XindeActivity extends BaseRVActivity<XindePresenter> implements XindeContract.View {


    @BindView(R.id.center_text)
    TextView centerText;
    @BindView(R.id.right_image)
    ImageView rightImage;
    @BindView(R.id.yrecycle_view)
    YRecycleview yrecycleView;


    private XindeAdapter adapter;

    private int page = 1;
    private String SESSIONID;

    @Override
    public int getLayoutId() {
        return R.layout.activity_xinde;
    }

    @Override
    public void configViews() {

        ImmersionBar.with(this)
                .statusBarDarkFont(false)
                .statusBarColor(R.color.colorPrimary)
                .fitsSystemWindows(true)
                .init();


        centerText.setText("心得体会");
        rightImage.setVisibility(View.VISIBLE);
        rightImage.setImageResource(R.mipmap.icon_edit);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        yrecycleView.setLayoutManager(layoutManager);
        adapter = new XindeAdapter(this);
        yrecycleView.setAdapter(adapter);

        yrecycleView.setRefreshAndLoadMoreListener(new YRecycleview.OnRefreshAndLoadMoreListener() {
            @Override
            public void onRefresh() {
                page = 1;
                mPresenter.sendXinde(SESSIONID, page + "");
            }

            @Override
            public void onLoadMore() {
                mPresenter.sendXinde(SESSIONID, page + "");
            }
        });

    }

    @Override
    public void initDatas() {

        SESSIONID = SPUtils.getUser(this).getSESSIONID();
        mPresenter.sendXinde(SESSIONID, page + "");

    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMainComponent.builder().appComponent(appComponent).build().inject(this);
    }

    @Override
    public void showError(String err) {

    }

    @Override
    public void showXinde(Xinde xinde) {
        if (xinde.getLevel().equals(Constant.LEVEL_SUCCESS)) {
            if (page == 1) {
                adapter.onReference(xinde.getDataList());
            } else {
                adapter.addOnReference(xinde.getDataList());
            }
            page++;
        } else if (xinde.getLevel().equals(Constant.LEVEL_LOGINOUT)) {
            showUserDialog();
        } else {
            ToastView.initToast().textToast(this, xinde.getMsgContent());
        }


    }

    @Override
    public void complete() {
        yrecycleView.setReFreshComplete();
        yrecycleView.setloadMoreComplete();
    }



    public static void startActivity(Context context) {
        Intent i = new Intent(context, XindeActivity.class);
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
