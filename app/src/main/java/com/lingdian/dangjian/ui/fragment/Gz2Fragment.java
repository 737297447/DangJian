package com.lingdian.dangjian.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseRVFragment;
import com.lingdian.dangjian.base.Constant;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.component.DaggerMainComponent;
import com.lingdian.dangjian.ui.activity.LoginActivity;
import com.lingdian.dangjian.ui.adapter.GenzongShAdapter;
import com.lingdian.dangjian.ui.bean.Genzong;
import com.lingdian.dangjian.ui.bean.GenzongSh;
import com.lingdian.dangjian.ui.contract.GenzongContract;
import com.lingdian.dangjian.ui.dialog.ExitDialog;
import com.lingdian.dangjian.ui.presenter.GenzongPresenter;
import com.lingdian.dangjian.util.SPUtils;
import com.lingdian.dangjian.util.ToastView;
import com.lingdian.dangjian.view.yrecycleview.YRecycleview;

import butterknife.BindView;


/**
 * Created by Administrator on 2017/1/22.
 * 办事中心页面
 */

public class Gz2Fragment extends BaseRVFragment<GenzongPresenter> implements GenzongContract.View{

    @BindView(R.id.recycleview)
    YRecycleview yrecycleView;

    private GenzongShAdapter adapter;
    private int page = 1;
    private String SESSIONID;

    public static Gz2Fragment newInstance() {
        Gz2Fragment f = new Gz2Fragment();
        Bundle b = new Bundle();
        b.putString("type", "Main2Fragment");
        f.setArguments(b);
        return f;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_gz1;
    }

    @Override
    protected void immersionInit() {
    }

    @Override
    public void configViews() {

        SESSIONID = SPUtils.getUser(getActivity()).getSESSIONID();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        yrecycleView.setLayoutManager(layoutManager);
        adapter = new GenzongShAdapter(getActivity());
        yrecycleView.setAdapter(adapter);

        yrecycleView.setRefreshAndLoadMoreListener(new YRecycleview.OnRefreshAndLoadMoreListener() {
            @Override
            public void onRefresh() {
                page = 1;
                mPresenter.sendSanhui(SESSIONID, page + "");
            }

            @Override
            public void onLoadMore() {
                mPresenter.sendSanhui(SESSIONID, page + "");
            }
        });

    }

    @Override
    public void initDatas() {
        mPresenter.sendSanhui(SESSIONID, page + "");
    }

    @Override
    public void showHuodong(Genzong genzong) {

    }

    @Override
    public void showSanhui(GenzongSh genzong) {
        if (genzong.getLevel().equals(Constant.LEVEL_SUCCESS)) {
            if (page == 1) {
                adapter.onReference(genzong.getDataList());
            } else {
                adapter.addOnReference(genzong.getDataList());
            }
            page++;
        } else if (genzong.getLevel().equals(Constant.LEVEL_LOGINOUT)) {
            showUserDialog();
        } else {
            ToastView.initToast().textToast(getActivity(), genzong.getMsgContent());
        }
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
        yrecycleView.setReFreshComplete();
        yrecycleView.setloadMoreComplete();
    }

}
