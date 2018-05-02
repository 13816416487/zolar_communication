package com.zolar.server.net.bean;

import java.util.ArrayList;
import java.util.List;

public class MediaIntroductionSet {
	
	//媒体信息列表(id,name,imgUrl,castList,plotDesc)
	public MediaIntroduction mediaIntroduction=new MediaIntroduction();
	//播放按钮(暂时选择第一集)
	public MediaEpisode mediaEpisode=new MediaEpisode();
	//选集按钮(id,childname,addr)
	public List<MediaEpisode> listEpisode=new ArrayList<MediaEpisode>();
	//推荐列表
	public List<MediaSummary> listMediaSummary=new ArrayList<MediaSummary>();

}
