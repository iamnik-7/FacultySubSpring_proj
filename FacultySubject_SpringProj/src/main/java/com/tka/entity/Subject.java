package com.tka.entity;

public class Subject {
		int subid;
	String subname;
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int subid, String subname) {
		super();
		this.subid = subid;
		this.subname = subname;
	}

	public int getSubid() {
		return subid;
	}

	public void setSubid(int subid) {
		this.subid = subid;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	@Override
	public String toString() {
		return "Subject [subid=" + subid + ", subname=" + subname + "]";
	}

}
