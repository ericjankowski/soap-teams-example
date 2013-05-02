package com.erj.practice.service;

public class Player {

	private String fullName;
	private String nickName;

	public Player(){}
	
	public Player(String fullName, String nickName) {
		this.setFullName(fullName);
		this.setNickName(nickName);
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
