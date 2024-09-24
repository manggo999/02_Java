package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;

import com.hw2.model.dto.Animal;

public abstract class Zoo { // ctrl + shift + o -> import 자동 완성
	
	// 속성
	private List <Animal> animals = new ArrayList<Animal>();

	
	// 생성자 + 메서드
	
	public Zoo() {} // 기본 생성자

    // 매개변수 생성자
	public Zoo(List<Animal> animals) {
		super();
		this.animals = animals;
	}
	
	public void showAnimals(){}
	
	public void dispayMenu(){
		
		int result = 0; // 메뉴 선택용 변수
		
		System.out.println("****** kH 동물원 *******");
		System.out.println("원하는 작업을 선택하세요 : ");
		System.out.println("1. 동물들의 울음소리 듣기 : ");
		System.out.println("2. 종료");
		System.out.println("선택: ");
		
		if(result == 2) {
		
		    System.out.println("프로그램을 종료합니다.");
	
		} else if(result == 1) {
			
			System.out.println("동물들의 울음소리를 들어보세요 : ");
			
		}
	}
	
	

	
    
	
	
	

}
