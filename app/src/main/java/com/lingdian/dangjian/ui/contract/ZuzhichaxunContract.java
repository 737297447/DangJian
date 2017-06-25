package com.lingdian.dangjian.ui.contract;


import com.lingdian.dangjian.base.BaseContract;
import com.lingdian.dangjian.ui.bean.Zuzhichaxun;

/**
 * Created by Administrator on 2017/1/16.
 */

public interface ZuzhichaxunContract {

    interface View extends BaseContract.BaseView {
        void showZuzhi(Zuzhichaxun zuzhichaxun);
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void sendBranch(String id,String type, String SESSIONID);

    }
}
