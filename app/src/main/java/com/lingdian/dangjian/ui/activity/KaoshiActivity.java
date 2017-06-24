package com.lingdian.dangjian.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gyf.barlibrary.ImmersionBar;
import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseBean;
import com.lingdian.dangjian.base.BaseRVActivity;
import com.lingdian.dangjian.base.Constant;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.component.DaggerMainComponent;
import com.lingdian.dangjian.ui.bean.Kaoshi;
import com.lingdian.dangjian.ui.contract.KaoshiContract;
import com.lingdian.dangjian.ui.dialog.ExitDialog;
import com.lingdian.dangjian.ui.presenter.KaoshiPresenter;
import com.lingdian.dangjian.util.SPUtils;
import com.lingdian.dangjian.util.ToastView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/6/24.
 */

public class KaoshiActivity extends BaseRVActivity<KaoshiPresenter> implements KaoshiContract.View {


    @BindView(R.id.center_text)
    TextView centerText;
    @BindView(R.id.tv_num)
    TextView tvNum;
    @BindView(R.id.tv_danxuan)
    TextView tvDanxuan;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.ly_all)
    LinearLayout lyAll;
    @BindView(R.id.tv_zhengque)
    TextView tvZhengque;
    @BindView(R.id.tv_check)
    TextView tvCheck;
