package com.lingdian.dangjian.ui.contract;


import com.lingdian.dangjian.base.BaseBean;
import com.lingdian.dangjian.base.BaseContract;
import com.lingdian.dangjian.ui.bean.HuiyinbiDetail;

/**
 * Created by Administrator on 2017/1/16.
 */

public interface WentiQiangDetailContract {

    interface View extends BaseContract.BaseView {
        void showHuifu(BaseBean baseBean);
        void showHuiyinbi(HuiyinbiDetail detail);
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void sendHuifu(String replyContent, String SESSIONID, String problemWallId);
        void sendHuiyinbi(String id, String SESSIONID);
    }
}
