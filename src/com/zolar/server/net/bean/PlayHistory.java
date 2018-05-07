package com.zolar.server.net.bean;

import java.util.Date;

public class PlayHistory {

	private int history_id;
	private int account_id;
	private int m_child_id;
	private Date updatetime;
	private int progress;

	public int getHistory_id() {
		return history_id;
	}

	public void setHistory_id(int history_id) {
		this.history_id = history_id;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public int getM_child_id() {
		return m_child_id;
	}

	public void setM_child_id(int m_child_id) {
		this.m_child_id = m_child_id;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	@Override
	public String toString() {
		return "PlayHistory [history_id=" + history_id + ", account_id=" + account_id + ", m_child_id=" + m_child_id
				+ ", updatetime=" + updatetime + ", progress=" + progress + "]";
	}

	

}
