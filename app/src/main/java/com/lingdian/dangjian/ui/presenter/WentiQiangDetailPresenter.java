package com.lingdian.dangjian.ui.presenter;


import com.lingdian.dangjian.api.Api;
import com.lingdian.dangjian.base.BaseBean;
import com.lingdian.dangjian.base.RxPresenter;
import com.lingdian.dangjian.ui.bean.HuiyinbiDetail;
import com.lingdian.dangjian.ui.contract.WentiQiangDetailContract;

import javax.inject.Inject;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/1/16.
 */

public class WentiQiangDetailPresenter extends RxPresenter<WentiQiangDetailContract.View> implements WentiQiangDetailContract.Presenter<WentiQiangDetailContract.View>{

    private Api api;

    @Inject
    public WentiQiangDetailPresenter(Api api){
      this.api = api;
    }



    @Override
    public void sendHuifu(String replyContent, String SESSIONID, String problemWallId) {
        Subscription rxSubscription = api.wtqHuifu(replyContent, SESSIONID,problemWallId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseBean>() {
                    @Override
                    public void onNext(BaseBean baseBean) {
                        if (mView != null) {
                            mView.showHuifu(baseBean);
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
    public void sendHuiyinbi(String id, String SESSIONID) {

        Subscription rxSubscription = api.huiyinbiDetail(id, SESSIONID)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HuiyinbiDetail>() {
                    @Override
                    public void onNext(HuiyinbiDetail detail) {
                        if (mView != null) {
                            mView.showHuiyinbi(detail);
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
