package com.zolar.server.net.bean;

/**
 * Created by zyq on 2018/4/26.
 */

public class SearchMediaRawData {

    private Float distance = 0F;        // 搜索关键字与结果的距离

    private int id = 0;                 // 结果编号

    private String name = "";           // 结果名称

    private String tag = "";            // 结果类型

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean isType() {
        return tag.equals("m_type");
    }

    public boolean isSummary() {
        return tag.equals("m_name");
    }

    public boolean isEpisode() {
        return tag.equals("m_childname");
    }
    
    public boolean isPrefectMatch() {
    	return distance.equals(0f);
    }


}
