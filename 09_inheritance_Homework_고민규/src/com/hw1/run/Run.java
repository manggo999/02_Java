package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {

	public static void main(String[] args) {
		
		Book b1 = new Novel();
		Book b2 = new Textbook();
		Book b3 = new Poetry();
		
		Book[] books = new Book[3];
		// Book 참조변수 배열 선언 및 할당
		
		books[0] = new Novel("해리포터", "J.K.롤링", "판타지");
		// 부모타입 참조변수 = 자식객체(업캐스팅)
		
		books[1] = new Textbook("자바 프로그래밍", "James Gosling", "컴퓨터 과학");
		// 부모타입 참조변수 = 자식객체(업캐스팅)
		
		books[2] = new Poetry("우리들의 사랑시", "김소월", 30);
		// 부모타입 참조변수 = 자식객체(업캐스팅)
		
		// 모든 도성 정보 출력
		for(Book book: books) {
			book.displayInfo();
			System.out.println(); // 개행
		}
	

	}

}
