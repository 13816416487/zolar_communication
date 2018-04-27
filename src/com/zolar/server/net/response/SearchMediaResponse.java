package com.zolar.server.net.response;

import com.zolar.server.net.bean.SearchMediaResultSet;

import java.util.ArrayList;

/**
 * Created by zyq on 2018/4/26.
 */

public class SearchMediaResponse extends BaseResponse {

    private ArrayList<SearchMediaResultSet> content = new ArrayList<SearchMediaResultSet>();

    public ArrayList<SearchMediaResultSet> getContent() {
        return content;
    }

    public void setContent(ArrayList<SearchMediaResultSet> content) {
        this.content = content;
    }
}
