package com.lingdian.dangjian.ui.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/1/18.
 */

public class BannerData implements Serializable {
    private String imgUrl;
    private String httpUrl;
    private String title;
    private int imgRes;


    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getHttpUrl() {
        return httpUrl;
    }

    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }
}
