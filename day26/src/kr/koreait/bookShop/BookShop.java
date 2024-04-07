package kr.koreait.bookShop;

import java.util.Date;

public class BookShop {
	
	public static void main(String[] args) {
		
		BookList bookList = new BookList(5);
		
//		Date date = new Date();                 // 현재 컴퓨터 시스템의 날짜와 시간을 얻어온다.		
//		Date date = new Date(년, 월, 일);        // 입력한 년, 월, 일에 해당되는 날짜를 만든다.
//		날짜를 만들거나 입력하는 경우 Date 클래스는 1900년을 기준으로 처리하므로 년은 1900을 빼서 입력한다.
//		월을 입력할 때는 1을 빼서 입력해야 정상적으로 처리된다.(컴퓨터는 1~12을 인덱스값으로 0~11로 인식하므로 우리가 1월을 출력하고 싶으면 컴퓨터는 0부터 시작하므로 우리가 출력하고 싶은 1월에서 1을 뺀 0을 입력해야 컴퓨터가 1을 출력한다.		
		BookVO book1 = new BookVO("자바", "홍길동", "코리아출판사", new Date(2015, 5, 15), 35000.);   // 이대로 출력하면 1900+2015 = 3915가 출력되므로 2015에서 1900을 뺀 115를 입력하면 되지만 사용자(고객)에게 그걸 시킬순 없으니 BookVO 클래스(24행 참고)에서 get, set으로 수정해준다.
		BookVO book2 = new BookVO("자바", "홍길자", "코리아출판사", new Date(2015, 5, 15), 35000.);   
		BookVO book3 = new BookVO("자바", "홍길숙", "코리아출판사", new Date(2015, 5, 15), 35000.);   
		BookVO book4 = new BookVO("자바", "홍길희", "코리아출판사", new Date(2015, 5, 15), 35000.);   
		BookVO book5 = new BookVO("자바", "홍길영", "코리아출판사", new Date(2015, 5, 15), 35000.);   
		BookVO book6 = new BookVO("자바", "홍길수", "코리아출판사", new Date(2015, 5, 15), 35000.);   // 현재 배열의 크기는 5인데 이렇게 하나를 더 추가하면 에러가 뜬다.
// 		또한 5를 입력했는데 6월로 출력되는 것을 볼 수 있는데 위에서 설명한듯이 컴퓨터는 인덱스번호로 인식하기 때문에 BookVO 클래스 에서 get으로 가져온뒤 -1을 해주어 set으로 수정해주면 된다.  		
//		System.out.println(book1);
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);
		
		System.out.println(bookList);       // BookList 클래스에 만든 배열 booklist에 저장된 값 출력
		
	}

}





















































