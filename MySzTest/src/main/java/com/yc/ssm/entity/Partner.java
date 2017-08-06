package com.yc.ssm.entity;

public class Partner {

	private int pid;
	private String pname;

	public Partner() {
	}

	public Partner(int pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "\nPartner [pid=" + pid + ", pname=" + pname + "]";
	}

}
