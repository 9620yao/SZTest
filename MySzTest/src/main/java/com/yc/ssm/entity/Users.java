package com.yc.ssm.entity;

public class Users {

	private int aid;
	private String name;
	private Partner partner;

	public Users() {

	}

	public Users(int aid, String name, Partner partner) {
		this.aid = aid;
		this.name = name;
		this.partner = partner;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Partner getPartner() {
		return partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	@Override
	public String toString() {
		return "\nUsers [aid=" + aid + ", name=" + name + ", partner=" + partner + "]";
	}

}
