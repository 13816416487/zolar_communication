package com.zolar.server.net.bean;

/**
 * Created by zyq on 2018/4/24.
 *
 * 媒体详情介绍
 */

public class MediaIntroduction extends MediaSummary {

    private String castList = "";       // 演员列表

    private String plotDesc = "";       // 剧情描述

    public String getCastList() {
        return castList;
    }

    public void setCastList(String castList) {
        this.castList = castList;
    }

    public String getPlotDesc() {
        return plotDesc;
    }

    public void setPlotDesc(String plotDesc) {
        this.plotDesc = plotDesc;
    }

}
