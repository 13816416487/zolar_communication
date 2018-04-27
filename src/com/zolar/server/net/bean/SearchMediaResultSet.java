package com.zolar.server.net.bean;


/**
 * Created by zyq on 2018/4/26.
 */

public class SearchMediaResultSet {

    private SearchMediaRawData raw = null;

    private MediaType type = null;

    private MediaSummary summary = null;

    private MediaEpisode episode = null;

    public SearchMediaRawData getRaw() {
        return raw;
    }

    public void setRaw(SearchMediaRawData raw) {
        this.raw = raw;
    }

    public MediaType getType() {
		return type;
	}

	public void setType(MediaType type) {
		this.type = type;
	}

	public MediaSummary getSummary() {
		return summary;
	}

	public void setSummary(MediaSummary summary) {
		this.summary = summary;
	}

	public MediaEpisode getEpisode() {
        return episode;
    }

    public void setEpisode(MediaEpisode episode) {
        this.episode = episode;
    }
}
