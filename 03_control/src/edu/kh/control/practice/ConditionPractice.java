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
	     
	     public void ex4() {
	    	 
	    	 
	    	 
	    	 
	    	 
	     }
	     
	     
	     
	     
	     public void ex5() {}
	
	
	
	
	
	
	
	
	

}
