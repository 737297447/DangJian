package com.lingdian.dangjian.ui.bean;

import java.io.Serializable;

/**
 * Created by longhy on 2017/6/22.
 */

public class User implements Serializable{


    /**
     * resourceCtx : http://yadj.airwalker.net/pmc
     * curPartyMember : {"displayBirthday":"1989-05-11","phone":"18200000031","showCreateTime":"2017-05-03 11:41:39","workUnit":"子长县支撑组","isPraiseForToday":"","isPunish":"N","partyBranchType":"","wages":10000,"city":"延安","photoPath":"/files/image/person/20170503/da0ec27b07ed4a55ae315bc5af0ef537/686a941a549e4bbbbe7b49c0a9278803.jpg","isPoor":"N","homeplaceDist":"宝塔区","countyRegion":null,"age":28,"province":"陕西","isFlow":"N","isOnlineStatics":"Y","academicDegree":"-1","occupation":"WORKER","partyPost":"","townRegion":null,"idcard":"61032215641321123","isJoinGroup":"Y","homeplaceAdress":"","partyBranch":{"partyTotalBranch":null,"phone":"1","showCreateTime":"2017-05-19 13:50:06","branchIdsChain":"8a4da0865c1efe6a015c1f418557003d","myPartyTotalBranchId":"","myPartyCommitteeLayer":0,"type":"COUNTRYSIDE","partyWorkCommit":{"id":"8a4da0865c16d55d015c1ebead23042d","phone":"","showCreateTime":"2017-05-19 11:27:11","address":"","name":"市级机关工委--支撑"},"id":"8a4da0865c1efe6a015c1f418557003d","groupId":"gg8019127827","myPartyWorkCommitId":"8a4da0865c16d55d015c1ebead23042d","partyCommittee":null,"address":"1","myPartyCommitteeId":"","name":"市级机关支部--支撑","myPctIdsChain":""},"nation":"HAN","showWorkDate":"2014-05-08","isShuji":"N","showJoinPartyDate":"2012-05-10","personRemark":"","starCount":1,"showOfficeDate":"","partyDues":36,"motto":"","dist":"宝塔区","isTransferBranch":"N","sex":"m","development":"","beforeBranchName":"","showBecomeDate":"2017-05-18","education":"BJ","stage":"regular","majorPost":"","partyBranchName":"","id":"da0ec27b07ed4a55ae315bc5af0ef537","isPraise":"N","roleNum":3,"administrationPost":"-1","praiseContent":"","roleShowName":"","homeplaceProvince":"陕西","punishType":"W","name":"蒲少龙","orgMinistry":{"id":"8a4da0865c16d55d015c1eba46af040d","level":"OLCD","showCreateTime":"2017-05-19 11:22:23","name":"书记"},"showPartyDuesEndDate":"","roleDispayName":"三级","workUnitAttr":"","orgDuties":"CSHUJI","homeplaceCity":"延安","totalPraiseCount":1,"address":"科技路","cityRegion":{"id":"610600","sort":0,"level":"rlc","showCreateTime":"2017-06-22 09:35:09","name":"延安市"},"isManager":"N"}
     * learningProfile : {"showBeginTime":"2017-05-20","partyMemberId":"","logTime":null,"showLogTime":"","todayHours":60,"partyBranchName":"","showEndTime":"2017-06-22","photoPath":"","id":"8a4da0865c1efe6a015c249d908706c9","partyMemberName":"","partyMemberPhotoName":"","partyMemberTimeStampFolder":"","hourAndMinute":"15分钟"}
     * rank : 385
     * level : A
     * curSource : APP
     * unreadTaskCount : 4
     * curRoleId : RCMF
     * msgContent :
     * unreadMsgCount : 5
     * SESSIONID : 5E46CE1A10579B391410388938317CB5
     */

    private String resourceCtx;
    private CurPartyMemberBean curPartyMember;
    private LearningProfileBean learningProfile;
    private int rank;
    private String level;
    private String curSource;
    private int unreadTaskCount;
    private String curRoleId;
    private String msgContent;
    private int unreadMsgCount;
    private String SESSIONID;

    public String getResourceCtx() {
        return resourceCtx;
    }

    public void setResourceCtx(String resourceCtx) {
        this.resourceCtx = resourceCtx;
    }

    public CurPartyMemberBean getCurPartyMember() {
        return curPartyMember;
    }

    public void setCurPartyMember(CurPartyMemberBean curPartyMember) {
        this.curPartyMember = curPartyMember;
    }

