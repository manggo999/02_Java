package edu.kh.test;

import java.util.Scanner;

public class test1 {
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("2~9사이 정수 입력 : ");
		int input = sc.nextInt();
		
		if(input >= 2 && input >= 9) {
			for(int num = 1; num <= 9; num++) {
				System.out.printf("%d X %d = %d\n", input, num, input * num);
			}
			break;
			
		} else {
			System.out.println("2이상 9이하의 정수만 입력해주세요.");
		}
		
		
		
	}
}

}



