package com.lingdian.dangjian.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/6/24.
 */

public class Huiyinbi implements Serializable{


    /**
     * dataList : [{"showCreateTime":"2017-06-24 21:52:24","imgPaths":[],"showEchoWallReplyTime":"2017-06-20 12:48:58","regionName":"","quizBranchName":"安塞第一支部","isAuditing":"","quizMemberName":"开发015-转接","content":"啦啦","id":"8a4da0865cc3c24b015cc3d3b52e000a","isDelete":"","classify":"IC","title":"县级普通党员-全市可见","visibleRangeId":"","echoWallBranchName":"安塞第一支部","satisfaction":"","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":"Layla"},{"showCreateTime":"2017-06-24 21:52:24","imgPaths":[],"showEchoWallReplyTime":"2017-06-12 12:06:51","regionName":"","quizBranchName":"市级机关第三支部","isAuditing":"","quizMemberName":"开发003","content":"来了","id":"8a4da0865c9a0c3c015c9a7a8484004a","isDelete":"","classify":"OC","title":"来了","visibleRangeId":"","echoWallBranchName":"市级机关第三支部","satisfaction":"4","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":"好"},{"showCreateTime":"2017-06-24 21:52:24","imgPaths":[],"showEchoWallReplyTime":"2017-05-22 16:53:12","regionName":"","quizBranchName":"延安大学第三支部","isAuditing":"","quizMemberName":"普通党员","content":"下雨天路面积水严重","id":"8a4da0865c2e6c9c015c2f5786e100ec","isDelete":"","classify":"PL","title":"下雨天路面积水严重","visibleRangeId":"","echoWallBranchName":"延安党委1党总支第一党支部-支撑","satisfaction":"5","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":"好的，尽快派人去核查"},{"showCreateTime":"2017-06-24 21:52:24","imgPaths":[],"showEchoWallReplyTime":"2017-05-15 09:30:24","regionName":"","quizBranchName":"延安市支撑组党支部","isAuditing":"","quizMemberName":"开发人员001","content":"交通堵塞太严重，影响出行","id":"8a4da0865bfb4f4f015bfbab3fd00018","isDelete":"","classify":"OC","title":"交通堵塞严重","visibleRangeId":"","echoWallBranchName":"子长县直单位党工委第一党支部","satisfaction":"3","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":"Right Now"},{"showCreateTime":"2017-06-24 21:52:24","imgPaths":[],"showEchoWallReplyTime":"2017-05-12 15:57:33","regionName":"","quizBranchName":"延安市支撑组党支部","isAuditing":"","quizMemberName":"任庆雷","content":"部分市民到处乱扔垃圾废品，导致交通堵塞","id":"8a4da0865bfb4f4f015bfb68066a000b","isDelete":"","classify":"PL","title":"市民乱扔垃圾袋","visibleRangeId":"","echoWallBranchName":"延安市支撑组党支部","satisfaction":"3","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":"加强素质教育"},{"showCreateTime":"2017-06-24 21:52:24","imgPaths":[],"showEchoWallReplyTime":"2017-05-12 11:52:50","regionName":"","quizBranchName":"延安市支撑组党支部","isAuditing":"","quizMemberName":"开发人员001","content":"啦啦啦","id":"8a4da0865bf7d9a1015bfac92ce70083","isDelete":"","classify":"OC","title":"问题墙","visibleRangeId":"","echoWallBranchName":"延安市支撑组党支部","satisfaction":"8a4da0865bf7d9a1015bfac92ce70083","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":"呼呼呼"}]
     * currentPageObj : {"firstResult":0,"pageSize":10,"currentPage":1,"sumPageCount":1,"sumCount":6,"maxResult":6}
     * level : A
     * msgContent : 回音壁列表查询成功
     */

    private CurrentPageObjBean currentPageObj;
    private String level;
    private String msgContent;
    private List<DataListBean> dataList;

    public CurrentPageObjBean getCurrentPageObj() {
        return currentPageObj;
    }

    public void setCurrentPageObj(CurrentPageObjBean currentPageObj) {
        this.currentPageObj = currentPageObj;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public List<DataListBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<DataListBean> dataList) {
        this.dataList = dataList;
    }

    public static class CurrentPageObjBean implements Serializable {
        /**
         * firstResult : 0
         * pageSize : 10
         * currentPage : 1
         * sumPageCount : 1
         * sumCount : 6
         * maxResult : 6
         */

