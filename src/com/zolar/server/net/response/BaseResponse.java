package com.zolar.server.net.response;

/**
 * Created by zyq on 2018/4/25.
 */

public class BaseResponse {

	public static final int Code_Success = 0;

	private int errorCode = Code_Success;
    public String userMsg = "";	// 给用户展示
    public String devMsg = "";	// 给安卓的提示信息

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
