package com.zolar.server.net.response;

import java.util.ArrayList;
import java.util.List;

import com.zolar.server.net.bean.MediaSummary;

public class GetMediaSummaryResponse extends BaseResponse {
	public List<MediaSummary> content =new ArrayList<MediaSummary>();

}
