package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice { // 기능 제공용 클래스
	
         Scanner sc = new Scanner(System.in);
	
	     public void ex1() {
	    	 
	    	 System.out.println("숫자를 한 개 입력하세요 : " );
	 		 int num1 = sc.nextInt();
	 		 
	 		 String result1;
	    	 
	    	 if(num1 > 0 && num1 %2 == 0) {
	    		 result1 = "짝수입니다."; 
	    		 System.out.println(result1);
	    	 } 
	    	 
	    	 System.out.println("숫자를 한 개 입력하세요 : " );
	 		 int num2 = sc.nextInt();
	 		 
	 		 String result2;
	 		 
	    	 if (num2 >0 && num2 %2 != 0  ) {
	    	     result2 = "홀수입니다.";
	    	     System.out.println(result2);
	    		 
	    	 }
	    	 
	    	 System.out.println("숫자를 한 개 입력하세요 : " );
	 		 int num3 = sc.nextInt();
	 		 
	 		 String result3;
	 		 
	    	 if (num3 < 0 ) {
	    	     result3 = "양수만 입력해주세요.";
	    	     System.out.println(result3);
	    		 
	    	 }
	    	 
	    	 
	    	 
	    	 
	     }
	     
	     
	     public void ex2() {
	    	 
	     	 
	    	 
	    	 String result;
	    	 
	    	 System.out.print("국어점수 : " );
	 		 int k = sc.nextInt();
	 		 
	 		 System.out.print("수학점수 : " );
	 		 int m = sc.nextInt();
	 		 
	 		 System.out.print("영어점수 : " );
	 		 int e = sc.nextInt();
	 		 
	 		 int plus = k + m + e;
	 		 System.out.print("합계 : " + plus); // 합계
	 		 
	 		 double average = (k + m + e)/3;
	 		 System.out.print("평균 : " + average); //평균
	 		 
	 		 if (plus > 183  && average > 60.0) {
	 			 result = "축하합니다, 합격입니다!";
	 					 
	 		 } else {
	 			 result = "불합격입니다.";
	 					 
	 		 }
	 		 
	 		 System.out.println(result);
	 		 
	     }
	     
	     
	     public void ex3() {
	    	 
	    	 System.out.print("1~12월 사이의 정수 입력 : " );
	    	 int month = sc.nextInt();
	    	 
	    	 switch(month) {
	    	 case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	    		 System.out.println(month + "월은 31일까지 있습니다");
	    		 break;
	    		 
	    	 case 4: case 6: case 9: case 11:
	    		 System.out.println(month + "월은 30일까지 있습니다");
	    		 break;
	    		 
	    	 case 2: 	 
	    		 System.out.println(month + "월은 28일까지 있습니다");
	    		 break;
	    		 
	    	 default: System.out.println(month + "월은 잘못입력된 달입니다");
	    	 
	    	 }
	    	 	    	 
	     }
	     
	     public void practice4() {
	 		
	 		/*키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
	 		저체중/정상체중/과체중/비만을 출력하세요.
	 		
	 		BMI = 몸무게 / (키(m) * 키(m))
	 		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
	 		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
	 		BMI가 30이상일 경우 고도 비만
	 		 * 
	 		 * 
	 		 * */
	 		
	 		System.out.print("키(m)를 입력해주세요 : ");
	 		double height = sc.nextDouble();
	 		
	 		System.out.print("몸무게(kg)를 입력해주세요 : ");
	 		double weight = sc.nextDouble();
	 		
	 		// BMI = 몸무게 / (키(m) * 키(m))
	 		double bmi = weight / (height * height);
	 		System.out.println("BMI 지수 : " + bmi);
	 		
	 		// BMI가 18.5미만일 경우 저체중 
	 		// 18.5이상 23미만일 경우 정상체중
	 		// BMI가 23이상 25미만일 경우 과체중 
	 		// 25이상 30미만일 경우 비만
	 		// BMI가 30이상일 경우 고도 비만
	 		
	 		String result;
	 		
	 		if(bmi < 18.5) {
	 			result = "저체중";
	 		} else if(bmi < 23) {
	 			result = "정상체중";
	 		} else if(bmi < 25) {
	 			result = "과체중";
	 		} else if(bmi < 30) {
	 			result = "비만";
	 		} else {
	 			result = "고도비만";
	 		}
	 		
	 		System.out.println(result);
	 		
	 		
	 		
	 		
	 	}
	 	
	 	
	 	
	 	
	 	public void practice5() {
	 		
	 		/*중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
	 		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
	 		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
	 		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
	 		 * */
	 		
	 		
	 		System.out.print("중간 고사 점수 : ");
	 		double midTerm = sc.nextDouble();
	 		
	 		System.out.print("기말 고사 점수 : ");
	 		double finalTerm = sc.nextDouble();
	 		
	 		System.out.print("과제 점수 : ");
	 		double report = sc.nextDouble();
	 		
	 		System.out.print("출석 횟수 : ");
	 		double attendance = sc.nextDouble();
	 		
	 		// 각각의 점수를 비율에 맞게 변경
	 		midTerm *= 0.2; // midTerm = midTerm * 0.2;
	 		finalTerm *= 0.3; // finalTerm = finalTerm * 0.3;
	 		report *= 0.3; // report = report * 0.3;
	 		
	 		System.out.println("================= 결과 =================");
	 		
	 		if(attendance <= 20 * (1 - 0.3)) { // 14번 이하 출석했을 경우
	 			System.out.println("Fail [출석 횟수 부족] (" + (int)attendance + "/20)");
	 			
	 		} else { // 출석 만족 시
	 			
	 			System.out.printf("중간 고사 점수(20) : %.1f \n", midTerm);
	 			System.out.printf("기말 고사 점수(30) : %.1f \n", finalTerm);
	 			System.out.printf("과제 점수(30) : %.1f \n", report);
	 			System.out.printf("출석 점수(20) : %.1f \n", attendance);
	 			
	 			double sum = midTerm + finalTerm + report + attendance;
	 			
	 			System.out.printf("총점 : %.1f \n", sum);
	 			
	 			if( sum >= 70 ) {
	 				System.out.println("PASS");
	 			} else {
	 				System.out.println("Fail [점수미달]");
	 			}
	 			
	 			
	 		}
	 		
	 		
	 	
	 		
	 	}

	 }