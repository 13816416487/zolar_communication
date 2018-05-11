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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getMediaId() {
		return mediaId;
	}

	public void setMediaId(int mediaId) {
		this.mediaId = mediaId;
	}

	public int getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(int episodeId) {
		this.episodeId = episodeId;
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

	public boolean isUploadSuccess() {
		return uploadSuccess;
	}

	public void setUploadSuccess(boolean uploadSuccess) {
		this.uploadSuccess = uploadSuccess;
	}

	@Override
	public String toString() {
		return "PlayingProgress [id=" + id + ", accountId=" + accountId + ", mediaId=" + mediaId + ", episodeId="
				+ episodeId + ", progress=" + progress + ", progressUpdateTime=" + progressUpdateTime
				+ ", uploadSuccess=" + uploadSuccess + "]";
	}


}
