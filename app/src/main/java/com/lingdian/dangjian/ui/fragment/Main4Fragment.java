package com.lingdian.dangjian.ui.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseRVFragment;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.component.DaggerMainComponent;
import com.lingdian.dangjian.ui.activity.KaoshiActivity;
import com.lingdian.dangjian.ui.activity.XindeActivity;
import com.lingdian.dangjian.ui.contract.Main1Contract;
import com.lingdian.dangjian.ui.presenter.Main1Presenter;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * Created by Administrator on 2017/1/22.
 * 办事中心页面
 */

public class Main4Fragment extends BaseRVFragment<Main1Presenter> implements Main1Contract.View {


    @BindView(R.id.left_image)
    ImageView leftImage;
    @BindView(R.id.center_text)
    TextView centerText;

    public static Main4Fragment newInstance() {
        Main4Fragment f = new Main4Fragment();
        Bundle b = new Bundle();
        b.putString("type", "Main2Fragment");
        f.setArguments(b);
        return f;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_main4;
    }

    @Override
    protected void immersionInit() {

    }

    @Override
    public void configViews() {
        leftImage.setVisibility(View.INVISIBLE);
        centerText.setText("学习教育");
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




    @OnClick({R.id.ly_menu1_2, R.id.ly_menu1_3, R.id.ly_menu1_1, R.id.ly_menu2_1, R.id.ly_menu2_2, R.id.ly_menu2_3, R.id.ly_menu2_4, R.id.ly_menu2_5, R.id.ly_menu3_1, R.id.ly_menu3_2, R.id.ly_menu3_3, R.id.ly_menu3_4, R.id.ly_menu3_5})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ly_menu1_1:
                break;
            case R.id.ly_menu1_2:
                break;
            case R.id.ly_menu1_3:
                XindeActivity.startActivity(getActivity());
                break;
            case R.id.ly_menu2_1:
                break;
            case R.id.ly_menu2_2:
                break;
            case R.id.ly_menu2_3:
                break;
            case R.id.ly_menu2_4:
                break;
            case R.id.ly_menu2_5:
                break;
            case R.id.ly_menu3_1:
                break;
            case R.id.ly_menu3_2:
                KaoshiActivity.startActivity(getActivity());
                break;
            case R.id.ly_menu3_3:
                break;
            case R.id.ly_menu3_4:
                break;
            case R.id.ly_menu3_5:
                break;
        }
    }
}
