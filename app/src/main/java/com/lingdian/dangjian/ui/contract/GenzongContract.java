package com.lingdian.dangjian.ui.contract;


import com.lingdian.dangjian.base.BaseContract;
import com.lingdian.dangjian.ui.bean.Genzong;
import com.lingdian.dangjian.ui.bean.GenzongSh;

/**
 * Created by Administrator on 2017/1/16.
 */

public interface GenzongContract {

    interface View extends BaseContract.BaseView {
        void showHuodong(Genzong genzong);
        void showSanhui(GenzongSh genzong);

    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void sendHuodong(String SESSIONID, String currentPage);
        void sendSanhui(String SESSIONID, String currentPage);
    }
}
