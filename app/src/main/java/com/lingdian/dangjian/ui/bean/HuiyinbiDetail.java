package com.lingdian.dangjian.ui.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/6/24.
 */

public class HuiyinbiDetail {


    /**
     * level : A
     * problemWall : {"echoWallReplyTime":null,"showCreateTime":"2017-06-22 09:45:41","imgPaths":[],"showEchoWallReplyTime":"","regionName":"全市","quizBranchName":"延安大学第一支部","quizMemberName":"延安大学六级","isAuditing":"","content":"啦啦","id":"8a4da0865ccd74f3015ccd79f6dd0013","isDelete":"","classify":"OC","visibleRangeId":"610600","title":"延安大学六级\u2013本单位可见\u2013安卓","source":"CA","echoWallBranchName":"","visibleRangeName":"延安市","quizMemberId":"5cfce1ac06494d50aafb9388fb67ea01","imgNamess":[],"echoWallReplyContent":""}
     * echoWalls : [{"id":"","replyBranchName":"延安党委1党总支第一党支部-支撑","problemWall":null,"showCreateTime":"2017-06-24 20:47:36","replyMemberName":"王毅","replyContent":"大结局"},{"id":"","replyBranchName":"延安党委1党总支第一党支部-支撑","problemWall":null,"showCreateTime":"2017-06-24 20:39:01","replyMemberName":"王毅","replyContent":"患得患失"},{"id":"","replyBranchName":"延安党委1党总支第一党支部-支撑","problemWall":null,"showCreateTime":"2017-06-24 20:38:38","replyMemberName":"王毅","replyContent":"等会回家"},{"id":"","replyBranchName":"延安党委1党总支第一党支部-支撑","problemWall":null,"showCreateTime":"2017-06-24 20:38:15","replyMemberName":"王毅","replyContent":"呃呃呃"}]
     * msgContent : 问题墙详情查询成功
     */

    private String level;
    private ProblemWallBean problemWall;
    private String msgContent;
    private List<EchoWallsBean> echoWalls;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ProblemWallBean getProblemWall() {
        return problemWall;
    }

    public void setProblemWall(ProblemWallBean problemWall) {
        this.problemWall = problemWall;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public List<EchoWallsBean> getEchoWalls() {
        return echoWalls;
    }

    public void setEchoWalls(List<EchoWallsBean> echoWalls) {
        this.echoWalls = echoWalls;
    }

    public static class ProblemWallBean {
        /**
         * echoWallReplyTime : null
         * showCreateTime : 2017-06-22 09:45:41
         * imgPaths : []
         * showEchoWallReplyTime :
         * regionName : 全市
         * quizBranchName : 延安大学第一支部
         * quizMemberName : 延安大学六级
         * isAuditing :
         * content : 啦啦
         * id : 8a4da0865ccd74f3015ccd79f6dd0013
         * isDelete :
         * classify : OC
         * visibleRangeId : 610600
         * title : 延安大学六级–本单位可见–安卓
         * source : CA
         * echoWallBranchName :
         * visibleRangeName : 延安市
         * quizMemberId : 5cfce1ac06494d50aafb9388fb67ea01
         * imgNamess : []
         * echoWallReplyContent :
         */

        private Object echoWallReplyTime;
        private String showCreateTime;
        private String showEchoWallReplyTime;
        private String regionName;
        private String quizBranchName;
        private String quizMemberName;
        private String isAuditing;
        private String content;
        private String id;
        private String isDelete;
        private String classify;
        private String visibleRangeId;
        private String title;
        private String source;
        private String echoWallBranchName;
        private String visibleRangeName;
        private String quizMemberId;
        private String echoWallReplyContent;
        private List<?> imgPaths;
        private List<?> imgNamess;

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

        public String getQuizMemberName() {
            return quizMemberName;
        }

        public void setQuizMemberName(String quizMemberName) {
            this.quizMemberName = quizMemberName;
        }

        public String getIsAuditing() {
            return isAuditing;
        }

        public void setIsAuditing(String isAuditing) {
            this.isAuditing = isAuditing;
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

        public String getVisibleRangeId() {
            return visibleRangeId;
        }

        public void setVisibleRangeId(String visibleRangeId) {
            this.visibleRangeId = visibleRangeId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getEchoWallBranchName() {
            return echoWallBranchName;
        }

        public void setEchoWallBranchName(String echoWallBranchName) {
            this.echoWallBranchName = echoWallBranchName;
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

        public List<?> getImgNamess() {
            return imgNamess;
        }

        public void setImgNamess(List<?> imgNamess) {
            this.imgNamess = imgNamess;
        }
    }

    public static class EchoWallsBean {
        /**
         * id :
         * replyBranchName : 延安党委1党总支第一党支部-支撑
         * problemWall : null
         * showCreateTime : 2017-06-24 20:47:36
         * replyMemberName : 王毅
         * replyContent : 大结局
         */

        private String id;
        private String replyBranchName;
        private Object problemWall;
        private String showCreateTime;
        private String replyMemberName;
        private String replyContent;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getReplyBranchName() {
            return replyBranchName;
        }

        public void setReplyBranchName(String replyBranchName) {
            this.replyBranchName = replyBranchName;
        }

        public Object getProblemWall() {
            return problemWall;
        }

        public void setProblemWall(Object problemWall) {
            this.problemWall = problemWall;
        }

        public String getShowCreateTime() {
            return showCreateTime;
        }

        public void setShowCreateTime(String showCreateTime) {
            this.showCreateTime = showCreateTime;
        }

        public String getReplyMemberName() {
            return replyMemberName;
        }

        public void setReplyMemberName(String replyMemberName) {
            this.replyMemberName = replyMemberName;
        }

        public String getReplyContent() {
            return replyContent;
        }

        public void setReplyContent(String replyContent) {
            this.replyContent = replyContent;
        }
    }
}
