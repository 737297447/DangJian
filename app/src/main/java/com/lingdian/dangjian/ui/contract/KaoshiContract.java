package com.lingdian.dangjian.ui.contract;


import com.lingdian.dangjian.base.BaseBean;
import com.lingdian.dangjian.base.BaseContract;
import com.lingdian.dangjian.ui.bean.Kaoshi;

/**
 * Created by Administrator on 2017/1/16.
 */

public interface KaoshiContract {

    interface View extends BaseContract.BaseView {
        void showKaoshi(Kaoshi kaoshi);
        void showSumbit(BaseBean bean);

    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void sendKaoshi(String SESSIONID);
        void submitKaoshi(String answer,String id, String intervalTime, String SESSIONID);
    }
}
