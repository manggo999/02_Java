package com.hw1.model.dto;

public class Friend {
	
	// 속성(필드)
	private String name; 
	
	
	// 기능(생성자 + 메서드)
	public Friend() {} // 기본 생성자

	public Friend(String name) { // 매개변수 생성자
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}
	
	
	
	
	
	
	

}
