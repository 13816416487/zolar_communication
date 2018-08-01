package com.zolar.server.net.bean;

public class RobotImSet {

	private Integer account_id; // 用户id
	private String channelName; // 直播间名字
	private Integer im_id; // im账号
	private String im_user; // im用户名
	private String im_sign; // im用户的TLS签名
	private Integer friend_id;
	private String friend_user;
	private String friend_sign;
	private String pushflow; // 推流地址
	private String pullflow; // 拉流地址

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getIm_id() {
		return im_id;
	}

	public void setIm_id(Integer im_id) {
		this.im_id = im_id;
	}

	public String getIm_user() {
		return im_user;
	}

	public void setIm_user(String im_user) {
		this.im_user = im_user;
	}

	public String getIm_sign() {
		return im_sign;
	}

	public void setIm_sign(String im_sign) {
		this.im_sign = im_sign;
	}

	public Integer getFriend_id() {
		return friend_id;
	}

	public void setFriend_id(Integer friend_id) {
		this.friend_id = friend_id;
	}

	public String getFriend_user() {
		return friend_user;
	}

	public void setFriend_user(String friend_user) {
		this.friend_user = friend_user;
	}

	public String getFriend_sign() {
		return friend_sign;
	}

	public void setFriend_sign(String friend_sign) {
		this.friend_sign = friend_sign;
	}

	public String getPushflow() {
		return pushflow;
	}

	public void setPushflow(String pushflow) {
		this.pushflow = pushflow;
	}

	public String getPullflow() {
		return pullflow;
	}

	public void setPullflow(String pullflow) {
		this.pullflow = pullflow;
	}

	@Override
	public String toString() {
		return "RobotImSet [account_id=" + account_id + ", channelName=" + channelName + ", im_id=" + im_id
				+ ", im_user=" + im_user + ", im_sign=" + im_sign + ", friend_id=" + friend_id + ", friend_user="
				+ friend_user + ", friend_sign=" + friend_sign + ", pushflow=" + pushflow + ", pullflow=" + pullflow
				+ "]";
	}

}
