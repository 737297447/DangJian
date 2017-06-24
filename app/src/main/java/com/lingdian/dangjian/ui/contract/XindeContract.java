package com.lingdian.dangjian.ui.contract;


import com.lingdian.dangjian.base.BaseContract;
import com.lingdian.dangjian.ui.bean.Xinde;

/**
 * Created by Administrator on 2017/1/16.
 */

public interface XindeContract {

    interface View extends BaseContract.BaseView {
        void showXinde(Xinde xinde);

    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void sendXinde(String SESSIONID, String currentPage);
    }
}
