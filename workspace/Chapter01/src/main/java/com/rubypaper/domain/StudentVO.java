package com.rubypaper.domain;

import java.util.Date;

public class StudentVO {
	private int seq;
	private String name;
	private int age;
	private String major;
	private Date createDate;
	private int cnt;
	
	@Override
	public String toString() {
		return "StudentVO [seq=" + seq + ", name=" + name + ", age=" + age + ", major=" + major + ", createDate="
				+ createDate + ", cnt=" + cnt + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
