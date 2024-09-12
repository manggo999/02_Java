package edu.kh.inheritance.model.dto;

public class SmartPhone extends Phone {
	
	// 필드(속성)
	private String operatingSystem;
	
	private int storageCapacity;
	
	// 생성자
	public SmartPhone() {} // 기본 생성자
	
    //매개변수 생성자
	public SmartPhone(String brand, String model, int year, int price, 
			          String operatingSystem, int storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}
    
	// 메서드
	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	// Override : 상속받은 부모 메서드를 재정의 하는 것!
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Operating System : " + operatingSystem );
		System.out.println("Storage Capacity : " + storageCapacity + "GB");
	}
	
	
 

}
