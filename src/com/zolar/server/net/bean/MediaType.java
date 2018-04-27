package com.zolar.server.net.bean;
/**
 * Created by zyq on 2018/4/24.
 *
 * 媒体分类
 */

public class MediaType {

    private int id = 0;         // 媒体分类编号

    private String name = "";   // 媒体分类名称

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

    @Override
    public String toString() {
        return "MediaType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    public static List<MediaType> getTestDatas() {
//        List<MediaType> result =new ArrayList<>();
//        MediaType mediaType1 = new MediaType();
//        mediaType1.setName("电视剧");
//        MediaType mediaType2 = new MediaType();
//        mediaType2.setName("电影");
//        MediaType mediaType3 = new MediaType();
//        mediaType3.setName("京剧");
//        result.add(mediaType1);
//        result.add(mediaType2);
//        result.add(mediaType3);
//        return result;
//    }
}
