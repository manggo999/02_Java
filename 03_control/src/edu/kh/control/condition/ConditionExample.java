package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 제공용 클래스
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		// if 문
		// 조건식이 true 일때만 내부 코드 수행
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수 입니다");
		}
		
		if(input <= 0) {
			System.out.println("양수가 아닙니다");
		}
		
	}
	
	public void ex2() {
		
		// if - else 문
		// 조건식 결과가 true 면 if문
		// false면 else 구문이 형성됨
		
		//홀짝검사
		//입력받은 정수값이
		//홀수이면 "홀수입니다"
		//0이면 "0입니다"
		//짝수이면 "짝수입니다"
		//else.if 사용 x, 중첩 if 문 사용하기
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input % 2 !=0) {
			System.out.println("홀수 입니다");
		} else { // 짝수 또는 0 입력 시 수행
			
			//중첩 if
			if(input == 0) {
				System.out.println("0 입니다");
				}else {
					System.out.println("짝수 입니다");
			}
			
		}
		
	}
	
	
	public void ex3() {
		
		//if(조건식) - else if(조건식) - else
		
		// 양수, 음수, 0판별
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수 입니다");
			
		} else if(input < 0) {// 바로 위에 있는 if문이 만족되지 않을 경우 수행
			System.out.println("음수 입니다");
			
		} else {
			System.out.println("0 입니다");
		}
	}
	
	
	public void ex4() {
		
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 1,2,12 겨울 (-15도 이하 : "한파 경보" / -12도 이하 "한파주의보" 
		// 3~5 봄
		// 6~8 여름 (35도 이상 : "폭염 경보" / 33도 이상 : "폭염 주의보")
		// 9~11 가을
		// 1~12 사이가 아닐 땐 "해당하는 계절이 없다" 출력
		
		System.out.println("달 입력 : ");
		int month = sc.nextInt();
		
		String season; // 아래 조건문 수행결과를 저장할 변수 선언
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			
			System.out.println("온도입력 : ");
			int temperature = sc.nextInt();
			
			if(temperature <= -15) {
				// 겨울 한파경보
				season += "한파경보"; 
						
			} else if(temperature <= -12) {
				season += "한파 주의보"; // 겨울 한파 주의보
			}
			
		} else if(month >= 3 && month <= 5) {
			season = "봄";
			
		} else if(month >= 6 && month <= 8) {
			season = "여름";
			
			System.out.println("온도입력 : ");
			int temperature = sc.nextInt();
			
			if(temperature >= 35) {
				
				season += "폭염경보"; 
			} 	else if(temperature <= -12) {
				season += "폭염 주의보"; 
			}
			
			
		} else if(month >= 9 && month <= 11) {
			season = "가을";
			
		} else {
			season = "해당하는 계절이 없습니다";
		}
		
	}
	
	
	public void ex5() {
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.print("어린이 입니다");
			
		} else if (13 < age && 19 >= age) {
			System.out.print("청소년 입니다");
			
		} else if (age > 19) {
			System.out.print("성인 입니다");
		}
		
			
		
	
	}
	
	
	public void ex6() {
		
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("잘못 입력하셨습니다"); 
			
		} else if (score > 90 && score < 100) {
			System.out.println("A");
			
		} else if(score > 80 && score < 90) {
			System.out.println("B");
			
		} else if(score > 70 && score < 80) {
			System.out.println("C");
			
		} else if(score > 60 && score < 70) {
			System.out.println("D");
			
		} else if(score < 60) {
			System.out.println("F");	
		} 
	}
	
	
	public void ex7() {
		
		System.out.println("나이 : " );
		int age = sc.nextInt();
		
		String result;
		
		System.out.println("키 : ");
		double height = sc.nextDouble();
		
		if (age < 0 || age > 100) {
			System.out.println("잘못 입력하셨습니다");
			
		} else if (age >= 12 && height >= 140.0) {
			System.out.println("탑승가능");
			
		} else if (age < 12 ) {
			System.out.println("적정 연령이 아닙니다");
			
		} else if ( height < 140.0) {
			System.out.println("적정 키가 아닙니다");
		}
		
		System.out.println("나이 : " );
		int age = sc.nextInt();
		
		String result;
		
		if (age < 0 || age > 100) {
			result = "잘못 입력하셨습니다";
			
		} else // 나이를 잘 입력한 겨우 0~100 사이
			
		
		
	}
	
	
	public void ex8() {
		
		System.out.println("나이입력 : " );
		int age = sc.nextInt();
		
		String result;
		
		if (age < 0 || age > 100) {
			result = "나이를 잘못 입력하셨습니다";
			
		} else { // 0~250 잘 입력한 경우
				
				System.out.println("키 입력 : " );
		        double height = sc.nextDouble();
				
		        }if(height < 0 || height > 250.0) {
			    result = "키를 잘못 입력하셨습니다";
			    
		      } else if (age >= 12 && height < 140.0) {
		    	   result = "나이는 적절하나, 키가 적절치 않음";
		    			   
		      } else if(age < 12 && height < 140.0) {
		    	   result = "나이와 키 모두 적절치 않음";
		    			   
		      } else {
		    	   result = "탑승가능!!";
		      }
				
		
		
		
		
		
		
		
		
	}

}
