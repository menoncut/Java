package kr.koreait.bookShop;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Date;

// 여러 권의 책 정보(BookVO)를 기억할 클래스
public class BookList {
	
	private BookVO[] bookList;        // 우리가 정수를 기억하는 배열은 int[] 라고 만들듯이 BookVO 클래스의 정보를 기억할 배열은 이렇게 만든다.
    // 책 정보를 기억할 배열을 선언만 한 상태
	private int size;                 // 배열의 크기
	private int count;                // 배열의 첨자, 배열에 저장된 데이터의 개수(book1~n개 까지의 개수, book1 데이터 저장시 count++로 인해 0->1로 book2 데이터 저장시 다시 count++로 인해 1->2로 증가하므로 배열에 저장되는 데이터의 개수로 볼 수 있다.)
	
//	기본 생성자가 실행되면 30권의 책을 저장할 수 있는 배열을 만들고 배열의 크기를 넘겨받는 생성자가 실행되면 넘겨받은 크기만큼 배열을 만든다.
	public BookList() {
		this(30);
	}

	public BookList(int size) {
		this.size = size;
		bookList = new BookVO[size];
	}

	public BookVO[] getBookList() {
		return bookList;
	}

	public void setBookList(BookVO[] bookList) {
		this.bookList = bookList;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		String str = "";
		str += "=================================================\n";
		str += "도서명 저자명 출판사명 출판일 가격 \n";
		str += "=================================================\n";
		
		double total = 0.0;
		for(int i=0 ; i<bookList.length ; i++) {
			if(bookList[i] == null) {
			    break;
			}
			str += bookList[i] + "\n";
			total += bookList[i].getPrice();
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
//			bookList[count++] = book;  // 의 인자로 들어가게 코딩해준후 출력하면 에러가 발생되는데(배열의 크기 0~4 를 넘었으므로) 좌측과 같이 if문을 사용하면 인덱스값이기도 한 count가 배열의 크기인 size와 같거나 크게되면 실행을 하지 않겠다 라는 의미이므로 오류가 발생하지 않는다.
//		} else {
//			System.out.println("배열이 가득차서 " + book.getAuthor() + "의 책을 추가할 수 없습니다.");  // 이런 식으로 에러가 안나게 처리해주는 것을 "예외처리" 라고 한다. 
//		}
		
//		try ~ catch를 사용하는 자바의 예외(Exception)처리	// if를 사용하는 전통적인 예외처리 보다는 try ~ catch 블록을 이용하는게 훨씬 더 깔끔하게 예외를 처리할 수 있다.
		
//		예외가 발생될 것으로 예상되는 문장을 try 블록에 쓴다.
//		예외가 발생되면 처리할 문장을 catch 블록에 쓴다.
//		try 블록의 내용을 실행하다가 예외가 발생되면 더 이상 try 블록을 실행하지 않고 해당 예외의 catch 블록을 실행한다.
		try {
																																																																																																																																																																																																																																																																																																							bookList[count++] = book;  // 이 코딩의 플로우를 보면 위 addbook함수 인자로 book1 데이터가 들어오면 좌측 bookList[count++] = book; 에서 book; 안에 book1 데이터가 들어가고 bookList[count++] = bookList[0] = book1 이 되므로 배열 0번째 위치에 book1의 데이터가 들어간다 그리고나서!! count++ 에 의해 count값이 0에서 1로 바뀌는 것이다. 따라서 count 값은 배열에 저장되는 데이터의 개수로 볼 수 있는 것이다.  
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열이 가득차서 " + book.getAuthor() + "의 책을 추가할 수 없습니다.");
		} catch (Exception e) {
//			Exception 클래스는 예외의 최상위 클래스로서 모든 예외를 감지할 수 있다.
//			catch 블록에 Exception을 적을 경우 반드시 맨 마지막 catch 블록에 적어야 한다.			
//			System.out.println("배열이 가득차서 " + book.getAuthor() + "의 책을 추가할 수 없습니다.");
//			printStackTrace() : 발생된 예외 이름과 예외가 발생된 문장을 발생 순서의 역순으로 추적한다.
// 			어떤 클래스 파일에 몇번째 줄에서 어떠어떠한 Exception이 발생됬다.그리고 이 줄은 어떤어떤 클래스의 또 어떠어떠한 줄에 의해서 생겼다. 이럴거를 추적할때 사용한다. 			
			e.printStackTrace();  // 이 e라고 하는 변수에는 catch (ArrayIndexOutOfBoundsException e) { or catch (Exception e) { 여기서 잡아낸 예외 정보가 들어가게 된다.  
		} finally {
//			finally 블록은 선택 사항으로서 예외 발생 여부와 관계 없이 무조건 실행해야 할 문장이 있으면 적는다.
			System.out.println("까꿍~~~~");
		}
	}
	
}	











































