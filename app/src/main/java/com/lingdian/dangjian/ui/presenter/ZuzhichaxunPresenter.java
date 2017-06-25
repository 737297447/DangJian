package com.lingdian.dangjian.ui.presenter;


import com.lingdian.dangjian.api.Api;
import com.lingdian.dangjian.base.RxPresenter;
import com.lingdian.dangjian.ui.bean.Zuzhichaxun;
import com.lingdian.dangjian.ui.contract.ZuzhichaxunContract;

import javax.inject.Inject;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/1/16.
 */

public class ZuzhichaxunPresenter extends RxPresenter<ZuzhichaxunContract.View> implements ZuzhichaxunContract.Presenter<ZuzhichaxunContract.View>{

    private Api api;

    @Inject
    public ZuzhichaxunPresenter(Api api){
      this.api = api;
    }

    @Override
    public void sendBranch(String id, String type, String SESSIONID) {
        Subscription rxSubscription = api.zuzhichaxun(id,type,SESSIONID)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Zuzhichaxun>() {
                    @Override
                    public void onNext(Zuzhichaxun zuzhichaxun) {
                        if (mView != null) {
                            mView.showZuzhi(zuzhichaxun);
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
