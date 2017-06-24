package com.lingdian.dangjian.ui.presenter;


import com.lingdian.dangjian.api.Api;
import com.lingdian.dangjian.base.BaseBean;
import com.lingdian.dangjian.base.RxPresenter;
import com.lingdian.dangjian.ui.bean.User;
import com.lingdian.dangjian.ui.contract.LoginContract;
import com.lingdian.dangjian.ui.contract.Main1Contract;

import javax.inject.Inject;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/1/16.
 */

public class LoginPresenter extends RxPresenter<LoginContract.View> implements LoginContract.Presenter<LoginContract.View>{

    private Api api;

    @Inject
    public LoginPresenter(Api api){
      this.api = api;
    }

    @Override
    public void sendLogin(String account, String password) {

        Subscription rxSubscription = api.login(account, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<User>() {
                    @Override
                    public void onNext(User user) {
                        if (mView != null) {
                            mView.showLogin(user);
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
