package com.lingdian.dangjian.ui.contract;


import com.lingdian.dangjian.base.BaseContract;
import com.lingdian.dangjian.ui.bean.Huiyinbi;
import com.lingdian.dangjian.ui.bean.WentiQiang;

/**
 * Created by Administrator on 2017/1/16.
 */

public interface WentiQiangContract {

    interface View extends BaseContract.BaseView {
        void showWenti(WentiQiang wentiQiang);
        void huiyinbi(Huiyinbi huiyinbi);
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void sendWenti(String SESSIONID, String currentPage, String source);
        void huiyinbi(String SESSIONID, String currentPage, String source);

    }
}
