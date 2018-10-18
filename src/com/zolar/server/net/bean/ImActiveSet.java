package com.zolar.server.net.bean;

public class ImActiveSet {

	// 激活用户,,机器人和机器人用户的绑定
	// private Integer account_id; // 用户id
	private String account_id; // 用户id
	private String token; // 用户的token

	private String telephone; // 被授权信息的手机号
	// 直播间的
	private String channelName; // 直播间名字
	private String channelID; // 直播间id
	private String appid; // 直播应用的id
	private String pushflow; // 推流地址
	private String pullflow; // 拉流地址

	// im账号的
	private Integer imid; // imaccount表的id
	private String imuser; // im账号用户名
	private String sign; // im账号TLS签名
	private String sdkAppid;// im账号的sdkAppid

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelID() {
		return channelID;
	}

	public void setChannelID(String channelID) {
		this.channelID = channelID;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
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

	public Integer getImid() {
		return imid;
	}

	public void setImid(Integer imid) {
		this.imid = imid;
	}

	public String getImuser() {
		return imuser;
	}

	public void setImuser(String imuser) {
		this.imuser = imuser;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSdkAppid() {
		return sdkAppid;
	}

	public void setSdkAppid(String sdkAppid) {
		this.sdkAppid = sdkAppid;
	}

	@Override
	public String toString() {
		return "ImActiveSet [account_id=" + account_id + ", token=" + token + ", telephone=" + telephone
				+ ", channelName=" + channelName + ", channelID=" + channelID + ", appid=" + appid + ", pushflow="
				+ pushflow + ", pullflow=" + pullflow + ", imid=" + imid + ", imuser=" + imuser + ", sign=" + sign
				+ ", sdkAppid=" + sdkAppid + "]";
	}

}
