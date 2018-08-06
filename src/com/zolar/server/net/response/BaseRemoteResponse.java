package com.zolar.server.net.response;

public class BaseRemoteResponse<T> {

	private int code;
	private String msg;
	private T content;

	public BaseRemoteResponse(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public BaseRemoteResponse(int Code, String msg, T content) {
		this.code = Code;
		this.msg = msg;
		this.content = content;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int errCode) {
		this.code = errCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BaseRemoteResponse [code=" + code + ", msg=" + msg + ", content=" + content + "]";
	}

	
}
