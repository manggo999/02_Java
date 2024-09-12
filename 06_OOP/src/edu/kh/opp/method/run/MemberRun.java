package edu.kh.opp.method.run;

import edu.kh.opp.method.model.service.MemberService;

public class MemberRun { // 실행용 클래스

	public static void main(String[] args) {
		MemberService service = new MemberService();
		// MembersService의 기본 생성자가 작성되어 있지 않지만
		// 컴파일러가 코드를 번역할 때 
		// 클래스 내부에 생성자가 하난도 없다면
		
		// **주의사항
		
		
		
	
		service.displayMenu();
	}

}