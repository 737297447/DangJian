package com.lingdian.dangjian.ui.presenter;


import com.lingdian.dangjian.api.Api;
import com.lingdian.dangjian.base.RxPresenter;
import com.lingdian.dangjian.ui.bean.Sanhui;
import com.lingdian.dangjian.ui.contract.SanhuiContract;

import javax.inject.Inject;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/1/16.
 */

public class SanhuiPresenter extends RxPresenter<SanhuiContract.View> implements SanhuiContract.Presenter<SanhuiContract.View>{

    private Api api;

    @Inject
    public SanhuiPresenter(Api api){
      this.api = api;
    }

    @Override
    public void sendWenti(String SESSIONID, String currentPage) {
        Subscription rxSubscription = api.sanhui(SESSIONID, currentPage)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Sanhui>() {
                    @Override
                    public void onNext(Sanhui sanhui) {
                        if (mView != null) {
                            mView.showSanhui(sanhui);
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
