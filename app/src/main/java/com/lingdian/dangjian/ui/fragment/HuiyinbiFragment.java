package com.lingdian.dangjian.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseRVFragment;
import com.lingdian.dangjian.base.Constant;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.component.DaggerMainComponent;
import com.lingdian.dangjian.ui.adapter.HuiyinbiAdapter;
import com.lingdian.dangjian.ui.bean.Huiyinbi;
import com.lingdian.dangjian.ui.bean.WentiQiang;
import com.lingdian.dangjian.ui.contract.WentiQiangContract;
import com.lingdian.dangjian.ui.presenter.WentiQiangPresenter;
import com.lingdian.dangjian.util.SPUtils;
import com.lingdian.dangjian.util.ToastView;
import com.lingdian.dangjian.view.yrecycleview.YRecycleview;

import butterknife.BindView;


/**
 * Created by Administrator on 2017/1/22.
 * 办事中心页面
 */

public class HuiyinbiFragment extends BaseRVFragment<WentiQiangPresenter> implements WentiQiangContract.View {


    @BindView(R.id.recycleview)
    YRecycleview yrecycleView;

    private HuiyinbiAdapter adapter;
    private int page = 1;
    private String SESSIONID;

    private String type;
    private String menuType;


    public static HuiyinbiFragment newInstance(String type) {
        HuiyinbiFragment f = new HuiyinbiFragment();
        Bundle b = new Bundle();
        b.putString("type", type);
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

        type = getArguments().getString("type");

        if (type.equals("CA")){
            menuType = "群众提";
        }else if (type.equals("FY")){
            menuType = "自己找";
        }else if (type.equals("SP")){
            menuType = "上级点";
        }else if (type.equals("CD")){
            menuType = "集体议";
        }


        SESSIONID = SPUtils.getUser(getActivity()).getSESSIONID();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        yrecycleView.setLayoutManager(layoutManager);



        adapter = new HuiyinbiAdapter(getActivity(),menuType);
        yrecycleView.setAdapter(adapter);

        yrecycleView.setRefreshAndLoadMoreListener(new YRecycleview.OnRefreshAndLoadMoreListener() {
            @Override
            public void onRefresh() {
                page = 1;
                mPresenter.huiyinbi(SESSIONID, page + "",type);
            }

            @Override
            public void onLoadMore() {
                mPresenter.huiyinbi(SESSIONID, page + "",type);
            }
        });

    }

    @Override
    public void initDatas() {
        mPresenter.huiyinbi(SESSIONID, page + "",type);
    }


    @Override
    public void showWenti(WentiQiang wentiQiang) {

    }

    @Override
    public void huiyinbi(Huiyinbi huiyinbi) {
        if (huiyinbi.getLevel().equals(Constant.LEVEL_SUCCESS)) {
            if (page == 1) {
                adapter.onReference(huiyinbi.getDataList());
            } else {
                adapter.addOnReference(huiyinbi.getDataList());
            }
            page++;
        } else if (huiyinbi.getLevel().equals(Constant.LEVEL_LOGINOUT)) {
            showUserDialog();

        } else {
            ToastView.initToast().textToast(getActivity(), huiyinbi.getMsgContent());
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
