package com.lingdian.dangjian.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gyf.barlibrary.ImmersionBar;
import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseBean;
import com.lingdian.dangjian.base.BaseRVActivity;
import com.lingdian.dangjian.base.Constant;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.component.DaggerMainComponent;
import com.lingdian.dangjian.ui.bean.HuiyinbiDetail;
import com.lingdian.dangjian.ui.contract.WentiQiangDetailContract;
import com.lingdian.dangjian.ui.presenter.WentiQiangDetailPresenter;
import com.lingdian.dangjian.util.SPUtils;
import com.lingdian.dangjian.util.ToastView;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/6/24.
 */

public class HuiyinbiDetailActivity extends BaseRVActivity<WentiQiangDetailPresenter> implements WentiQiangDetailContract.View {


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
    @BindView(R.id.ly_all)
    LinearLayout lyAll;

    private String menuType;
    private String SESSIONID;
    private String id;
    private List<HuiyinbiDetail.EchoWallsBean> echoList;


    @Override
    public int getLayoutId() {
        return R.layout.activity_huiyinbi_detail;
    }

    @Override
    public void configViews() {
        ImmersionBar.with(this)
                .statusBarDarkFont(false)
                .statusBarColor(R.color.colorPrimary)
                .fitsSystemWindows(true)
                .init();

        menuType = getIntent().getStringExtra("menuType");
        id = getIntent().getStringExtra("id");
        centerText.setText("问题详情");
        SESSIONID = SPUtils.getUser(this).getSESSIONID();
    }

    @Override
    public void initDatas() {

        showDialog("");
        mPresenter.sendHuiyinbi(id,SESSIONID);


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
    public void showHuifu(BaseBean baseBean) {


    }

    @Override
    public void showHuiyinbi(HuiyinbiDetail detail) {
        if (detail.getLevel().equals(Constant.LEVEL_SUCCESS)) {

            if (detail != null) {

                tv1.setText(menuType);
                tv2.setText(detail.getProblemWall().getTitle());
                tv3.setText(detail.getProblemWall().getQuizMemberName());

                if (detail.getProblemWall().getClassify().equals("OC")) {
                    tv4.setText("组织建设");
                } else if (detail.getProblemWall().getClassify().equals("IC")) {
                    tv4.setText("产业建设");
                } else if (detail.getProblemWall().getClassify().equals("PL")) {
                    tv4.setText("民生实事");
                } else if (detail.getProblemWall().getClassify().equals("DM")) {
                    tv4.setText("民主管理");
                } else if (detail.getProblemWall().getClassify().equals("PA")) {
                    tv4.setText("精准扶贫");
                } else {
                    tv4.setText("组织建设");
                }

                tv5.setText(detail.getProblemWall().getQuizBranchName());
                tv6.setText(detail.getProblemWall().getRegionName());
                tv7.setText(detail.getProblemWall().getContent());

                echoList = detail.getEchoWalls();
                if (echoList != null){
                    addTagView();
                }

            }


        } else if (detail.getLevel().equals(Constant.LEVEL_LOGINOUT)) {
            showUserDialog();
        } else {
            ToastView.initToast().textToast(this, detail.getMsgContent());
        }
    }

    @Override
    public void complete() {
        dismissDialog();
    }

    @OnClick({R.id.left_image})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.left_image:
                finish();
                break;
        }
    }

    public static void startActivity(Context context, String menuType, String id) {
        Intent i = new Intent(context, HuiyinbiDetailActivity.class);
        i.putExtra("id", id);
        i.putExtra("menuType", menuType);
        context.startActivity(i);
    }


    //动态增加Tag
    public void addTagView() {
        if (lyAll.getChildCount() > 0) {
            lyAll.removeAllViews();
        }
        for (int i = 0; i < echoList.size(); i++) {
            View view = LayoutInflater.from(this).inflate(R.layout.layout_huiyinbi_item, null);
            ViewTagHolder holder = new ViewTagHolder();
            holder.tv_huifu = (TextView) view.findViewById(R.id.tv_huifu);
            holder.tv_user = (TextView) view.findViewById(R.id.tv_user);
            holder.tv_time = (TextView) view.findViewById(R.id.tv_time);
            lyAll.addView(view);
            view.setTag(holder);

            HuiyinbiDetail.EchoWallsBean bean = echoList.get(i);

            holder.tv_huifu.setText(bean.getReplyContent());
            holder.tv_user.setText(bean.getReplyBranchName()+" "+bean.getReplyMemberName());
            holder.tv_time.setText(bean.getShowCreateTime());

        }
    }

    class ViewTagHolder {
        TextView tv_huifu, tv_user, tv_time;
    }
}
