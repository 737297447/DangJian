package com.lingdian.dangjian.ui.presenter;


import com.lingdian.dangjian.api.Api;
import com.lingdian.dangjian.base.RxPresenter;
import com.lingdian.dangjian.ui.bean.Huiyinbi;
import com.lingdian.dangjian.ui.bean.WentiQiang;
import com.lingdian.dangjian.ui.contract.WentiQiangContract;

import javax.inject.Inject;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/1/16.
 */

public class WentiQiangPresenter extends RxPresenter<WentiQiangContract.View> implements WentiQiangContract.Presenter<WentiQiangContract.View>{

    private Api api;

    @Inject
    public WentiQiangPresenter(Api api){
      this.api = api;
    }


    @Override
    public void sendWenti(String SESSIONID, String currentPage, String source) {
        Subscription rxSubscription = api.wentiqiang(SESSIONID, currentPage,source)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WentiQiang>() {
                    @Override
                    public void onNext(WentiQiang genzong) {
                        if (mView != null) {
                            mView.showWenti(genzong);
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

    @Override
    public void huiyinbi(String SESSIONID, String currentPage, String source) {
        Subscription rxSubscription = api.huiyinbi(SESSIONID, currentPage,source)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Huiyinbi>() {
                    @Override
                    public void onNext(Huiyinbi huiyinbi) {
                        if (mView != null) {
                            mView.huiyinbi(huiyinbi);
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
