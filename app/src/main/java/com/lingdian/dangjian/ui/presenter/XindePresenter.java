package com.lingdian.dangjian.ui.presenter;


import com.lingdian.dangjian.api.Api;
import com.lingdian.dangjian.base.RxPresenter;
import com.lingdian.dangjian.ui.bean.Xinde;
import com.lingdian.dangjian.ui.contract.XindeContract;

import javax.inject.Inject;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/1/16.
 */

public class XindePresenter extends RxPresenter<XindeContract.View> implements XindeContract.Presenter<XindeContract.View>{

    private Api api;

    @Inject
    public XindePresenter(Api api){
      this.api = api;
    }

    @Override
    public void sendXinde(String SESSIONID, String currentPage) {

        Subscription rxSubscription = api.xinde(SESSIONID, currentPage)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Xinde>() {
                    @Override
                    public void onNext(Xinde xinde) {
                        if (mView != null) {
                            mView.showXinde(xinde);
                        }

                    }
                    @Override
                    public void onCompleted() {
                        mView.complete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("*********user****e***********" + e.getMessage());
                        mView.showError(e.getMessage());
                    }


                });
        addSubscribe(rxSubscription);

    }
}
