package com.rubypaper.dto;

public class Friend {

	private int num;
	private String name;
	private String mobile;
	private String charter;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCharter() {
		return charter;
	}
	public void setCharter(String charter) {
		this.charter = charter;
	}
	@Override
	public String toString() {
		return "Friend [num=" + num + ", name=" + name + ", mobile=" + mobile + ", charter=" + charter + "]";
	}
}
