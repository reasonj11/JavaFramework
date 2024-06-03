package com.rubypaper.dto;

public class BookDTO {
	private String userTitle;
	private String userAuthor;
	private String userPublisher;
	private int userPrice;
	public String getUserTitle() {
		return userTitle;
	}
	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}
	public String getUserAuthor() {
		return userAuthor;
	}
	public void setUserAuthor(String userAuthor) {
		this.userAuthor = userAuthor;
	}
	public String getUserPublisher() {
		return userPublisher;
	}
	public void setUserPublisher(String userPublisher) {
		this.userPublisher = userPublisher;
	}
	public int getUserPrice() {
		return userPrice;
	}
	public void setUserPrice(int userPrice) {
		this.userPrice = userPrice;
	}
	@Override
	public String toString() {
		return "BookDTO [userTitle=" + userTitle + ", userAuthor=" + userAuthor + ", userPublisher=" + userPublisher
				+ ", userPrice=" + userPrice + "]";
	}
	
}
