package com.lingdian.dangjian.ui.presenter;


import com.lingdian.dangjian.api.Api;
import com.lingdian.dangjian.base.RxPresenter;
import com.lingdian.dangjian.ui.contract.Main1Contract;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/1/16.
 */

public class Main1Presenter extends RxPresenter<Main1Contract.View> implements Main1Contract.Presenter<Main1Contract.View>{

    private Api api;

    @Inject
    public Main1Presenter(Api api){
      this.api = api;
    }



}