    public LearningProfileBean getLearningProfile() {
        return learningProfile;
    }

    public void setLearningProfile(LearningProfileBean learningProfile) {
        this.learningProfile = learningProfile;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCurSource() {
        return curSource;
    }

    public void setCurSource(String curSource) {
        this.curSource = curSource;
    }

    public int getUnreadTaskCount() {
        return unreadTaskCount;
    }

    public void setUnreadTaskCount(int unreadTaskCount) {
        this.unreadTaskCount = unreadTaskCount;
    }

    public String getCurRoleId() {
        return curRoleId;
    }

    public void setCurRoleId(String curRoleId) {
        this.curRoleId = curRoleId;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public int getUnreadMsgCount() {
        return unreadMsgCount;
    }

    public void setUnreadMsgCount(int unreadMsgCount) {
        this.unreadMsgCount = unreadMsgCount;
    }

    public String getSESSIONID() {
        return SESSIONID;
    }

    public void setSESSIONID(String SESSIONID) {
        this.SESSIONID = SESSIONID;
    }

    public static class CurPartyMemberBean implements Serializable {
        /**
         * displayBirthday : 1989-05-11
         * phone : 18200000031
         * showCreateTime : 2017-05-03 11:41:39
         * workUnit : 子长县支撑组
         * isPraiseForToday :
         * isPunish : N
         * partyBranchType :
         * wages : 10000
         * city : 延安
         * photoPath : /files/image/person/20170503/da0ec27b07ed4a55ae315bc5af0ef537/686a941a549e4bbbbe7b49c0a9278803.jpg
         * isPoor : N
         * homeplaceDist : 宝塔区
         * countyRegion : null
         * age : 28
         * province : 陕西
         * isFlow : N
         * isOnlineStatics : Y
         * academicDegree : -1
         * occupation : WORKER
         * partyPost :
         * townRegion : null
         * idcard : 61032215641321123
         * isJoinGroup : Y
         * homeplaceAdress :
         * partyBranch : {"partyTotalBranch":null,"phone":"1","showCreateTime":"2017-05-19 13:50:06","branchIdsChain":"8a4da0865c1efe6a015c1f418557003d","myPartyTotalBranchId":"","myPartyCommitteeLayer":0,"type":"COUNTRYSIDE","partyWorkCommit":{"id":"8a4da0865c16d55d015c1ebead23042d","phone":"","showCreateTime":"2017-05-19 11:27:11","address":"","name":"市级机关工委--支撑"},"id":"8a4da0865c1efe6a015c1f418557003d","groupId":"gg8019127827","myPartyWorkCommitId":"8a4da0865c16d55d015c1ebead23042d","partyCommittee":null,"address":"1","myPartyCommitteeId":"","name":"市级机关支部--支撑","myPctIdsChain":""}
         * nation : HAN
         * showWorkDate : 2014-05-08
         * isShuji : N
         * showJoinPartyDate : 2012-05-10
         * personRemark :
         * starCount : 1
         * showOfficeDate :
         * partyDues : 36
         * motto :
         * dist : 宝塔区
         * isTransferBranch : N
         * sex : m
         * development :
         * beforeBranchName :
         * showBecomeDate : 2017-05-18
         * education : BJ
         * stage : regular
         * majorPost :
         * partyBranchName :
         * id : da0ec27b07ed4a55ae315bc5af0ef537
         * isPraise : N
         * roleNum : 3
         * administrationPost : -1
         * praiseContent :
         * roleShowName :
         * homeplaceProvince : 陕西
         * punishType : W
         * name : 蒲少龙
         * orgMinistry : {"id":"8a4da0865c16d55d015c1eba46af040d","level":"OLCD","showCreateTime":"2017-05-19 11:22:23","name":"书记"}
         * showPartyDuesEndDate :
         * roleDispayName : 三级
         * workUnitAttr :
         * orgDuties : CSHUJI
         * homeplaceCity : 延安
         * totalPraiseCount : 1
         * address : 科技路
         * cityRegion : {"id":"610600","sort":0,"level":"rlc","showCreateTime":"2017-06-22 09:35:09","name":"延安市"}
         * isManager : N
         */

        private String displayBirthday;
        private String phone;
        private String showCreateTime;
        private String workUnit;
        private String isPraiseForToday;
        private String isPunish;
        private String partyBranchType;
        private int wages;
        private String city;
        private String photoPath;
        private String isPoor;
        private String homeplaceDist;
        private Object countyRegion;
        private int age;
        private String province;
        private String isFlow;
        private String isOnlineStatics;
        private String academicDegree;
        private String occupation;
        private String partyPost;
        private Object townRegion;
        private String idcard;
        private String isJoinGroup;
        private String homeplaceAdress;
        private PartyBranchBean partyBranch;
        private String nation;
        private String showWorkDate;
        private String isShuji;
        private String showJoinPartyDate;
        private String personRemark;
        private int starCount;
        private String showOfficeDate;
        private int partyDues;
        private String motto;
        private String dist;
        private String isTransferBranch;
        private String sex;
        private String development;
        private String beforeBranchName;
        private String showBecomeDate;
        private String education;
        private String stage;
        private String majorPost;
        private String partyBranchName;
        private String id;
        private String isPraise;
        private int roleNum;
        private String administrationPost;
        private String praiseContent;
        private String roleShowName;
        private String homeplaceProvince;
        private String punishType;
        private String name;
        private OrgMinistryBean orgMinistry;
        private String showPartyDuesEndDate;
        private String roleDispayName;
        private String workUnitAttr;
        private String orgDuties;
        private String homeplaceCity;
        private int totalPraiseCount;
        private String address;
        private CityRegionBean cityRegion;
        private String isManager;

        public String getDisplayBirthday() {
            return displayBirthday;
        }

        public void setDisplayBirthday(String displayBirthday) {
            this.displayBirthday = displayBirthday;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getShowCreateTime() {
            return showCreateTime;
        }

        public void setShowCreateTime(String showCreateTime) {
            this.showCreateTime = showCreateTime;
        }

        public String getWorkUnit() {
            return workUnit;
        }

        public void setWorkUnit(String workUnit) {
            this.workUnit = workUnit;
        }

        public String getIsPraiseForToday() {
            return isPraiseForToday;
        }

        public void setIsPraiseForToday(String isPraiseForToday) {
            this.isPraiseForToday = isPraiseForToday;
        }

        public String getIsPunish() {
            return isPunish;
        }

        public void setIsPunish(String isPunish) {
            this.isPunish = isPunish;
        }

        public String getPartyBranchType() {
            return partyBranchType;
        }

        public void setPartyBranchType(String partyBranchType) {
            this.partyBranchType = partyBranchType;
        }

        public int getWages() {
            return wages;
        }

        public void setWages(int wages) {
            this.wages = wages;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getPhotoPath() {
            return photoPath;
        }

        public void setPhotoPath(String photoPath) {
            this.photoPath = photoPath;
        }

        public String getIsPoor() {
            return isPoor;
        }

        public void setIsPoor(String isPoor) {
            this.isPoor = isPoor;
        }

        public String getHomeplaceDist() {
            return homeplaceDist;
        }

        public void setHomeplaceDist(String homeplaceDist) {
            this.homeplaceDist = homeplaceDist;
        }

        public Object getCountyRegion() {
            return countyRegion;
        }

        public void setCountyRegion(Object countyRegion) {
            this.countyRegion = countyRegion;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getIsFlow() {
            return isFlow;
        }

        public void setIsFlow(String isFlow) {
            this.isFlow = isFlow;
        }

        public String getIsOnlineStatics() {
            return isOnlineStatics;
        }

        public void setIsOnlineStatics(String isOnlineStatics) {
            this.isOnlineStatics = isOnlineStatics;
        }

        public String getAcademicDegree() {
            return academicDegree;
        }

        public void setAcademicDegree(String academicDegree) {
            this.academicDegree = academicDegree;
        }

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        public String getPartyPost() {
            return partyPost;
        }

        public void setPartyPost(String partyPost) {
            this.partyPost = partyPost;
        }

        public Object getTownRegion() {
            return townRegion;
        }

        public void setTownRegion(Object townRegion) {
            this.townRegion = townRegion;
        }

        public String getIdcard() {
            return idcard;
        }

        public void setIdcard(String idcard) {
            this.idcard = idcard;
        }

        public String getIsJoinGroup() {
            return isJoinGroup;
        }

        public void setIsJoinGroup(String isJoinGroup) {
            this.isJoinGroup = isJoinGroup;
        }

        public String getHomeplaceAdress() {
            return homeplaceAdress;
        }

        public void setHomeplaceAdress(String homeplaceAdress) {
            this.homeplaceAdress = homeplaceAdress;
        }

        public PartyBranchBean getPartyBranch() {
            return partyBranch;
        }

        public void setPartyBranch(PartyBranchBean partyBranch) {
            this.partyBranch = partyBranch;
        }

        public String getNation() {
            return nation;
        }

        public void setNation(String nation) {
            this.nation = nation;
        }

        public String getShowWorkDate() {
            return showWorkDate;
        }

        public void setShowWorkDate(String showWorkDate) {
            this.showWorkDate = showWorkDate;
        }

        public String getIsShuji() {
            return isShuji;
        }

        public void setIsShuji(String isShuji) {
            this.isShuji = isShuji;
        }

        public String getShowJoinPartyDate() {
            return showJoinPartyDate;
        }

        public void setShowJoinPartyDate(String showJoinPartyDate) {
            this.showJoinPartyDate = showJoinPartyDate;
        }

        public String getPersonRemark() {
            return personRemark;
        }

        public void setPersonRemark(String personRemark) {
            this.personRemark = personRemark;
        }

        public int getStarCount() {
            return starCount;
        }

        public void setStarCount(int starCount) {
            this.starCount = starCount;
        }

        public String getShowOfficeDate() {
            return showOfficeDate;
        }

        public void setShowOfficeDate(String showOfficeDate) {
            this.showOfficeDate = showOfficeDate;
        }

        public int getPartyDues() {
            return partyDues;
        }

        public void setPartyDues(int partyDues) {
            this.partyDues = partyDues;
        }

        public String getMotto() {
            return motto;
        }

        public void setMotto(String motto) {
            this.motto = motto;
        }

        public String getDist() {
            return dist;
        }

        public void setDist(String dist) {
            this.dist = dist;
        }

        public String getIsTransferBranch() {
            return isTransferBranch;
        }

        public void setIsTransferBranch(String isTransferBranch) {
            this.isTransferBranch = isTransferBranch;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getDevelopment() {
            return development;
        }

        public void setDevelopment(String development) {
            this.development = development;
        }

        public String getBeforeBranchName() {
            return beforeBranchName;
        }

        public void setBeforeBranchName(String beforeBranchName) {
            this.beforeBranchName = beforeBranchName;
        }

        public String getShowBecomeDate() {
            return showBecomeDate;
        }

        public void setShowBecomeDate(String showBecomeDate) {
            this.showBecomeDate = showBecomeDate;
        }

        public String getEducation() {
            return education;
        }

        public void setEducation(String education) {
            this.education = education;
        }

        public String getStage() {
            return stage;
        }

        public void setStage(String stage) {
            this.stage = stage;
        }

        public String getMajorPost() {
            return majorPost;
        }

        public void setMajorPost(String majorPost) {
            this.majorPost = majorPost;
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

        public String getIsPraise() {
            return isPraise;
        }

        public void setIsPraise(String isPraise) {
            this.isPraise = isPraise;
        }

        public int getRoleNum() {
            return roleNum;
        }

        public void setRoleNum(int roleNum) {
            this.roleNum = roleNum;
        }

        public String getAdministrationPost() {
            return administrationPost;
        }

        public void setAdministrationPost(String administrationPost) {
            this.administrationPost = administrationPost;
        }

        public String getPraiseContent() {
            return praiseContent;
        }

        public void setPraiseContent(String praiseContent) {
            this.praiseContent = praiseContent;
        }

        public String getRoleShowName() {
            return roleShowName;
        }

        public void setRoleShowName(String roleShowName) {
            this.roleShowName = roleShowName;
        }

        public String getHomeplaceProvince() {
            return homeplaceProvince;
        }

        public void setHomeplaceProvince(String homeplaceProvince) {
            this.homeplaceProvince = homeplaceProvince;
        }

        public String getPunishType() {
            return punishType;
        }

        public void setPunishType(String punishType) {
            this.punishType = punishType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public OrgMinistryBean getOrgMinistry() {
            return orgMinistry;
        }

        public void setOrgMinistry(OrgMinistryBean orgMinistry) {
            this.orgMinistry = orgMinistry;
        }

        public String getShowPartyDuesEndDate() {
            return showPartyDuesEndDate;
        }

        public void setShowPartyDuesEndDate(String showPartyDuesEndDate) {
            this.showPartyDuesEndDate = showPartyDuesEndDate;
        }

        public String getRoleDispayName() {
            return roleDispayName;
        }

        public void setRoleDispayName(String roleDispayName) {
            this.roleDispayName = roleDispayName;
        }

        public String getWorkUnitAttr() {
            return workUnitAttr;
        }

        public void setWorkUnitAttr(String workUnitAttr) {
            this.workUnitAttr = workUnitAttr;
        }

        public String getOrgDuties() {
            return orgDuties;
        }

        public void setOrgDuties(String orgDuties) {
            this.orgDuties = orgDuties;
        }

        public String getHomeplaceCity() {
            return homeplaceCity;
        }

        public void setHomeplaceCity(String homeplaceCity) {
            this.homeplaceCity = homeplaceCity;
        }

        public int getTotalPraiseCount() {
            return totalPraiseCount;
        }

        public void setTotalPraiseCount(int totalPraiseCount) {
            this.totalPraiseCount = totalPraiseCount;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public CityRegionBean getCityRegion() {
            return cityRegion;
        }

        public void setCityRegion(CityRegionBean cityRegion) {
            this.cityRegion = cityRegion;
        }

        public String getIsManager() {
            return isManager;
        }

        public void setIsManager(String isManager) {
            this.isManager = isManager;
        }

        public static class PartyBranchBean implements Serializable{
            /**
             * partyTotalBranch : null
             * phone : 1
             * showCreateTime : 2017-05-19 13:50:06
             * branchIdsChain : 8a4da0865c1efe6a015c1f418557003d
             * myPartyTotalBranchId :
             * myPartyCommitteeLayer : 0
             * type : COUNTRYSIDE
             * partyWorkCommit : {"id":"8a4da0865c16d55d015c1ebead23042d","phone":"","showCreateTime":"2017-05-19 11:27:11","address":"","name":"市级机关工委--支撑"}
             * id : 8a4da0865c1efe6a015c1f418557003d
             * groupId : gg8019127827
             * myPartyWorkCommitId : 8a4da0865c16d55d015c1ebead23042d
             * partyCommittee : null
             * address : 1
             * myPartyCommitteeId :
             * name : 市级机关支部--支撑
             * myPctIdsChain :
             */

            private Object partyTotalBranch;
            private String phone;
            private String showCreateTime;
            private String branchIdsChain;
            private String myPartyTotalBranchId;
            private int myPartyCommitteeLayer;
            private String type;
            private PartyWorkCommitBean partyWorkCommit;
            private String id;
            private String groupId;
            private String myPartyWorkCommitId;
            private Object partyCommittee;
            private String address;
            private String myPartyCommitteeId;
            private String name;
            private String myPctIdsChain;

            public Object getPartyTotalBranch() {
                return partyTotalBranch;
            }

            public void setPartyTotalBranch(Object partyTotalBranch) {
                this.partyTotalBranch = partyTotalBranch;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getShowCreateTime() {
                return showCreateTime;
            }

            public void setShowCreateTime(String showCreateTime) {
                this.showCreateTime = showCreateTime;
            }

            public String getBranchIdsChain() {
                return branchIdsChain;
            }

            public void setBranchIdsChain(String branchIdsChain) {
                this.branchIdsChain = branchIdsChain;
            }

            public String getMyPartyTotalBranchId() {
                return myPartyTotalBranchId;
            }

            public void setMyPartyTotalBranchId(String myPartyTotalBranchId) {
                this.myPartyTotalBranchId = myPartyTotalBranchId;
            }

            public int getMyPartyCommitteeLayer() {
                return myPartyCommitteeLayer;
            }

            public void setMyPartyCommitteeLayer(int myPartyCommitteeLayer) {
                this.myPartyCommitteeLayer = myPartyCommitteeLayer;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public PartyWorkCommitBean getPartyWorkCommit() {
                return partyWorkCommit;
            }

            public void setPartyWorkCommit(PartyWorkCommitBean partyWorkCommit) {
                this.partyWorkCommit = partyWorkCommit;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getGroupId() {
                return groupId;
            }

            public void setGroupId(String groupId) {
                this.groupId = groupId;
            }

            public String getMyPartyWorkCommitId() {
                return myPartyWorkCommitId;
            }

            public void setMyPartyWorkCommitId(String myPartyWorkCommitId) {
                this.myPartyWorkCommitId = myPartyWorkCommitId;
            }

            public Object getPartyCommittee() {
                return partyCommittee;
            }

            public void setPartyCommittee(Object partyCommittee) {
                this.partyCommittee = partyCommittee;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getMyPartyCommitteeId() {
                return myPartyCommitteeId;
            }

            public void setMyPartyCommitteeId(String myPartyCommitteeId) {
                this.myPartyCommitteeId = myPartyCommitteeId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getMyPctIdsChain() {
                return myPctIdsChain;
            }

            public void setMyPctIdsChain(String myPctIdsChain) {
                this.myPctIdsChain = myPctIdsChain;
            }

            public static class PartyWorkCommitBean implements Serializable{
                /**
                 * id : 8a4da0865c16d55d015c1ebead23042d
                 * phone :
                 * showCreateTime : 2017-05-19 11:27:11
                 * address :
                 * name : 市级机关工委--支撑
                 */

                private String id;
                private String phone;
                private String showCreateTime;
                private String address;
                private String name;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public String getShowCreateTime() {
                    return showCreateTime;
                }

                public void setShowCreateTime(String showCreateTime) {
                    this.showCreateTime = showCreateTime;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class OrgMinistryBean implements Serializable{
            /**
             * id : 8a4da0865c16d55d015c1eba46af040d
             * level : OLCD
             * showCreateTime : 2017-05-19 11:22:23
             * name : 书记
             */

            private String id;
            private String level;
            private String showCreateTime;
            private String name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getShowCreateTime() {
                return showCreateTime;
            }

            public void setShowCreateTime(String showCreateTime) {
                this.showCreateTime = showCreateTime;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class CityRegionBean implements Serializable{
            /**
             * id : 610600
             * sort : 0
             * level : rlc
             * showCreateTime : 2017-06-22 09:35:09
             * name : 延安市
             */

            private String id;
            private int sort;
            private String level;
            private String showCreateTime;
            private String name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getShowCreateTime() {
                return showCreateTime;
            }

            public void setShowCreateTime(String showCreateTime) {
                this.showCreateTime = showCreateTime;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static class LearningProfileBean implements Serializable{
        /**
         * showBeginTime : 2017-05-20
         * partyMemberId :
         * logTime : null
         * showLogTime :
         * todayHours : 60
         * partyBranchName :
         * showEndTime : 2017-06-22
         * photoPath :
         * id : 8a4da0865c1efe6a015c249d908706c9
         * partyMemberName :
         * partyMemberPhotoName :
         * partyMemberTimeStampFolder :
         * hourAndMinute : 15分钟
         */

        private String showBeginTime;
        private String partyMemberId;
        private Object logTime;
        private String showLogTime;
        private int todayHours;
        private String partyBranchName;
        private String showEndTime;
        private String photoPath;
        private String id;
        private String partyMemberName;
        private String partyMemberPhotoName;
        private String partyMemberTimeStampFolder;
        private String hourAndMinute;

        public String getShowBeginTime() {
            return showBeginTime;
        }

        public void setShowBeginTime(String showBeginTime) {
            this.showBeginTime = showBeginTime;
        }

        public String getPartyMemberId() {
            return partyMemberId;
        }

        public void setPartyMemberId(String partyMemberId) {
            this.partyMemberId = partyMemberId;
        }

        public Object getLogTime() {
            return logTime;
        }

        public void setLogTime(Object logTime) {
            this.logTime = logTime;
        }

        public String getShowLogTime() {
            return showLogTime;
        }

        public void setShowLogTime(String showLogTime) {
            this.showLogTime = showLogTime;
        }

        public int getTodayHours() {
            return todayHours;
        }

        public void setTodayHours(int todayHours) {
            this.todayHours = todayHours;
        }

        public String getPartyBranchName() {
            return partyBranchName;
        }

        public void setPartyBranchName(String partyBranchName) {
            this.partyBranchName = partyBranchName;
        }

        public String getShowEndTime() {
            return showEndTime;
        }

        public void setShowEndTime(String showEndTime) {
            this.showEndTime = showEndTime;
        }

        public String getPhotoPath() {
            return photoPath;
        }

        public void setPhotoPath(String photoPath) {
            this.photoPath = photoPath;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPartyMemberName() {
            return partyMemberName;
        }

        public void setPartyMemberName(String partyMemberName) {
            this.partyMemberName = partyMemberName;
        }

        public String getPartyMemberPhotoName() {
            return partyMemberPhotoName;
        }

        public void setPartyMemberPhotoName(String partyMemberPhotoName) {
            this.partyMemberPhotoName = partyMemberPhotoName;
        }

        public String getPartyMemberTimeStampFolder() {
            return partyMemberTimeStampFolder;
        }

        public void setPartyMemberTimeStampFolder(String partyMemberTimeStampFolder) {
            this.partyMemberTimeStampFolder = partyMemberTimeStampFolder;
        }

        public String getHourAndMinute() {
            return hourAndMinute;
        }

        public void setHourAndMinute(String hourAndMinute) {
            this.hourAndMinute = hourAndMinute;
        }
    }
}
