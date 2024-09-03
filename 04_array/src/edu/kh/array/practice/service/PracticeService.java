package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	
	public void practice1() {
		
		
		
		int[] arr = new int[9]; // 배열 선언 및 할당
		
		// 1~9까지의 값을 반복문 사용
		for(int i = 0; i < arr.length; i++) { 
			
			/**arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
			arr[4] = 5;
			arr[5] = 6;
			arr[6] = 7;
			arr[7] = 8;
			arr[8] = 9;
			
			System.out.print(arr[i]);**/
			
			System.out.println(i + "");
			
			}
			
		/**int sum = 1+3+5+7+9;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("짝수 번째 인덱스 합 :" +sum);**/
		
		}
	
	
	
	public void practice2(){
		
        int[] arr = new int[9]; // 배열 선언 및 할당
		
		// 9~1 까지의 값을 반복문 사용
		for(int i = 0; i < arr.length; i++) { 
			
			arr[0] = 9;
			arr[1] = 8;
			arr[2] = 7;
			arr[3] = 6;
			arr[4] = 5;
			arr[5] = 4;
			arr[6] = 3;
			arr[7] = 2;
			arr[8] = 1;
			
			System.out.print(arr[i]);
			
			}
			
		int sum = 8+6+4+2+0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("홀수 번째 인덱스 합 :" +sum);
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		if(num >= 1) {
			
			for(int i =1; i <= num; i++) {
				System.out.print(i + " ");
			}
			
		  }
		
        }
		
	
     public void practice4(){
		
    	 int[]arr = {5, 8, 9, 10, 4};
    	 
    	 Scanner sc = new Scanner(System.in);
 		
 		 System.out.print("검색할 값 : ");
 		 int input = sc.nextInt();
 		 
 		boolean flag = false;
 		
 		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == input) {
				System.out.println(i);
			    flag = true;
			    
			}
	   } 
		   
	    if(!flag) {
	    	System.out.println("일치하는 값이 존재하지 않습니다.");
	    } 
		
	}
	
	
	
	
	
	
	
	

	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

