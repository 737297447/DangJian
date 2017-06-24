package com.lingdian.dangjian.ui.presenter;


import com.lingdian.dangjian.api.Api;
import com.lingdian.dangjian.base.BaseBean;
import com.lingdian.dangjian.base.RxPresenter;
import com.lingdian.dangjian.ui.bean.Kaoshi;
import com.lingdian.dangjian.ui.contract.KaoshiContract;

import javax.inject.Inject;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/1/16.
 */

public class KaoshiPresenter extends RxPresenter<KaoshiContract.View> implements KaoshiContract.Presenter<KaoshiContract.View> {

    private Api api;

    @Inject
    public KaoshiPresenter(Api api) {
        this.api = api;
    }

    @Override
    public void sendKaoshi(String SESSIONID) {

        Subscription rxSubscription = api.kaoshi(SESSIONID)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Kaoshi>() {
                    @Override
                    public void onNext(Kaoshi kaoshi) {
                        if (mView != null) {
                            mView.showKaoshi(kaoshi);
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
    public void submitKaoshi(String answer, String id, String intervalTime, String SESSIONID) {
        Subscription rxSubscription = api.submitKaoshi(answer, id, intervalTime, SESSIONID)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseBean>() {
                    @Override
                    public void onNext(BaseBean baseBean) {
                        if (mView != null) {
                            mView.showSumbit(baseBean);
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
