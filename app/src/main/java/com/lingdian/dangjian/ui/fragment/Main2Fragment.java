package com.lingdian.dangjian.ui.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseRVFragment;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.component.DaggerMainComponent;
import com.lingdian.dangjian.ui.activity.GenzongActivity;
import com.lingdian.dangjian.ui.activity.WentiQiangActivity;
import com.lingdian.dangjian.ui.contract.Main1Contract;
import com.lingdian.dangjian.ui.presenter.Main1Presenter;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * Created by Administrator on 2017/1/22.
 * 办事中心页面
 */

public class Main2Fragment extends BaseRVFragment<Main1Presenter> implements Main1Contract.View {


    @BindView(R.id.left_image)
    ImageView leftImage;
    @BindView(R.id.center_text)
    TextView centerText;

    public static Main2Fragment newInstance() {
        Main2Fragment f = new Main2Fragment();
        Bundle b = new Bundle();
        b.putString("type", "Main2Fragment");
        f.setArguments(b);
        return f;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_main2;
    }

    @Override
    protected void immersionInit() {
        leftImage.setVisibility(View.INVISIBLE);
        centerText.setText("党务管理");
    }

    @Override
    public void configViews() {

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



    @OnClick({R.id.ly_menu1_1, R.id.ly_menu1_2, R.id.ly_menu1_3, R.id.ly_menu1_4, R.id.ly_menu1_5, R.id.ly_menu1_6, R.id.ly_menu2_1, R.id.ly_menu2_2, R.id.ly_menu2_3, R.id.ly_menu3_1, R.id.ly_menu3_2, R.id.ly_menu3_3, R.id.ly_menu4_1, R.id.ly_menu4_2, R.id.ly_menu4_3, R.id.ly_menu4_4, R.id.ly_menu5_1, R.id.imageView, R.id.ly_menu5_2, R.id.ly_menu5_3, R.id.ly_menu6_1, R.id.ly_menu6_2, R.id.ly_menu6_3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ly_menu1_1:
                break;
            case R.id.ly_menu1_2:
                break;
            case R.id.ly_menu1_3:
                break;
            case R.id.ly_menu1_4:
                GenzongActivity.startActivity(getActivity());
                break;
            case R.id.ly_menu1_5:
                break;
            case R.id.ly_menu1_6:
                break;
            case R.id.ly_menu2_1:
                break;
            case R.id.ly_menu2_2:
                break;
            case R.id.ly_menu2_3:
                break;
            case R.id.ly_menu3_1:
                WentiQiangActivity.startActivity(getActivity(),1);
                break;
            case R.id.ly_menu3_2:
                WentiQiangActivity.startActivity(getActivity(),2);
                break;
            case R.id.ly_menu3_3:
                break;
            case R.id.ly_menu4_1:
//                ZuzhichaxunActivity.startActivity(getActivity());
                break;
            case R.id.ly_menu4_2:
                break;
            case R.id.ly_menu4_3:
                break;
            case R.id.ly_menu4_4:
                break;
            case R.id.ly_menu5_1:
                break;
            case R.id.imageView:
                break;
            case R.id.ly_menu5_2:
                break;
            case R.id.ly_menu5_3:
                break;
            case R.id.ly_menu6_1:
                break;
            case R.id.ly_menu6_2:
                break;
            case R.id.ly_menu6_3:
                break;
        }
    }
}
