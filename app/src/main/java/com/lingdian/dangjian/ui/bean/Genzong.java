package com.lingdian.dangjian.ui.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/6/24.
 */

public class Genzong {


    /**
     * dataList : [{"id":"8a4da0865c9bcb79015c9bd0c496000b","title":"标题","activitieType":{"id":"8a4da0865c153e1f015c15fe904201cd","showCreateTime":"2017-05-17 18:40:23","imgPath":"/files/image/activietype/20170517/166258fe537e4ed6a5dd78492debfd3a.jpg"},"showCreateTime":"2017-06-12 18:19:29","partyMemberName":"任庆雷"},{"id":"8a4da0865c9bb6a7015c9bc5ce15000e","title":"支部活动","activitieType":{"id":"8a4da0865c153e1f015c15fe904201cd","showCreateTime":"2017-05-17 18:40:23","imgPath":"/files/image/activietype/20170517/166258fe537e4ed6a5dd78492debfd3a.jpg"},"showCreateTime":"2017-06-12 18:07:30","partyMemberName":"任庆雷"},{"id":"8a4da0865c9b9409015c9ba1d2890025","title":"活动","activitieType":{"id":"8a4da0865c153e1f015c15fe904201cd","showCreateTime":"2017-05-17 18:40:23","imgPath":"/files/image/activietype/20170517/166258fe537e4ed6a5dd78492debfd3a.jpg"},"showCreateTime":"2017-06-12 17:28:12","partyMemberName":"任庆雷"},{"id":"8a4da0865c9b9409015c9b9c69890014","title":"活动","activitieType":{"id":"8a4da0865c153e1f015c15fe904201cd","showCreateTime":"2017-05-17 18:40:23","imgPath":"/files/image/activietype/20170517/166258fe537e4ed6a5dd78492debfd3a.jpg"},"showCreateTime":"2017-06-12 17:22:18","partyMemberName":"任庆雷"},{"id":"8a4da0865c0cbf01015c101a42380113","title":"子长县：创建两项制度 拓宽新任职干部管理监督方式","activitieType":{"id":"8a4da0865bc91c28015bcd3b018b0081","showCreateTime":"2017-05-16 15:05:58","imgPath":"/files/image/activietype/20170503/05f9be33cd6243999b640429139371bf.png"},"showCreateTime":"2017-05-16 15:12:55","partyMemberName":"18800000022"}]
     * currentPageObj : {"currentPage":1,"sumPageCount":1,"sumCount":5}
     * level : A
     * msgContent : 查询支部活动列表成功
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
         * currentPage : 1
         * sumPageCount : 1
         * sumCount : 5
         */

        private int currentPage;
        private int sumPageCount;
        private int sumCount;

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
    }

    public static class DataListBean {
        /**
         * id : 8a4da0865c9bcb79015c9bd0c496000b
         * title : 标题
         * activitieType : {"id":"8a4da0865c153e1f015c15fe904201cd","showCreateTime":"2017-05-17 18:40:23","imgPath":"/files/image/activietype/20170517/166258fe537e4ed6a5dd78492debfd3a.jpg"}
         * showCreateTime : 2017-06-12 18:19:29
         * partyMemberName : 任庆雷
         */

        private String id;
        private String title;
        private ActivitieTypeBean activitieType;
        private String showCreateTime;
        private String partyMemberName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public ActivitieTypeBean getActivitieType() {
            return activitieType;
        }

        public void setActivitieType(ActivitieTypeBean activitieType) {
            this.activitieType = activitieType;
        }

        public String getShowCreateTime() {
            return showCreateTime;
        }

        public void setShowCreateTime(String showCreateTime) {
            this.showCreateTime = showCreateTime;
        }

        public String getPartyMemberName() {
            return partyMemberName;
        }

        public void setPartyMemberName(String partyMemberName) {
            this.partyMemberName = partyMemberName;
        }

        public static class ActivitieTypeBean {
            /**
             * id : 8a4da0865c153e1f015c15fe904201cd
             * showCreateTime : 2017-05-17 18:40:23
             * imgPath : /files/image/activietype/20170517/166258fe537e4ed6a5dd78492debfd3a.jpg
             */

            private String id;
            private String showCreateTime;
            private String imgPath;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
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
        }
    }
}
