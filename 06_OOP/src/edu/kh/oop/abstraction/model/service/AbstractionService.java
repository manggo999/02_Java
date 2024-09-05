package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People; // ctrl + shift + o

// Service : 특정기능(비즈니스 로직)을 제공하는 클래스
public class AbstractionService {
	
	public void ex1(){
		// people 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1
		// new People() : 새로운 People 객체를 Heap 영역에 생성
		
		// * 클래스 이름이 자료형 처럼 사용된다
		//   만든 클래스를 자료형으로 사용
		// == 그래서 클래스를 "사용자 정의 자료형" 이라고도 부른다!
		
		/*
		p1.name = "홍길동"; // The field People.name is not visible 에러!
		p1.gender = '남';
		p1.pNo = "12345-1234567";
		p1.address = "서울시 중구 남대문로";
		p1.phone = "010-1234-1234";
		p1.age = 20;
		
		p1.tax();
		p1.vote();
		
		System.out.println("p1의 name: " + p1.name);
		System.out.println("p1의 gender: " + p1.gender);
		System.out.println("p1의 pNo: " + p1.pNo);
		System.out.println("p1의 address: " + p1.address);
		System.out.println("p1의 phone: " + p1.phone);
		System.out.println("p1의 age: " + p1.age);
		
		*/
		
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("12345-123456");
		p1.setAddress("서울시 중구 남대문로");
		p1.setPhone("010-1234-1234");
		p1.setAge(20);
		
		System.out.println(p1.getName());
		System.out.println(p1.getGender());
		System.out.println(p1.getpNo());
		System.out.println(p1.getAddress());
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		
		
		// 본인 객체
	    // People 클래스 이용하여 minkyu
		
		People minkyu = new People();
		
		minkyu.setName("고민규");
		minkyu.setGender('남');
		minkyu.setpNo("123453-123456");
		minkyu.setAddress("경기도 고양시");
		minkyu.setPhone("010-1234-1234");
		minkyu.setAge(22);
		
		System.out.println(minkyu.getName());
		System.out.println(minkyu.getGender());
		System.out.println(minkyu.getpNo());
		System.out.println(minkyu.getAddress());
		System.out.println(minkyu.getPhone());
		System.out.println(minkyu.getAge());
		
	}
	
	    
	
	
		
		
	
	
	
	
	
	
	
	
	
	

}
