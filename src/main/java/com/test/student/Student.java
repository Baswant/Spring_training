package com.test.student;

public class Student {
	
	private int sno;
	private String sname;
	private String scourse;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", scourse=" + scourse + "]";
	}
	public Student(int sno, String sname, String scourse) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.scourse = scourse;
	}
	public Student() {
		
	};

}
