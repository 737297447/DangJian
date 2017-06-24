package com.lingdian.dangjian.base;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/1/16.
 */

public class BaseBean implements Serializable {
    private String level;
    private String msgContent;

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
}
