package com.zolar.server.net.bean;

public class GetInfor {

	private Integer id;			//用户id
	private Integer account_id;		//机器id
	private String telephone;
	private String introduce;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
	@Override
	public String toString() {
		return "GetInforResponse [id=" + id + ", account_id=" + account_id + ", telephone=" + telephone + ", introduce="
				+ introduce + "]";
	}


}
