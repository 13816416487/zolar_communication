package com.zolar.server.net.bean;

public class Active {

	private Integer robot_id; // 机器id
	private String token; // 机器的token

	public Integer getRobot_id() {
		return robot_id;
	}

	public void setRobot_id(Integer robot_id) {
		this.robot_id = robot_id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Active [robot_id=" + robot_id + ", token=" + token + "]";
	}

}
