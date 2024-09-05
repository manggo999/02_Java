package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	
	public void ex1() {
		
		Book b = new Book(); //새로운 Book 객체를 Heap 영역에 생성
		
		System.out.println
		(b.getTitle() + " / " +b.getPrice() + " / " + b.getDiscountRate() + " / " + b.getAuthor());
		
		b.setTitle("자바의 정석");
		b.setPrice(30000);
		b.setDiscountRate(0.2);
		b.setAuthor("남궁성");
		
		System.out.println
		(b.getTitle() + " / " +b.getPrice() + " / " + b.getDiscountRate() + " / " + b.getAuthor());
		
		System.out.println("==========================================================");
		
		System.out.println("수정된 결과 확인");
		
		
	}
	

}
