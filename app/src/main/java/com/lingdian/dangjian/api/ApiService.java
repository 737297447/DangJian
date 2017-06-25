package com.lingdian.dangjian.api;

import com.lingdian.dangjian.base.BaseBean;
import com.lingdian.dangjian.ui.bean.Genzong;
import com.lingdian.dangjian.ui.bean.GenzongSh;
import com.lingdian.dangjian.ui.bean.Huiyinbi;
import com.lingdian.dangjian.ui.bean.HuiyinbiDetail;
import com.lingdian.dangjian.ui.bean.Kaoshi;
import com.lingdian.dangjian.ui.bean.Sanhui;
import com.lingdian.dangjian.ui.bean.User;
import com.lingdian.dangjian.ui.bean.WentiQiang;
import com.lingdian.dangjian.ui.bean.Xinde;
import com.lingdian.dangjian.ui.bean.Zuzhichaxun;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/1/16.
 */

public interface ApiService {




    @POST("/pmc/mobile/login")
    Observable<User> login(@Query("account") String accoount, @Query("password") String password);


    /**
     * 心得体会
     * @param SESSIONID
     * @param currentPage
     * @return
     */
    @POST("/pmc/mobile/findExperiences")
    Observable<Xinde> xinde(@Query("SESSIONID") String SESSIONID, @Query("currentPage") String currentPage);


    /**
     * 跟踪督查活动
     * @param SESSIONID
     * @param currentPage
     * @return
     */
    @POST("/pmc/mobile/findBranchActivities")
    Observable<Genzong> gzHuodong(@Query("SESSIONID") String SESSIONID, @Query("currentPage") String currentPage);


    /**
     * 跟踪督查三会
     * @param SESSIONID
     * @param currentPage
     * @return
     */
    @POST("/pmc/mobile/findThreelessonss")
    Observable<GenzongSh> gzSanhui(@Query("SESSIONID") String SESSIONID, @Query("currentPage") String currentPage);


    /**
     * 在线考试
     * @param SESSIONID
     * @return
     */
    @POST("/pmc/mobile/getQuestionByPartyMember")
    Observable<Kaoshi> kaoshi(@Query("SESSIONID") String SESSIONID);


    /**
     * 提交答案
     * @param answer
     * @param id
     * @param intervalTime
     * @param SESSIONID
     * @return
     */
    @POST("/pmc/mobile/submitQuestionAnswer")
    Observable<BaseBean> submitKaoshi(@Query("answer") String answer,@Query("id") String id,
                                      @Query("intervalTime") String intervalTime,@Query("SESSIONID") String SESSIONID);


    /**
     * 问题墙
     * @param SESSIONID
     * @param currentPage
     * @param source
     * @return
     */
    @POST("/pmc/mobile/findProblemWalls")
    Observable<WentiQiang> wentiqiang(@Query("SESSIONID") String SESSIONID, @Query("currentPage") String currentPage,
                                      @Query("source") String source);


    /**
     * 问题墙回复
     * @param replyContent
     * @param SESSIONID
     * @param problemWallId
     * @return
     */
    @POST("/pmc/mobile/problemWallReply")
    Observable<BaseBean> wtqHuifu(@Query("replyContent") String replyContent, @Query("SESSIONID") String SESSIONID,
                                      @Query("problemWallId") String problemWallId);

    /**
     * 回音壁
     * @param SESSIONID
     * @param currentPage
     * @param source
     * @return
     */
    @POST("/pmc/mobile/findEchoWalls")
    Observable<Huiyinbi> huiyinbi(@Query("SESSIONID") String SESSIONID, @Query("currentPage") String currentPage,
                                  @Query("source") String source);


    /**
     * 回音壁详情
     * @param id
     * @param SESSIONID
     * @return
     */
    @POST("/pmc/mobile/findProblemWallDetailInfo")
    Observable<HuiyinbiDetail> huiyinbiDetail(@Query("id") String id, @Query("SESSIONID") String SESSIONID);


    /**
     * 三会一课
     * @param currentPage
     * @param SESSIONID
     * @return
     */
    @POST("/pmc/mobile/findThreelessonss")
    Observable<Sanhui> sanhui(@Query("SESSIONID") String SESSIONID, @Query("currentPage") String currentPage);


    /**
     * 组织查询
     * @param id
     * @param type
     * @param SESSIONID
     * @return
     */
    @POST("/pmc/mobile/getPartyBranchNodesByPid")
    Observable<Zuzhichaxun> zuzhichaxun(@Query("id") String id, @Query("type") String type,
                                        @Query("SESSIONID") String SESSIONID);

}
