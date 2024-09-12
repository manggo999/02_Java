package edu.kh.inheritance.model.dto;

public class Phone {
	
	// 필드(속성)
	private String brand;
	private String model;
	private int year;
	private int price;
	
	// 생성자
	public Phone() {} // 기본생성자
	
	// 매개변수 생성자
	public Phone(String brand, String model, int year, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	
    // 메서드
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void printInfo() {
		
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Year : " + year);
		System.out.println("Price : " + price + "원");
	}
	
	
	
	
	
	

}
