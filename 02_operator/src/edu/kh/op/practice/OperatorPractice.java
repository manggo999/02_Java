package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice { // 기능 제공용 클래스
	
	//메서드...
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 :  ");
		int i1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int i2 = sc.nextInt();
		
		int candy = i2 / i1; 
		System.out.println("1인당 사탕 개수 : " + candy);
		
	
	
	  }
	
	
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("이름 : ");
		
		String name = sc.nextLine();
		
		
		System.out.println("학년 : ");
		
		int grade = sc.nextInt();
		
		
        System.out.println("반 : ");
		
		int cl = sc.nextInt();
		
		
        System.out.println("번호 : ");
		
		int number = sc.nextInt();
		
		
		System.out.println("성별 : ");
		
       
        
		
		System.out.println("성적 : " );
		
		double gr = sc.nextDouble();
		
		
		
		
		
	} 
	
	
	
	
	public void practice3() {
		
		
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kl = sc.nextInt();

        System.out.print("영어 : ");
		int eg = sc.nextInt();
		
        System.out.print("수학 : ");
		int mt = sc.nextInt();
		
		int plus = kl + eg + mt;
		System.out.println("합계 : "+ plus);
		
		double average = (kl + eg + mt)/3;
		System.out.printf("평균 : "+ average);
		
		
		
		
		
	}

}