//    @BindView(R.id.tv_up)
//    TextView tvUp;
    @BindView(R.id.tv_down)
    TextView tvDown;
    @BindView(R.id.ly_answer)
    LinearLayout ly_answer;

    private String SESSIONID;

    private List<String> questList = new ArrayList<>();
    private List<Boolean> checkList = new ArrayList<>();
    private List<String> answerList = new ArrayList<>();
    private String answer;


    private boolean isDouboeCheck = false;
    private boolean isZuoda = false;
    private boolean isNext = false;
    private int num = 0;

    private Date startDate;
    private Date endDate;
    private Kaoshi kaoshi;

    @Override
    public int getLayoutId() {
        return R.layout.activity_kaoshi;
    }

    @Override
    public void configViews() {

        ImmersionBar.with(this)
                .statusBarDarkFont(false)
                .statusBarColor(R.color.colorPrimary)
                .fitsSystemWindows(true)
                .init();

        centerText.setText("在线考试");
        startDate = new Date(System.currentTimeMillis());//获取当前时间

    }

    @Override
    public void initDatas() {
        SESSIONID = SPUtils.getUser(this).getSESSIONID();
        showDialog("");
        mPresenter.sendKaoshi(SESSIONID);

    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMainComponent.builder().appComponent(appComponent).build().inject(this);
    }


    @Override
    public void showError(String err) {

    }

    @Override
    public void showKaoshi(Kaoshi kaoshi) {
        if (kaoshi.getLevel().equals(Constant.LEVEL_SUCCESS)) {
            this.kaoshi = kaoshi;
            if (num == 1){
//                tvUp.setVisibility(View.GONE);
            }else{
                startDate = new Date(System.currentTimeMillis());//获取当前时间
//                tvUp.setVisibility(View.VISIBLE);
            }
            questList.clear();
            checkList.clear();
            answerList.clear();

            tvNum.setText(kaoshi.getQuestion().getNum() + "");

            if (kaoshi.getQuestion().getAnswer().length() > 1) {
                isDouboeCheck = true;
                tvDanxuan.setText("【多选】");
                tvDown.setText("提交");
            } else {
                isDouboeCheck = false;
                tvDanxuan.setText("【单选】");
                tvDown.setText("下一题");
            }

            tvTitle.setText(kaoshi.getQuestion().getQuestions());

            addQuest(kaoshi.getQuestion().getOptionA());
            addQuest(kaoshi.getQuestion().getOptionB());
            addQuest(kaoshi.getQuestion().getOptionC());
            addQuest(kaoshi.getQuestion().getOptionD());
            addTagView();
            answer = kaoshi.getQuestion().getAnswer();
            tvZhengque.setText(answer);




        } else if (kaoshi.getLevel().equals(Constant.LEVEL_LOGINOUT)) {
            new ExitDialog(this, kaoshi.getMsgContent() + "请重新登录", "") {
                @Override
                public void onOkClick() {
                    super.onOkClick();
                    finish();
                    SPUtils.clearByKey("user", KaoshiActivity.this);
                    LoginActivity.startCleanActivity(KaoshiActivity.this);
                }
            }.show();

        } else {
            ToastView.initToast().textToast(this, kaoshi.getMsgContent());
        }
    }

    @Override
    public void showSumbit(BaseBean bean) {
        if (bean.getLevel().equals(Constant.LEVEL_SUCCESS)) {
            isDouboeCheck = false;
            isZuoda = false;
            isNext = false;
            ly_answer.setVisibility(View.GONE);
            num++;
            showDialog("");
            mPresenter.sendKaoshi(SESSIONID);
        } else if (kaoshi.getLevel().equals(Constant.LEVEL_LOGINOUT)) {
            showUserDialog();
        } else {
            ToastView.initToast().textToast(this, bean.getMsgContent());
        }
    }

    @Override
    public void complete() {
        dismissDialog();
    }

    private void addQuest(String quest) {
        if (!TextUtils.isEmpty(quest)) {
            questList.add(quest);
            checkList.add(false);
            answerList.add("");
        }
    }


    @OnClick({R.id.left_image, R.id.tv_up, R.id.tv_down})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.left_image:
                finish();
                break;
            case R.id.tv_up:
                break;
            case R.id.tv_down:

                if (checkList.contains(true)) {

                    isZuoda = true;
                    if (isDouboeCheck) {
                        if (!isNext) {
                            tvDown.setText("下一题");
                            ly_answer.setVisibility(View.VISIBLE);
                            String as = "";
                            for (int i = 0; i < answerList.size(); i++) {
                                as += answerList.get(i);
                            }

                            tvCheck.setText(as);


                            for (int i = 0; i < lyAll.getChildCount(); i++) {
                                View view1 = lyAll.getChildAt(i);
                                ViewTagHolder holder = (ViewTagHolder) view1.getTag();
                                if (holder != null) {
                                    switch (i) {
                                        case 0:
                                            if (answer.contains("A") && answerList.contains("A")) {
                                                holder.imageView.setImageResource(R.mipmap.online_more_green);
                                            } else if (answer.contains("A")) {
                                                holder.imageView.setImageResource(R.mipmap.online_more_green);
                                            } else {
                                                if (checkList.get(0)) {
                                                    holder.imageView.setImageResource(R.mipmap.check_more_r);
                                                } else {
                                                    holder.imageView.setImageResource(R.mipmap.check_more_g);
                                                }
                                            }
                                            break;
                                        case 1:
                                            if (answer.contains("B") && answerList.contains("B")) {
                                                holder.imageView.setImageResource(R.mipmap.online_more_green);
                                            } else if (answer.contains("B")) {
                                                holder.imageView.setImageResource(R.mipmap.online_more_green);
                                            } else {
                                                if (checkList.get(1)) {
                                                    holder.imageView.setImageResource(R.mipmap.check_more_r);
                                                } else {
                                                    holder.imageView.setImageResource(R.mipmap.check_more_g);
                                                }
                                            }
                                            break;
                                        case 2:
                                            if (answer.contains("C") && answerList.contains("C")) {
                                                holder.imageView.setImageResource(R.mipmap.online_more_green);
                                            } else if (answer.contains("C")) {
                                                holder.imageView.setImageResource(R.mipmap.online_more_green);
                                            } else {
                                                if (checkList.get(2)) {
                                                    holder.imageView.setImageResource(R.mipmap.check_more_r);
                                                } else {
                                                    holder.imageView.setImageResource(R.mipmap.check_more_g);
                                                }
                                            }
                                            break;
                                        case 3:
                                            if (answer.contains("D") && answerList.contains("D")) {
                                                holder.imageView.setImageResource(R.mipmap.online_more_green);
                                            } else if (answer.contains("D")) {
                                                holder.imageView.setImageResource(R.mipmap.online_more_green);
                                            } else {
                                                if (checkList.get(3)) {
                                                    holder.imageView.setImageResource(R.mipmap.check_more_r);
                                                } else {
                                                    holder.imageView.setImageResource(R.mipmap.check_more_g);
                                                }
                                            }
                                            break;
                                    }


                                }


                            }
                        } else {
                            if (kaoshi != null) {
                                endDate = new Date(System.currentTimeMillis());//获取当前时间
                                userTime();
                                mPresenter.submitKaoshi(tvCheck.getText().toString(), kaoshi.getQuestion().getId(),
                                        userTime() + "", SESSIONID);
                            }
                        }
                        isNext = true;
                    } else {
                        if (kaoshi != null) {
                            endDate = new Date(System.currentTimeMillis());//获取当前时间
                            userTime();
                            mPresenter.submitKaoshi(tvCheck.getText().toString(), kaoshi.getQuestion().getId(),
                                    userTime() + "", SESSIONID);
                        }
                    }
                }else {
                    ToastView.initToast().textToast(this,"请选择答案");
                }
                break;
        }
    }


    public void addTagView() {
        if (lyAll.getChildCount() > 0) {
            lyAll.removeAllViews();
        }

        for (int i = 0; i < questList.size(); i++) {
            final int position = i;
            View view = LayoutInflater.from(this).inflate(R.layout.layout_kaoshi_item, null);
            final ViewTagHolder holder = new ViewTagHolder();
            holder.ly_timu = (LinearLayout) view.findViewById(R.id.ly_timu);
            holder.imageView = (ImageView) view.findViewById(R.id.iv_check);
            holder.tvContent = (TextView) view.findViewById(R.id.tv_content);
            lyAll.addView(view);
            view.setTag(holder);

            if (isDouboeCheck) {
                holder.imageView.setImageResource(R.mipmap.check_more_g);
            } else {
                holder.imageView.setImageResource(R.mipmap.check_n);
            }

            holder.tvContent.setText(questList.get(i));

            holder.ly_timu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (isZuoda) {
                        ToastView.initToast().textToast(KaoshiActivity.this, "该题已作答，不能修改！");
                    } else {

                        if (checkList.get(position)) {
                            checkList.set(position, false);
                        } else {
                            checkList.set(position, true);
                        }


                        if (isDouboeCheck) {

                            if (checkList.get(position)) {
                                switch (position) {
                                    case 0:
                                        answerList.set(0, "A");
                                        break;
                                    case 1:
                                        answerList.add(1, "B");
                                        break;
                                    case 2:
                                        answerList.add(2, "C");
                                        break;
                                    case 3:
                                        answerList.add(3, "D");
                                        break;
                                }
                                holder.imageView.setImageResource(R.mipmap.check_more_r);
                            } else {
                                switch (position) {
                                    case 0:
                                        answerList.set(0, "");
                                        break;
                                    case 1:
                                        answerList.set(1, "");
                                        break;
                                    case 2:
                                        answerList.set(2, "");
                                        break;
                                    case 3:
                                        answerList.set(3, "");
                                        break;
                                }
                                holder.imageView.setImageResource(R.mipmap.check_more_g);
                            }

                        } else {

                            holder.ly_timu.setClickable(false);
                            ly_answer.setVisibility(View.VISIBLE);
                            holder.imageView.setImageResource(R.mipmap.check_pre);
                            isZuoda = true;
                            checkList.set(position, true);
                            switch (position) {
                                case 0:
                                    tvCheck.setText("A");
                                    break;
                                case 1:
                                    tvCheck.setText("B");
                                    break;
                                case 2:
                                    tvCheck.setText("C");
                                    break;
                                case 3:
                                    tvCheck.setText("D");
                                    break;
                            }


                            for (int  j= 0;  j< lyAll.getChildCount(); j++) {
                                View view1 = lyAll.getChildAt(j);
                                ViewTagHolder holder1 = (ViewTagHolder) view1.getTag();
                                if (holder != null) {
                                    switch (j) {
                                        case 0:
                                            if (answer.contains("A")) {
                                                holder1.imageView.setImageResource(R.mipmap.icon_correct);
                                            }
                                            break;
                                        case 1:
                                            if (answer.contains("B")) {
                                                holder1.imageView.setImageResource(R.mipmap.icon_correct);
                                            }
                                            break;
                                        case 2:
                                            if (answer.contains("C")) {
                                                holder1.imageView.setImageResource(R.mipmap.icon_correct);
                                            }
                                            break;
                                        case 3:
                                            if (answer.contains("D")) {
                                                holder1.imageView.setImageResource(R.mipmap.icon_correct);
                                            }
                                            break;
                                    }
                                }
                            }

                        }
                    }

                }
            });

        }
    }

    class ViewTagHolder {
        LinearLayout ly_timu;
        ImageView imageView;
        TextView tvContent;
    }


    public static void startActivity(Context context) {
        Intent i = new Intent(context, KaoshiActivity.class);
        context.startActivity(i);
    }


    protected int userTime() {
        long yy = endDate.getTime() - startDate.getTime();
        //yy/1000:相差多少秒
        //yy/1000/60:相差多少分钟
        //yy/1000/60/60:相差多少小时
        //yy/1000/60/60/24:相差多少天
        return (int) yy/1000;
    }
}
