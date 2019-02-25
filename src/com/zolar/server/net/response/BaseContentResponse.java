package com.zolar.server.net.response;

import com.zolar.server.net.response.BaseResponse;

public class BaseContentResponse extends BaseResponse {
	
	public String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BaseContentResponse [content=" + content + "]";
	}
	

}
