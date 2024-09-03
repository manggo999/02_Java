package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice { // 기능 제공용 클래스
	
	//메서드...
	
	public void practice1(){
		/*
		 * 
		 * 모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		 * 인원 수와 사탕 개수를 키보드로 입력 받고
			1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
			
			[실행화면]
			인원 수 : 29
			사탕 개수 : 100
			
			1인당 사탕 개수 : 3
			남는 사탕 개수 : 13
		 * 
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n", input2 / input1 );
		System.out.printf("남은 개수 : %d\n", input2 % input1 );
	}
		
		
	
	
	
	
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		
		System.out.println("학년 : ");
		int grade = sc.nextInt();
		
		
        System.out.println("반 : ");
		int classroom = sc.nextInt();
		
		
        System.out.println("번호 : ");
		int number = sc.nextInt();
		
		sc.nextLine(); // 개행문자 비우기
		
		System.out.println("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.println("성적 : " );
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", 
				grade, classroom, number, name, gender, score);
		
		
	} 
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();

        System.out.print("영어 : ");
		int eng = sc.nextInt();
		
        System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math; // 합계
		double avg = sum / 3.0; // 평균
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n" , avg);
		
        boolean result = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);
		
		System.out.println( result ? "합격" : "불합격" );
		
		
		
	}

}
