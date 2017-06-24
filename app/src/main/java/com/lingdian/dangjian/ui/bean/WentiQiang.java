package com.lingdian.dangjian.ui.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/6/24.
 */

public class WentiQiang implements Serializable{


    /**
     * dataList : [{"echoWallReplyTime":null,"showCreateTime":"2017-06-22 10:39:47","imgPaths":[],"showEchoWallReplyTime":"","regionName":"","quizBranchName":"延安大学第三支部","isAuditing":"","quizMemberName":"普通党员","content":"112","id":"8a4da0865ccd9088015ccdab7e9c00fc","isDelete":"","classify":"OC","title":"112","visibleRangeId":"","echoWallBranchName":"","satisfaction":"","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":""},{"echoWallReplyTime":null,"showCreateTime":"2017-06-22 10:39:39","imgPaths":[],"showEchoWallReplyTime":"","regionName":"","quizBranchName":"延安大学第三支部","isAuditing":"","quizMemberName":"普通党员","content":"111","id":"8a4da0865ccd9088015ccdab5e9100fa","isDelete":"","classify":"OC","title":"111","visibleRangeId":"","echoWallBranchName":"","satisfaction":"","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":""},{"echoWallReplyTime":null,"showCreateTime":"2017-06-22 10:39:20","imgPaths":[],"showEchoWallReplyTime":"","regionName":"","quizBranchName":"延安大学第三支部","isAuditing":"","quizMemberName":"延安大学十级","content":"102","id":"8a4da0865ccd9088015ccdab158200f7","isDelete":"","classify":"IC","title":"102","visibleRangeId":"","echoWallBranchName":"","satisfaction":"","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":""},{"echoWallReplyTime":null,"showCreateTime":"2017-06-22 10:39:10","imgPaths":[],"showEchoWallReplyTime":"","regionName":"","quizBranchName":"延安大学第三支部","isAuditing":"","quizMemberName":"延安大学十级","content":"101","id":"8a4da0865ccd9088015ccdaaf0a400f5","isDelete":"","classify":"OC","title":"101","visibleRangeId":"","echoWallBranchName":"","satisfaction":"","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":""},{"echoWallReplyTime":null,"showCreateTime":"2017-06-22 10:38:51","imgPaths":[],"showEchoWallReplyTime":"","regionName":"","quizBranchName":"延安大学第三支部","isAuditing":"","quizMemberName":"延安大学九级","content":"92","id":"8a4da0865ccd9088015ccdaaa48800f1","isDelete":"","classify":"IC","title":"92","visibleRangeId":"","echoWallBranchName":"","satisfaction":"","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":""},{"echoWallReplyTime":null,"showCreateTime":"2017-06-22 10:38:39","imgPaths":[],"showEchoWallReplyTime":"","regionName":"","quizBranchName":"延安大学第三支部","isAuditing":"","quizMemberName":"延安大学九级","content":"91","id":"8a4da0865ccd9088015ccdaa757900ef","isDelete":"","classify":"IC","title":"91","visibleRangeId":"","echoWallBranchName":"","satisfaction":"","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":""},{"echoWallReplyTime":null,"showCreateTime":"2017-06-22 10:38:21","imgPaths":[],"showEchoWallReplyTime":"","regionName":"","quizBranchName":"延安大学第二支部","isAuditing":"","quizMemberName":"延安大学七级","content":"72","id":"8a4da0865ccd9088015ccdaa2dd200ec","isDelete":"","classify":"OC","title":"72","visibleRangeId":"","echoWallBranchName":"","satisfaction":"","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":""},{"echoWallReplyTime":null,"showCreateTime":"2017-06-22 10:38:10","imgPaths":[],"showEchoWallReplyTime":"","regionName":"","quizBranchName":"延安大学第二支部","isAuditing":"","quizMemberName":"延安大学七级","content":"71","id":"8a4da0865ccd9088015ccdaa043100ea","isDelete":"","classify":"OC","title":"71","visibleRangeId":"","echoWallBranchName":"","satisfaction":"","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":""},{"echoWallReplyTime":null,"showCreateTime":"2017-06-22 10:37:49","imgPaths":[],"showEchoWallReplyTime":"","regionName":"","quizBranchName":"延安大学第一支部","isAuditing":"","quizMemberName":"延安大学六级","content":"62","id":"8a4da0865ccd9088015ccda9b38100e7","isDelete":"","classify":"IC","title":"62","visibleRangeId":"","echoWallBranchName":"","satisfaction":"","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":""},{"echoWallReplyTime":null,"showCreateTime":"2017-06-22 10:37:40","imgPaths":[],"showEchoWallReplyTime":"","regionName":"","quizBranchName":"延安大学第一支部","isAuditing":"","quizMemberName":"延安大学六级","content":"61","id":"8a4da0865ccd9088015ccda98f8e00e5","isDelete":"","classify":"IC","title":"61","visibleRangeId":"","echoWallBranchName":"","satisfaction":"","visibleRangeName":"","quizMemberId":"","echoWallReplyContent":""}]
     * currentPageObj : {"firstResult":0,"pageSize":10,"currentPage":1,"sumPageCount":21,"sumCount":209,"maxResult":10}
     * level : A
     * msgContent : 问题墙列表查询成功
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

    public static class CurrentPageObjBean implements Serializable{
        /**
         * firstResult : 0
         * pageSize : 10
         * currentPage : 1
         * sumPageCount : 21
         * sumCount : 209
         * maxResult : 10
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
         * echoWallReplyTime : null
         * showCreateTime : 2017-06-22 10:39:47
         * imgPaths : []
         * showEchoWallReplyTime :
         * regionName :
         * quizBranchName : 延安大学第三支部
         * isAuditing :
         * quizMemberName : 普通党员
         * content : 112
         * id : 8a4da0865ccd9088015ccdab7e9c00fc
         * isDelete :
         * classify : OC
         * title : 112
         * visibleRangeId :
         * echoWallBranchName :
         * satisfaction :
         * visibleRangeName :
         * quizMemberId :
         * echoWallReplyContent :
         */

        private Object echoWallReplyTime;
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

        public Object getEchoWallReplyTime() {
            return echoWallReplyTime;
        }

        public void setEchoWallReplyTime(Object echoWallReplyTime) {
            this.echoWallReplyTime = echoWallReplyTime;
        }

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
