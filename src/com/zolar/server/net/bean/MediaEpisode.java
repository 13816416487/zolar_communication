package com.zolar.server.net.bean;

/**
 * Created by zyq on 2018/4/24.
 *
 * 媒体单集信息
 */

public class MediaEpisode {

    private int id = 0;                 // 媒体m_child_id

    private int m_id=0;					// 媒体m_id
    
    private String mediaName = "";      // 媒体名称
    
    private String episodeName = "";    // 单集名称

    private String imgURL = "";         // 媒体图片路径

    private String srcURL = "";         // 媒体资源路径
    
    private long progressUpdateTime = 0L;	// 播放进度更新时间
    
    private int progress = 0;			// 播放进度

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getMediaName() {
		return mediaName;
	}

	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}

	public String getEpisodeName() {
		return episodeName;
	}

	public void setEpisodeName(String episodeName) {
		this.episodeName = episodeName;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public String getSrcURL() {
		return srcURL;
	}

	public void setSrcURL(String srcURL) {
		this.srcURL = srcURL;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public long getProgressUpdateTime() {
		return progressUpdateTime;
	}

	public void setProgressUpdateTime(long progressUpdateTime) {
		this.progressUpdateTime = progressUpdateTime;
	}

	@Override
	public String toString() {
		return "MediaEpisode [id=" + id + ", m_id=" + m_id + ", mediaName=" + mediaName + ", episodeName=" + episodeName
				+ ", imgURL=" + imgURL + ", srcURL=" + srcURL + ", progressUpdateTime=" + progressUpdateTime
				+ ", progress=" + progress + "]";
	}


}
