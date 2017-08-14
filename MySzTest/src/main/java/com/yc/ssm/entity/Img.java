package com.yc.ssm.entity;

public class Img {
	private int id;
	private int uid;
	private String time;
	private String content;

	public Img() {
	}

	public Img(int id, int uid, String time, String content) {
		this.id = id;
		this.uid = uid;
		this.time = time;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "\nImg [id=" + id + ", uid=" + uid + ", time=" + time + ", content=" + content + "]";
	}

}
