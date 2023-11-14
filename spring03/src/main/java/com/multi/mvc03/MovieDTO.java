package com.multi.mvc03;

public class MovieDTO {
	private String id;
	private String title;
	private String rate;
	private String date;
	private String img;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "MovieDTO [id=" + id + ", title=" + title + ", rate=" + rate + ", date=" + date + ", img=" + img + "]";
	}


}
