package com.zolar.server.net.bean;

public class MediaSummaryDetails {

	private int id = 0; // 媒体编号
	private String name = ""; // 媒体名称
	private String imgURL = ""; // 媒体图片
	private String description;
	private String director;
	private String performer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getPerformer() {
		return performer;
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}

	@Override
	public String toString() {
		return "MediaSummaryDetails [id=" + id + ", name=" + name + ", imgURL=" + imgURL + ", description="
				+ description + ", director=" + director + ", performer=" + performer + "]";
	}

}
