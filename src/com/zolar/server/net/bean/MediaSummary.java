package com.zolar.server.net.bean;

/**
 * Created by zyq on 2018/4/24.
 *
 * 媒体摘要信息
 */

public class MediaSummary {

    private int id = 0;             // 媒体编号

    private String name = "";       // 媒体名称

    private String imgURL = "";     // 媒体图片

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    @Override
    public String toString() {
        return "MediaSummary{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imgURL='" + imgURL + '\'' +
                '}';
    }


}
