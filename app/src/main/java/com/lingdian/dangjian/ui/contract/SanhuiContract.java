package com.lingdian.dangjian.ui.contract;


import com.lingdian.dangjian.base.BaseContract;
import com.lingdian.dangjian.ui.bean.Sanhui;

/**
 * Created by Administrator on 2017/1/16.
 */

public interface SanhuiContract {

    interface View extends BaseContract.BaseView {
        void showSanhui(Sanhui sanhui);
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void sendWenti(String SESSIONID, String currentPage);

    }
}
