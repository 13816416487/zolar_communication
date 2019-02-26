package com.zolar.server.net.response;

/**
 * Created by zyq on 2018/4/25.
 */

public class BaseResponse {

	public static final int Code_Success = 0;	//(为0的时候是成功 )

	public int errorCode = Code_Success;
    public String userMsg = "";	// 给用户展示
    public String devMsg = "";	// 给安卓的提示信息

    
    
    public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getUserMsg() {
		return userMsg;
	}

	public void setUserMsg(String userMsg) {
		this.userMsg = userMsg;
	}

	public String getDevMsg() {
		return devMsg;
	}

	public void setDevMsg(String devMsg) {
		this.devMsg = devMsg;
	}

	public static int getCodeSuccess() {
		return Code_Success;
	}

	@Override
    public String toString() {
        return "BaseResponse{" +
                "errorCode=" + errorCode +
                ", userMsg='" + userMsg + '\'' +
                ", devMsg='" + devMsg + '\'' +
                '}';
    }
     
    public boolean isSuccess() {
    	return errorCode == Code_Success;
    }
}
