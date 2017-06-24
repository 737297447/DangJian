package com.lingdian.dangjian.ui.bean;

/**
 * Created by Administrator on 2017/6/24.
 */

public class Kaoshi {


    /**
     * level : A
     * questionBank : {"id":"8a4da0865c3b7f12015c3d2f539800bf","title":"延安党建题库2","count":15,"showCreateTime":"2017-05-25 09:18:50"}
     * msgContent : 查询成功！
     * bookmarker : {"id":"8a4da0865cc9d264015ccd7131b3009a","blankName":"","isEnd":"N","errorCount":5,"question":{"optionD":"开除党籍","id":"8a4da0865c3b7f12015c3d2f539800c5","optionC":"撤销党内职务","optionB":"留党察看","num":6,"optionA":"严重警告","answer":"BCD","questions":"根据《中国共产党纪律处分条例》，党组织在几率审查中发现党员有贪污贿赂、失职渎职等刑法规定的行为涉嫌犯罪的，应当给予（　）处分。"},"successCount":1,"intervalTime":649}
     * question : {"optionD":"扰乱投票秩序，在投票场所大声喧哗的","id":"8a4da0865c3b7f12015c3d2f539800c6","optionC":"在选举中进行其他违反党章、其他党内法规和有关章程活动的","optionB":"在法律规定的投票、选举活动中违背组织原则搞非组织活动，组织、怂恿、诱使他人投票、表决的","num":7,"optionA":"在民主推荐、民主测评、组织考察和党内选举中搞拉票、助选等非组织活动的","answer":"ABC","questions":"《中国共产党纪律处分条例》规定，有下列行为之一的，给予警告或者严重警告处分；情节较重的，给予撤销党内职务或者留党察看处分；情节严重的，给予开除党籍处分。（  ）"}
     */

    private String level;
    private QuestionBankBean questionBank;
    private String msgContent;
    private BookmarkerBean bookmarker;
    private QuestionBeanX question;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public QuestionBankBean getQuestionBank() {
        return questionBank;
    }

    public void setQuestionBank(QuestionBankBean questionBank) {
        this.questionBank = questionBank;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public BookmarkerBean getBookmarker() {
        return bookmarker;
    }

    public void setBookmarker(BookmarkerBean bookmarker) {
        this.bookmarker = bookmarker;
    }

    public QuestionBeanX getQuestion() {
        return question;
    }

    public void setQuestion(QuestionBeanX question) {
        this.question = question;
    }

    public static class QuestionBankBean {
        /**
         * id : 8a4da0865c3b7f12015c3d2f539800bf
         * title : 延安党建题库2
         * count : 15
         * showCreateTime : 2017-05-25 09:18:50
         */

        private String id;
        private String title;
        private int count;
        private String showCreateTime;

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

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getShowCreateTime() {
            return showCreateTime;
        }

        public void setShowCreateTime(String showCreateTime) {
            this.showCreateTime = showCreateTime;
        }
    }

    public static class BookmarkerBean {
        /**
         * id : 8a4da0865cc9d264015ccd7131b3009a
         * blankName :
         * isEnd : N
         * errorCount : 5
         * question : {"optionD":"开除党籍","id":"8a4da0865c3b7f12015c3d2f539800c5","optionC":"撤销党内职务","optionB":"留党察看","num":6,"optionA":"严重警告","answer":"BCD","questions":"根据《中国共产党纪律处分条例》，党组织在几率审查中发现党员有贪污贿赂、失职渎职等刑法规定的行为涉嫌犯罪的，应当给予（　）处分。"}
         * successCount : 1
         * intervalTime : 649
         */

        private String id;
        private String blankName;
        private String isEnd;
        private int errorCount;
        private QuestionBean question;
        private int successCount;
        private int intervalTime;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getBlankName() {
            return blankName;
        }

        public void setBlankName(String blankName) {
            this.blankName = blankName;
        }

        public String getIsEnd() {
            return isEnd;
        }

        public void setIsEnd(String isEnd) {
            this.isEnd = isEnd;
        }

        public int getErrorCount() {
            return errorCount;
        }

        public void setErrorCount(int errorCount) {
            this.errorCount = errorCount;
        }

        public QuestionBean getQuestion() {
            return question;
        }

        public void setQuestion(QuestionBean question) {
            this.question = question;
        }

        public int getSuccessCount() {
            return successCount;
        }

        public void setSuccessCount(int successCount) {
            this.successCount = successCount;
        }

        public int getIntervalTime() {
            return intervalTime;
        }

        public void setIntervalTime(int intervalTime) {
            this.intervalTime = intervalTime;
        }

        public static class QuestionBean {
            /**
             * optionD : 开除党籍
             * id : 8a4da0865c3b7f12015c3d2f539800c5
             * optionC : 撤销党内职务
             * optionB : 留党察看
             * num : 6
             * optionA : 严重警告
             * answer : BCD
             * questions : 根据《中国共产党纪律处分条例》，党组织在几率审查中发现党员有贪污贿赂、失职渎职等刑法规定的行为涉嫌犯罪的，应当给予（　）处分。
             */

            private String optionD;
            private String id;
            private String optionC;
            private String optionB;
            private int num;
            private String optionA;
            private String answer;
            private String questions;

            public String getOptionD() {
                return optionD;
            }

            public void setOptionD(String optionD) {
                this.optionD = optionD;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getOptionC() {
                return optionC;
            }

            public void setOptionC(String optionC) {
                this.optionC = optionC;
            }

            public String getOptionB() {
                return optionB;
            }

            public void setOptionB(String optionB) {
                this.optionB = optionB;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public String getOptionA() {
                return optionA;
            }

            public void setOptionA(String optionA) {
                this.optionA = optionA;
            }

            public String getAnswer() {
                return answer;
            }

            public void setAnswer(String answer) {
                this.answer = answer;
            }

            public String getQuestions() {
                return questions;
            }

            public void setQuestions(String questions) {
                this.questions = questions;
            }
        }
    }

    public static class QuestionBeanX {
        /**
         * optionD : 扰乱投票秩序，在投票场所大声喧哗的
         * id : 8a4da0865c3b7f12015c3d2f539800c6
         * optionC : 在选举中进行其他违反党章、其他党内法规和有关章程活动的
         * optionB : 在法律规定的投票、选举活动中违背组织原则搞非组织活动，组织、怂恿、诱使他人投票、表决的
         * num : 7
         * optionA : 在民主推荐、民主测评、组织考察和党内选举中搞拉票、助选等非组织活动的
         * answer : ABC
         * questions : 《中国共产党纪律处分条例》规定，有下列行为之一的，给予警告或者严重警告处分；情节较重的，给予撤销党内职务或者留党察看处分；情节严重的，给予开除党籍处分。（  ）
         */

        private String optionD;
        private String id;
        private String optionC;
        private String optionB;
        private int num;
        private String optionA;
        private String answer;
        private String questions;

        public String getOptionD() {
            return optionD;
        }

        public void setOptionD(String optionD) {
            this.optionD = optionD;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getOptionC() {
            return optionC;
        }

        public void setOptionC(String optionC) {
            this.optionC = optionC;
        }

        public String getOptionB() {
            return optionB;
        }

        public void setOptionB(String optionB) {
            this.optionB = optionB;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getOptionA() {
            return optionA;
        }

        public void setOptionA(String optionA) {
            this.optionA = optionA;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }

        public String getQuestions() {
            return questions;
        }

        public void setQuestions(String questions) {
            this.questions = questions;
        }
    }
}
