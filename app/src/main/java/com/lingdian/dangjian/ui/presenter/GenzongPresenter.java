package com.lingdian.dangjian.ui.presenter;


import com.lingdian.dangjian.api.Api;
import com.lingdian.dangjian.base.RxPresenter;
import com.lingdian.dangjian.ui.bean.Genzong;
import com.lingdian.dangjian.ui.bean.GenzongSh;
import com.lingdian.dangjian.ui.contract.GenzongContract;

import javax.inject.Inject;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/1/16.
 */

public class GenzongPresenter extends RxPresenter<GenzongContract.View> implements GenzongContract.Presenter<GenzongContract.View>{

    private Api api;

    @Inject
    public GenzongPresenter(Api api){
      this.api = api;
    }

    @Override
    public void sendHuodong(String SESSIONID, String currentPage) {
        Subscription rxSubscription = api.gzHuodong(SESSIONID, currentPage)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Genzong>() {
                    @Override
                    public void onNext(Genzong genzong) {
                        if (mView != null) {
                            mView.showHuodong(genzong);
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
    public void sendSanhui(String SESSIONID, String currentPage) {
        Subscription rxSubscription = api.gzSanhui(SESSIONID, currentPage)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GenzongSh>() {
                    @Override
                    public void onNext(GenzongSh genzong) {
                        if (mView != null) {
                            mView.showSanhui(genzong);
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
