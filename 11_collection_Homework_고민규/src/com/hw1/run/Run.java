package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Run {

	public static void main(String[] args) {
	
	// ArrayList 객체 생성
	List<String> nameList = new ArrayList<String>(); 
	
	// ArrayList에 추가
	nameList.add("짱구");
	nameList.add("철수");
	nameList.add("유리");
	nameList.add("훈이");
	nameList.add("맹구");
	
	// Random 클래스 사용
	Random random = new Random();
	
	int randomIndex = random.nextInt(nameList.size());
	
	String randomElement = nameList.get(randomIndex);
	
	System.out.println(randomElement + "가 떡잎방범대 대장이다!");
	
	

	}

}
