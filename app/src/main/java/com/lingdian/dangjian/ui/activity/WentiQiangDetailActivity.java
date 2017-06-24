package com.lingdian.dangjian.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.gyf.barlibrary.ImmersionBar;
import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseBean;
import com.lingdian.dangjian.base.BaseRVActivity;
import com.lingdian.dangjian.base.Constant;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.component.DaggerMainComponent;
import com.lingdian.dangjian.ui.bean.HuiyinbiDetail;
import com.lingdian.dangjian.ui.bean.WentiQiang;
import com.lingdian.dangjian.ui.contract.WentiQiangDetailContract;
import com.lingdian.dangjian.ui.presenter.WentiQiangDetailPresenter;
import com.lingdian.dangjian.util.SPUtils;
import com.lingdian.dangjian.util.ToastView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/6/24.
 */

public class WentiQiangDetailActivity extends BaseRVActivity<WentiQiangDetailPresenter> implements WentiQiangDetailContract.View {


    @BindView(R.id.center_text)
    TextView centerText;
    @BindView(R.id.tv_1)
    TextView tv1;
    @BindView(R.id.tv_2)
    TextView tv2;
    @BindView(R.id.tv_3)
    TextView tv3;
    @BindView(R.id.tv_4)
    TextView tv4;
    @BindView(R.id.tv_5)
    TextView tv5;
    @BindView(R.id.tv_6)
    TextView tv6;
    @BindView(R.id.tv_7)
    TextView tv7;
    @BindView(R.id.et_content)
    EditText etContent;

    private WentiQiang.DataListBean dataListBean;
    private String menuType;
    private String SESSIONID;


    @Override
    public int getLayoutId() {
        return R.layout.activity_wentiqiang_detail;
    }

    @Override
    public void configViews() {
        ImmersionBar.with(this)
                .statusBarDarkFont(false)
                .statusBarColor(R.color.colorPrimary)
                .fitsSystemWindows(true)
                .init();

        dataListBean = (WentiQiang.DataListBean)getIntent().getSerializableExtra("data");
        menuType = getIntent().getStringExtra("menuType");
        centerText.setText("问题详情");
        SESSIONID = SPUtils.getUser(this).getSESSIONID();
    }

    @Override
    public void initDatas() {

        if (dataListBean != null){

            tv1.setText(menuType);
            tv2.setText(dataListBean.getTitle());
            tv3.setText(dataListBean.getQuizMemberName());

            if (dataListBean.getClassify().equals("OC")){
                tv4.setText("组织建设");
            }else if (dataListBean.getClassify().equals("IC")){
                tv4.setText("产业建设");
            }else if (dataListBean.getClassify().equals("PL")){
                tv4.setText("民生实事");
            }else if (dataListBean.getClassify().equals("DM")){
                tv4.setText("民主管理");
            }else if (dataListBean.getClassify().equals("PA")){
                tv4.setText("精准扶贫");
            }else{
                tv4.setText("组织建设");
            }

            tv5.setText(dataListBean.getQuizBranchName());
            tv6.setText(dataListBean.getRegionName());
            tv7.setText(dataListBean.getContent());
        }


    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMainComponent.builder().appComponent(appComponent).build().inject(this);
    }

    @Override
    public void showError(String err) {

    }

    @Override
    public void showHuifu(BaseBean baseBean) {
        if (baseBean.getLevel().equals(Constant.LEVEL_SUCCESS)) {
            ToastView.initToast().textToast(this, baseBean.getMsgContent());
            etContent.setText("");
        } else if (baseBean.getLevel().equals(Constant.LEVEL_LOGINOUT)) {
            showUserDialog();
        } else {
            ToastView.initToast().textToast(this, baseBean.getMsgContent());
        }


    }

    @Override
    public void showHuiyinbi(HuiyinbiDetail detail) {

    }

    @Override
    public void complete() {
      dismissDialog();
    }

    @OnClick({R.id.left_image, R.id.tv_sumbit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.left_image:
                break;
            case R.id.tv_sumbit:
                String content = etContent.getText().toString();
                if (TextUtils.isEmpty(content)){
                    ToastView.initToast().textToast(this, "请输入...");
                    return;
                }

                showDialog("");
                mPresenter.sendHuifu(content,SESSIONID,dataListBean.getId());

                break;
        }
    }

    public static void startActivity(Context context,String menuType, WentiQiang.DataListBean dataListBean) {
        Intent i = new Intent(context, WentiQiangDetailActivity.class);
        i.putExtra("data",dataListBean);
        i.putExtra("menuType",menuType);
        context.startActivity(i);
    }
}
