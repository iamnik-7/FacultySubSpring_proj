package com.tka.entity;

import java.util.List;

public class Faculty {
	
	
	int fid;
	String fname;
	int exp;
	int sal;
	List<Subject> subnames;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(int fid, String fname, int exp, int sal, List<Subject> subnames) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.exp = exp;
		this.sal = sal;
		this.subnames = subnames;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", exp=" + exp + ", sal=" + sal + ", subnames=" + subnames
				+ "]";
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public List<Subject> getSubnames() {
		return subnames;
	}
	public void setSubnames(List<Subject> subnames) {
		this.subnames = subnames;
	}
	
}