package com.zolar.server.net.bean;

import java.util.ArrayList;

public class GetHomePageSet {
	// 历史
	public ArrayList<MediaEpisode> historys = new ArrayList<MediaEpisode>();

	public ArrayList<MediaType> types = new ArrayList<MediaType>();

	public ArrayList<MediaSummary> recommends = new ArrayList<MediaSummary>();

	// 返回样式
	public String responseType = "fresh";
}