        private int firstResult;
        private int pageSize;
        private int currentPage;
        private int sumPageCount;
        private int sumCount;
        private int maxResult;

        public int getFirstResult() {
            return firstResult;
        }

        public void setFirstResult(int firstResult) {
            this.firstResult = firstResult;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getSumPageCount() {
            return sumPageCount;
        }

        public void setSumPageCount(int sumPageCount) {
            this.sumPageCount = sumPageCount;
        }

        public int getSumCount() {
            return sumCount;
        }

        public void setSumCount(int sumCount) {
            this.sumCount = sumCount;
        }

        public int getMaxResult() {
            return maxResult;
        }

        public void setMaxResult(int maxResult) {
            this.maxResult = maxResult;
        }
    }

    public static class DataListBean implements Serializable{
        /**
         * showCreateTime : 2017-06-24 21:52:24
         * imgPaths : []
         * showEchoWallReplyTime : 2017-06-20 12:48:58
         * regionName :
         * quizBranchName : 安塞第一支部
         * isAuditing :
         * quizMemberName : 开发015-转接
         * content : 啦啦
         * id : 8a4da0865cc3c24b015cc3d3b52e000a
         * isDelete :
         * classify : IC
         * title : 县级普通党员-全市可见
         * visibleRangeId :
         * echoWallBranchName : 安塞第一支部
         * satisfaction :
         * visibleRangeName :
         * quizMemberId :
         * echoWallReplyContent : Layla
         */

        private String showCreateTime;
        private String showEchoWallReplyTime;
        private String regionName;
        private String quizBranchName;
        private String isAuditing;
        private String quizMemberName;
        private String content;
        private String id;
        private String isDelete;
        private String classify;
        private String title;
        private String visibleRangeId;
        private String echoWallBranchName;
        private String satisfaction;
        private String visibleRangeName;
        private String quizMemberId;
        private String echoWallReplyContent;
        private List<?> imgPaths;

        public String getShowCreateTime() {
            return showCreateTime;
        }

        public void setShowCreateTime(String showCreateTime) {
            this.showCreateTime = showCreateTime;
        }

        public String getShowEchoWallReplyTime() {
            return showEchoWallReplyTime;
        }

        public void setShowEchoWallReplyTime(String showEchoWallReplyTime) {
            this.showEchoWallReplyTime = showEchoWallReplyTime;
        }

        public String getRegionName() {
            return regionName;
        }

        public void setRegionName(String regionName) {
            this.regionName = regionName;
        }

        public String getQuizBranchName() {
            return quizBranchName;
        }

        public void setQuizBranchName(String quizBranchName) {
            this.quizBranchName = quizBranchName;
        }

        public String getIsAuditing() {
            return isAuditing;
        }

        public void setIsAuditing(String isAuditing) {
            this.isAuditing = isAuditing;
        }

        public String getQuizMemberName() {
            return quizMemberName;
        }

        public void setQuizMemberName(String quizMemberName) {
            this.quizMemberName = quizMemberName;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIsDelete() {
            return isDelete;
        }

        public void setIsDelete(String isDelete) {
            this.isDelete = isDelete;
        }

        public String getClassify() {
            return classify;
        }

        public void setClassify(String classify) {
            this.classify = classify;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getVisibleRangeId() {
            return visibleRangeId;
        }

        public void setVisibleRangeId(String visibleRangeId) {
            this.visibleRangeId = visibleRangeId;
        }

        public String getEchoWallBranchName() {
            return echoWallBranchName;
        }

        public void setEchoWallBranchName(String echoWallBranchName) {
            this.echoWallBranchName = echoWallBranchName;
        }

        public String getSatisfaction() {
            return satisfaction;
        }

        public void setSatisfaction(String satisfaction) {
            this.satisfaction = satisfaction;
        }

        public String getVisibleRangeName() {
            return visibleRangeName;
        }

        public void setVisibleRangeName(String visibleRangeName) {
            this.visibleRangeName = visibleRangeName;
        }

        public String getQuizMemberId() {
            return quizMemberId;
        }

        public void setQuizMemberId(String quizMemberId) {
            this.quizMemberId = quizMemberId;
        }

        public String getEchoWallReplyContent() {
            return echoWallReplyContent;
        }

        public void setEchoWallReplyContent(String echoWallReplyContent) {
            this.echoWallReplyContent = echoWallReplyContent;
        }

        public List<?> getImgPaths() {
            return imgPaths;
        }

        public void setImgPaths(List<?> imgPaths) {
            this.imgPaths = imgPaths;
        }
    }
}
