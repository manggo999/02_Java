package com.hw2.model.dto;

public abstract class Animal {
	
	// 속성
	protected String name;
	
	// 생성자 + 메서드
	public Animal() {} // 기본 생성자
	
	// 매개변수 생성자
	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 추상 메서드 형태
	public abstract void sound();
	
	

}
