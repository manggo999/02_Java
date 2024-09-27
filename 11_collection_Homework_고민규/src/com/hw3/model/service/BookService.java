package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {
	
	// 필드
	
	// 입력시 필요한 객체
	private Scanner sc = new Scanner(System.in);
	
	// 도서를 저장할 목록 List
	private List<Book> library = new ArrayList<Book>();
	//   부모타입     참조변수 = 자식객체의 주소(다형성 중 업캐스팅)
	
	// 즐겨찾기 도서를 저장할 목록 List
	private List<Book> favList = new ArrayList<Book>();
	
	public BookService() {
		// BookService 객체가 생성될 때 library List에 5개 도서 등록
		library.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		library.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		library.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		library.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		library.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
		
		
	}
	
	// 메서드
	public void displayMenu() {
		// try-catch : 예외가 발생하면 잡아서 catch 문 안에서 처리하는 것
		try { // 예외가 발생 할 것 같은 우려가 되는 코드를 작성하면 됨
			
			int menuNum = 0;
			
			do { // 한번이라도 반복
				
				System.out.println("===도서 목록 프로그램===");
				System.out.println("1. 도서 등록");
				System.out.println("2. 도서 조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가");
				System.out.println("6. 즐겨찾기 삭제");
				System.out.println("7. 즐겨찾기 조회");
				System.out.println("8. 추천도서 뽑기");
				System.out.println("0. 프로그램 종료");

				System.out.print("메뉴를 입력하세요 : ");
				
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1 : addBook(); break;
				
				
				case 2 : showBookList(library); break;
				
				
				case 3 : System.out.println(editBook()); break;
				 
				/*
				case 4 : System.out.println(deleteBook()); break;
				
				case 5 : addFavorite(); break;
				case 6 : deleteFavorite(); break;
				
				
				case 7 : showBookList(favList); break;
				
				case 8 : randomBook(); break;
				*/
			
				case 0 : System.out.println("종료되었습니다."); break;
				default : System.out.println("메뉴에 있는 번호만 입력하세요!"); break;
				}
				
			}while(menuNum != 0);
			
		} catch (Exception e) {
			// Exception : 예외 클래스의 최상위 클래스
			System.out.println("예외 발생");
			e.printStackTrace(); // 예외추적
		}
		
	}
	
	
	/** 도서 등록 메서드
	 * 
	 */
	public void addBook() {
		
		System.out.println("========도서 등록=========");
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거용
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String writer = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거용
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
		
		Book newBook = new Book(bookNum, title, writer, price, publisher);
		
		library.add(newBook);
		
		System.out.println("등록완료");
		
		
	}
	
	/** 도서 목록 조회용 메서드
	 * 
	 * @param (매개변수) List<Book> == Book으로 제한되어 있는 List
	 */
	public void showBookList(List<Book> list) {
		
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요!");
			
		}else {
			
			//list를 순회하면서 각 Book 객체를 출력
			// 향상된 for문 사용
			for(Book temp : list) {
				System.out.println(temp); // Book.toString();
			}
		
			
		}
		
	}
	
	
	
	/** 도서 수정용 메서드
	 * @return
	 */
	public String editBook() {
		
		showBookList(library); // 등록된 도서를 출력하기
		
		System.out.println("======도서 수정========");
		
		int editMenu = 0; // 수정 메뉴 선택용 변수
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();
		
		boolean flag = true;
		 
		for(Book temp : library) {
			
			if(temp.getBookNum() == bookNum) { 
				// 입력한 도서번호와 도서 목록의 도서 번호가 일치하는걸 찾았을때
			
				flag = false;
				
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");
				System.out.print("어떤 정보를 수정하시겠습니까? ");
				
				editMenu = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				
				switch(editMenu) {
				case 1 : 
					System.out.println("===도서명 수정===");
					System.out.print("수정할 도서명을 입력하세요 : ");
					String title = sc.nextLine();
					temp.setTitle(title);
					break;
					
				case 2 :
					System.out.println("===도서 저자 수정===");
					System.out.print("수정할 저자명을 입력하세요 : ");
					String writer = sc.nextLine();
					temp.setWriter(writer);
					break;
					
				case 3 :
					System.out.println("===도서 가격 수정===");
					System.out.print("수정할 가격을 입력하세요 : ");
					int price = sc.nextInt();
					temp.setPrice(price);
					break;
					
				case 4 :
					System.out.println("===도서 출판사 수정===");
					System.out.print("수정할 출판사를 입력하세요 : ");
					String publisher = sc.nextLine();
					temp.setPublisher(publisher);
					break;
					
				case 0 : System.out.println("종료합니다..."); break;
				default : System.out.println("메뉴에 있는 번호만 선택하세요"); break;
				}
				
			}
		}
		
		if(flag) {
			return "일치하는 도서 번호가 없습니다.";
		}
		
		return "수정 완료";
	}
	
	
	
	
	
	
	
	
	
	

}
