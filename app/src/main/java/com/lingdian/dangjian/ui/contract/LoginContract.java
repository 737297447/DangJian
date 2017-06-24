package com.lingdian.dangjian.ui.contract;


import com.lingdian.dangjian.base.BaseContract;
import com.lingdian.dangjian.ui.bean.User;

/**
 * Created by Administrator on 2017/1/16.
 */

public interface LoginContract {

    interface View extends BaseContract.BaseView {
        void showLogin(User user);

    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void sendLogin(String account, String password);
    }
}
