package com.rubypaper.dto;

public class BoardDTO {
	private int num;
	private String btitle;
	private String bname;
	public BoardDTO() {}
	public BoardDTO(int num, String btitle, String bname) {
		super();
		this.num =num;
		this.btitle = btitle;
		this.bname = bname;
	}
	public long getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}

}
