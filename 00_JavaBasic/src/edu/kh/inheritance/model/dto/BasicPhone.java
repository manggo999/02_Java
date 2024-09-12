package edu.kh.inheritance.model.dto;

public class BasicPhone extends Phone {
	
	// 필드(속성)
	private boolean hasPhysicalKeyboard;
	
	// 생성자
	public BasicPhone() {} //기본생성자
    
	// 매개변수 생성자
	public BasicPhone(String brand, String model, int year, int price, 
			          boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
    
	// 메서드
	
	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	
	public void checkKeyboard() {
		if(hasPhysicalKeyboard == true) {
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
		} else {
			System.out.println("이 휴대폰은 물리적 키보드가 없습니다.");
		}
	}

}
