package kr.koreait.bookShop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// 책 한 권의 정보를 기억하는 클래스
public class BookVO {

	private String title;        // 도서명
	private String author;       // 저자명
	private String publisher;    // 출판사명
	private Date date;			 // 출판일
	private Double price;		 // 가격
	
	public BookVO() {
		
	}

	public BookVO(String title, String author, String publisher, Date date, Double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		
		date.setYear(date.getYear() - 1900);    // 이제 BookShop 클래스에서 정상적으로 2015로 출력되는 것을 확인할 수 있다.
		date.setMonth(date.getMonth() - 1);     // 이제 BookShop 클래스에서 정상적으로 5로 출력되는 것을 확인할 수 있다.
		this.date = date;
		
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
//		DecimalFormat 클래스는 숫자의 출력 서식을 지정한다.
//		#,##0의 의미는 천 단위마다 컴마를 찍어주라는 의미이므로 무조건 적어주고 별도로 필요한 내용을 #,##0의
//		앞, 뒤로 붙여주면 된다.		
//		DecimalFormat df = new DecimalFormat("#,##0");   // 숫자에 천 단위 컴마붙이는 클래스 메소드 
//		DecimalFormat df = new DecimalFormat("￦#,##0");   // 화폐 기호 표시.  
//		DecimalFormat df = new DecimalFormat("#,##0%");   // 백분율, 알아서 100을 곱한다.  
//		DecimalFormat df = new DecimalFormat("$#,##0.00");   // 소수점 아래 자리수를 출력하려면 "."을 찍고 필요한 만큼 0을 입력한다.  
		DecimalFormat df = new DecimalFormat("#,##0원");      
		return String.format("%s %s %s %s %s", title, author, publisher, sdf.format(date), df.format(price));
//		원래 price는 double 데이터타입 이기때문에 %.2f 로 형식지정자를 사용하는게 맞았지만 DecimalFormat 클래스를 적용하면서 df.format 에서
//		format() 메소드를 거쳐나오면, 숫자는 원래 원칙적으로 사이에 컴마가 못들어가므로 문자열로 바뀌게 된다. 따라서, %.2f -> %s 로 수정해주어야 한다. 
	}
	
	
	
}























































