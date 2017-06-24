package com.lingdian.dangjian.api;


import com.lingdian.dangjian.base.BaseBean;
import com.lingdian.dangjian.base.Constant;
import com.lingdian.dangjian.ui.bean.Genzong;
import com.lingdian.dangjian.ui.bean.GenzongSh;
import com.lingdian.dangjian.ui.bean.Huiyinbi;
import com.lingdian.dangjian.ui.bean.HuiyinbiDetail;
import com.lingdian.dangjian.ui.bean.Kaoshi;
import com.lingdian.dangjian.ui.bean.Sanhui;
import com.lingdian.dangjian.ui.bean.User;
import com.lingdian.dangjian.ui.bean.WentiQiang;
import com.lingdian.dangjian.ui.bean.Xinde;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import rx.Observable;

/**
 * Created by Administrator on 2017/1/16.
 */

public class Api {

    public static Api instance;
    private ApiService service;

    public Api(OkHttpClient okHttpClient) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.API_BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build();
        service = retrofit.create(ApiService.class);
    }


    public static Api getInstance(OkHttpClient okHttpClient) {
        if (instance == null)
            instance = new Api(okHttpClient);
        return instance;
    }




    public Observable<User> login(String account, String password){

        return service.login(account,password);
    }



    public Observable<Xinde> xinde(String SESSIONID, String currentPage){
        return service.xinde(SESSIONID,currentPage);
    }


    public Observable<Genzong> gzHuodong(String SESSIONID, String currentPage){
        return service.gzHuodong(SESSIONID,currentPage);
    }


    public Observable<GenzongSh> gzSanhui(String SESSIONID, String currentPage){
        return service.gzSanhui(SESSIONID,currentPage);
    }

    public Observable<Kaoshi> kaoshi(String SESSIONID){
        return service.kaoshi(SESSIONID);
    }

    public Observable<BaseBean> submitKaoshi(String answer,String id, String intervalTime, String SESSIONID){

        return service.submitKaoshi(answer,id,intervalTime,SESSIONID);
    }


    public Observable<WentiQiang> wentiqiang(String SESSIONID, String currentPage, String source){
        return service.wentiqiang(SESSIONID,currentPage,source);
    }

    public Observable<BaseBean> wtqHuifu(String replyContent,String SESSIONID, String problemWallId){
        return service.wtqHuifu(replyContent,SESSIONID,problemWallId);
    }

    public Observable<Huiyinbi> huiyinbi(String SESSIONID, String currentPage, String source){
        return service.huiyinbi(SESSIONID,currentPage,source);
    }

    public Observable<HuiyinbiDetail> huiyinbiDetail(String id, String SESSIONID){
        return service.huiyinbiDetail(id,SESSIONID);
    }


    public Observable<Sanhui> sanhui(String SESSIONID, String currentPage){
        return service.sanhui(SESSIONID,currentPage);
    }


}
