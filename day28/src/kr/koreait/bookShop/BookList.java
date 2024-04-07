package kr.koreait.bookShop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

// 여러 권의 책 정보(BookVO)를 기억할 클래스
public class BookList {
	
	private ArrayList<BookVO> bookList = new ArrayList<>();      // 여러 권의 책 정보를 기억할 ArrayList
//	배열과 달리 ArrayList는 데이터가 들어오면 들어오는만큼 알아서 커지고 데이터가 빠져나가면 빠져나가는만큼 알아서 작아진다. 	
	
	public ArrayList<BookVO> getBookList() {
		return bookList;
	}
	
	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	 // 우리가 정수를 기억하는 배열은 int[] 라고 만들듯이 BookVO 클래스의 정보를 기억할 배열은 이렇게 만든다.
	// 책 정보를 기억할 배열을 선언만 한 상태
	// 배열의 크기
	// 배열의 첨자, 배열에 저장된 데이터의 개수(book1~n개 까지의 개수, book1 데이터 저장시 count++로 인해 0->1로 book2 데이터 저장시 다시 count++로 인해 1->2로 증가하므로 배열에 저장되는 데이터의 개수로 볼 수 있다.)
	
//	기본 생성자가 실행되면 30권의 책을 저장할 수 있는 배열을 만들고 배열의 크기를 넘겨받는 생성자가 실행되면 넘겨받은 크기만큼 배열을 만든다.
	
	@Override
	public String toString() {
		String str = "";
		str += "=================================================\n";
		str += "도서명 저자명 출판사명 출판일 가격 \n";
		str += "=================================================\n";
		
		double total = 0.0;
//		ArrayList에 저장된 데이터의 개수 만큼 반복한다.		
//		for(int i=0 ; i<bookList.size() ; i++) {   // day27에서는 bookList.length() 를 사용해서 배열의 크기를 가져왔는데 여기서는 size()를 사용해서 ArrayList에 저장된 데이터의 개수를 가져왔다. 
//			str += bookList.get(i) + "\n";
//			total += bookList.get(i).getPrice();
//		}
		
//		향상된 for : 배열이나 ArrayList에 저장된 내용을 0번째 값부터 마지막 값까지 전체를 처리할 때 사용하면 효과적이다. 
//		for(배열이나 ArrayList의 자료형 변수명 : 배열이나 ArrayList 이름) {
//			반복해서 실행할 문장;
//			...;
//		}
		for(BookVO book : bookList) {
			str += book + "\n";
			total += book.getPrice();
		}
		
		str += "=================================================\n";
		DecimalFormat df = new DecimalFormat("#,##0원");
		str += " 합계 금액 : " + df.format(total) + "\n";
		str += "=================================================\n";
		return str;
	}
	

	//	배열 bookList에 BookVO 클래스 객체를 저장하는 메소드
	public void addBook(BookVO book) {        // 이 메소드는 저장하는 기능만 필요하므로 별도로 리턴작업은 할 필요가 없으므로 void 리턴타입을 입력.
//	if를 사용하는 전통적인 예외처리
//		if(count < size) {             // 현재 배열의 크기를 5로 만든 상황인데 BookShop 클래스에 BookVO book6 = new BookVO("자바", "홍길수", "코리아출판사", new Date(2015, 5, 15), 35000.); 이렇게 book6에 대한 생성자 함수 인자와 bookList.addBook(book6); 이렇게 방금 만든 book6의 데이터가 addbook 함수 
			bookList.add(book);  // 의 인자로 들어가게 코딩해준후 출력하면 에러가 발생되는데(배열의 크기 0~4 를 넘었으므로) 좌측과 같이 if문을 사용하면 인덱스값이기도 한 count가 배열의 크기인 size와 같거나 크게되면 실행을 하지 않겠다 라는 의미이므로 오류가 발생하지 않는다.
//		} else {
//			System.out.println("배열이 가득차서 " + book.getAuthor() + "의 책을 추가할 수 없습니다.");  // 이런 식으로 에러가 안나게 처리해주는 것을 "예외처리" 라고 한다. 
//		}
		
//		try ~ catch를 사용하는 자바의 예외(Exception)처리	// if를 사용하는 전통적인 예외처리 보다는 try ~ catch 블록을 이용하는게 훨씬 더 깔끔하게 예외를 처리할 수 있다.
		
//		예외가 발생될 것으로 예상되는 문장을 try 블록에 쓴다.
//		예외가 발생되면 처리할 문장을 catch 블록에 쓴다.
//		try 블록의 내용을 실행하다가 예외가 발생되면 더 이상 try 블록을 실행하지 않고 해당 예외의 catch 블록을 실행한다.
//			Exception 클래스는 예외의 최상위 클래스로서 모든 예외를 감지할 수 있다.
//			catch 블록에 Exception을 적을 경우 반드시 맨 마지막 catch 블록에 적어야 한다.			
//			System.out.println("배열이 가득차서 " + book.getAuthor() + "의 책을 추가할 수 없습니다.");
//			printStackTrace() : 발생된 예외 이름과 예외가 발생된 문장을 발생 순서의 역순으로 추적한다.
// 			어떤 클래스 파일에 몇번째 줄에서 어떠어떠한 Exception이 발생됬다.그리고 이 줄은 어떤어떤 클래스의 또 어떠어떠한 줄에 의해서 생겼다. 이럴거를 추적할때 사용한다. 			
			// 이 e라고 하는 변수에는 catch (ArrayIndexOutOfBoundsException e) { or catch (Exception e) { 여기서 잡아낸 예외 정보가 들어가게 된다.  
		
//			finally 블록은 선택 사항으로서 예외 발생 여부와 관계 없이 무조건 실행해야 할 문장이 있으면 적는다.
			
	}
}
	
	











































