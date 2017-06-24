package com.lingdian.dangjian.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lingdian.dangjian.R;
import com.lingdian.dangjian.ui.activity.LoginActivity;
import com.lingdian.dangjian.util.SPUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2016/11/22.
 */

public class ExitDialog extends Dialog {

    @BindView(R.id.tv_title)
    TextView tv_title;
    @BindView(R.id.tv_queding)
    TextView tv_queding;


    private String title;
    private String queding;
    private Context context;


    public ExitDialog(Context context, String title, String queding) {
        super(context, R.style.MyDialogStyleTop);
        this.context = context;
        this.title = title;
        this.queding = queding;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_exit);
        ButterKnife.bind(this);
        setCanceledOnTouchOutside(false);
        if(!title.isEmpty()){
            tv_title.setText(title);
        }
        if(!queding.isEmpty()){
            tv_queding.setText(queding);
        }


    }



    @OnClick({R.id.tv_quxiao, R.id.tv_queding})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_quxiao:
                onCancleClick();
                break;
            case R.id.tv_queding:
                onOkClick();
                break;
        }
    }


    public void onCancleClick() {
        dismiss();
    }

    public void onOkClick() {
        dismiss();
        SPUtils.clearByKey("user",context);
        LoginActivity.startCleanActivity(context);
    }

}
