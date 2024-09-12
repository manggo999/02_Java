package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone{
	
	// 필드
	private boolean hasPhysicalKeybord;
	
	// 생성자
	public BasicPhone() {} // 기본생성자
	
    // 매개변수생성자
	public BasicPhone(String brand, String model, int year, 
			          int price, boolean hasPhysicalKeybord) {
		super(brand, model, year, price);
		this.hasPhysicalKeybord = hasPhysicalKeybord;
	}
	
	// 메서드
	public boolean isHasPhysicalKeybord() {
		return hasPhysicalKeybord;
	}

	public void setHasPhysicalKeybord(boolean hasPhysicalKeybord) {
		this.hasPhysicalKeybord = hasPhysicalKeybord;
	}
	
	
	public void checkKeyboard() {
		
		if(hasPhysicalKeybord == true) { // 물리적 키보드가 존재한다면..
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
			
		} else { // 물리적 키보드가 존재하지 않는다면..
			System.out.println("이 휴대폰은 물리적 키보드가 없습니다.");
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
