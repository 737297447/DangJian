package com.lingdian.dangjian.ui.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/6/24.
 */

public class GenzongSh {


    /**
     * dataList : [{"praiseCount":0,"showCreateTime":"2017-05-31 17:53:48","imgPaths":[],"degreeCount":0,"partyBranchId":"","commentCount":0,"partyBranchName":"","id":"8a4da0865c5c604c015c5decf09c0223","forwardCount":0,"title":"会议","partyMember":null,"meetingPlace":"","threelessonsType":{"id":"8a4da0865bce54fd015bd1549fa50079","imgName":"bf6b8fd7bf9b484490ab486738b58e36.jpg","showCreateTime":"2017-05-15 13:50:46","imgPath":"/files/image/threetype/20170504/bf6b8fd7bf9b484490ab486738b58e36.jpg","type":"党员代表会"},"partyMemberName":"任庆雷","videoPaths":[]},{"praiseCount":0,"showCreateTime":"2017-05-27 17:20:15","imgPaths":[],"degreeCount":0,"partyBranchId":"","commentCount":0,"partyBranchName":"","id":"8a4da0865c4866c3015c4934c9c600e8","forwardCount":0,"title":"三会一课","partyMember":null,"meetingPlace":"","threelessonsType":{"id":"8a4da0865bce54fd015bd1549fa50079","imgName":"bf6b8fd7bf9b484490ab486738b58e36.jpg","showCreateTime":"2017-05-15 13:50:46","imgPath":"/files/image/threetype/20170504/bf6b8fd7bf9b484490ab486738b58e36.jpg","type":"党员代表会"},"partyMemberName":"任庆雷","videoPaths":[]}]
     * currentPageObj : {"firstResult":0,"pageSize":10,"currentPage":1,"sumPageCount":1,"sumCount":2,"maxResult":2}
     * level : A
     * msgContent : 查询三会一课列表成功
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

    public static class CurrentPageObjBean {
        /**
         * firstResult : 0
         * pageSize : 10
         * currentPage : 1
         * sumPageCount : 1
         * sumCount : 2
         * maxResult : 2
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

    public static class DataListBean {
        /**
         * praiseCount : 0
         * showCreateTime : 2017-05-31 17:53:48
         * imgPaths : []
         * degreeCount : 0
         * partyBranchId :
         * commentCount : 0
         * partyBranchName :
         * id : 8a4da0865c5c604c015c5decf09c0223
         * forwardCount : 0
         * title : 会议
         * partyMember : null
         * meetingPlace :
         * threelessonsType : {"id":"8a4da0865bce54fd015bd1549fa50079","imgName":"bf6b8fd7bf9b484490ab486738b58e36.jpg","showCreateTime":"2017-05-15 13:50:46","imgPath":"/files/image/threetype/20170504/bf6b8fd7bf9b484490ab486738b58e36.jpg","type":"党员代表会"}
         * partyMemberName : 任庆雷
         * videoPaths : []
         */

        private int praiseCount;
        private String showCreateTime;
        private int degreeCount;
        private String partyBranchId;
        private int commentCount;
        private String partyBranchName;
        private String id;
        private int forwardCount;
        private String title;
        private Object partyMember;
        private String meetingPlace;
        private ThreelessonsTypeBean threelessonsType;
        private String partyMemberName;
        private List<?> imgPaths;
        private List<?> videoPaths;

        public int getPraiseCount() {
            return praiseCount;
        }

        public void setPraiseCount(int praiseCount) {
            this.praiseCount = praiseCount;
        }

        public String getShowCreateTime() {
            return showCreateTime;
        }

        public void setShowCreateTime(String showCreateTime) {
            this.showCreateTime = showCreateTime;
        }

        public int getDegreeCount() {
            return degreeCount;
        }

        public void setDegreeCount(int degreeCount) {
            this.degreeCount = degreeCount;
        }

        public String getPartyBranchId() {
            return partyBranchId;
        }

        public void setPartyBranchId(String partyBranchId) {
            this.partyBranchId = partyBranchId;
        }

        public int getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(int commentCount) {
            this.commentCount = commentCount;
        }

        public String getPartyBranchName() {
            return partyBranchName;
        }

        public void setPartyBranchName(String partyBranchName) {
            this.partyBranchName = partyBranchName;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getForwardCount() {
            return forwardCount;
        }

        public void setForwardCount(int forwardCount) {
            this.forwardCount = forwardCount;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Object getPartyMember() {
            return partyMember;
        }

        public void setPartyMember(Object partyMember) {
            this.partyMember = partyMember;
        }

        public String getMeetingPlace() {
            return meetingPlace;
        }

        public void setMeetingPlace(String meetingPlace) {
            this.meetingPlace = meetingPlace;
        }

        public ThreelessonsTypeBean getThreelessonsType() {
            return threelessonsType;
        }

        public void setThreelessonsType(ThreelessonsTypeBean threelessonsType) {
            this.threelessonsType = threelessonsType;
        }

        public String getPartyMemberName() {
            return partyMemberName;
        }

        public void setPartyMemberName(String partyMemberName) {
            this.partyMemberName = partyMemberName;
        }

        public List<?> getImgPaths() {
            return imgPaths;
        }

        public void setImgPaths(List<?> imgPaths) {
            this.imgPaths = imgPaths;
        }

        public List<?> getVideoPaths() {
            return videoPaths;
        }

        public void setVideoPaths(List<?> videoPaths) {
            this.videoPaths = videoPaths;
        }

        public static class ThreelessonsTypeBean {
            /**
             * id : 8a4da0865bce54fd015bd1549fa50079
             * imgName : bf6b8fd7bf9b484490ab486738b58e36.jpg
             * showCreateTime : 2017-05-15 13:50:46
             * imgPath : /files/image/threetype/20170504/bf6b8fd7bf9b484490ab486738b58e36.jpg
             * type : 党员代表会
             */

            private String id;
            private String imgName;
            private String showCreateTime;
            private String imgPath;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getImgName() {
                return imgName;
            }

            public void setImgName(String imgName) {
                this.imgName = imgName;
            }

            public String getShowCreateTime() {
                return showCreateTime;
            }

            public void setShowCreateTime(String showCreateTime) {
                this.showCreateTime = showCreateTime;
            }

            public String getImgPath() {
                return imgPath;
            }

            public void setImgPath(String imgPath) {
                this.imgPath = imgPath;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
