package com.zolar.server.net.bean;

/**
 * Created by zyq on 2018/5/8.
 *
 * 媒体播放进度
 */

public class PlayingProgress {

    public Integer id;              // 记录编号

    public int accountId;           // 用户编号

    public int mediaId;             // 媒体编号

    public int episodeId;           // 单集编号

    public int progress;           // 播放进度

    public long progressUpdateTime = 0L;        // 播放进度更新时间

    public boolean uploadSuccess = false;       // 是否提交后台

	@Override
	public String toString() {
		return "PlayingProgress [id=" + id + ", accountId=" + accountId + ", mediaId=" + mediaId + ", episodeId="
				+ episodeId + ", progress=" + progress + ", progressUpdateTime=" + progressUpdateTime
				+ ", uploadSuccess=" + uploadSuccess + "]";
	}


}
