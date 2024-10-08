package edu.kh.oop.practice.model.vo;

public class Book {
	
	//필드
	private String title; // 도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자명
	
	
	
	
	//생성자
	public Book() {} // 기본생성자(ctrl + space + enter)

	//매개변수 생성자
	// alt + shift + s -> Generate Constructor
	
	public Book(String title, int price, 
			   double discountRate, String author) { //필드 초기화
		this.title = "title";
		this.price = price;
		this.discountRate = discountRate;
		this.author = "author"; 
	}


	
	//메서드
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

    // 어노테이션 : 컴파일러용 주석
	// Overriding : 재정의(메서드)
	@Override
	public String toString() {
		return title + " / " + price+ " / " + discountRate + " / " + author;
	}
	
	
	/*
	 * 현실객체: this
	 * 객체지향언어:
	 * 자바객체: 
	 * class:
	 * new 연산자:
	 * 추상화:
	 * 캡슐화:
	 * 캡슐화 원칙:
	 * 메서드/기능의 '정의'란:
	 * 메서드의 '호출' 이란:
	 * return:
	 * 
	 * public
	 *  
	 * 
	 * 
	 * */
	
	

}
