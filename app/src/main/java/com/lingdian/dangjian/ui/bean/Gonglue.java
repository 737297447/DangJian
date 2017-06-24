package com.lingdian.dangjian.ui.bean;


import com.lingdian.dangjian.base.BaseBean;

import java.util.List;

/**
 * Created by Administrator on 2017/1/18.
 */

public class Gonglue extends BaseBean {
    private List<GonglueData> data;

    public List<GonglueData> getData() {
        return data;
    }

    public void setData(List<GonglueData> data) {
        this.data = data;
    }
}
