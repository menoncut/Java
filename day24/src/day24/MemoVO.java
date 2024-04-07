package day24;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemoVO {

// 멤버 변수의 종류는 정적(static) 멤버 변수와 인스턴스 멤버 변수가 있는데 인스턴스 멤버 변수는 현재 클래스로 생성되는 모든 객체에서
// 독립된 기억 공간을 가지지만 정적 멤버 변수는 현재 클래스로 생성되는 모든 객체에서 공유해서 사용한다.	
	public static int count;   //static이 앞에 붙으면 정적 멤버 변수라고 한다.
	private int no;             //멤버 변수                                                             // 객체가 생성될 때 마다 자동으로 1씩 증가
	private String name;        //string은 자료형이 아닌 클래스이기 때문에 여기서 name은 변수가 아닌 객체이다.
	private boolean gender;     //멤버 변수
	private String memo;        //string은 자료형이 아닌 클래스이기 때문에 여기서 memo는 변수가 아닌 객체이다.
	private Date writeDate;     //Date는 자료형이 아닌 클래스이기 때문에 여기서 writeDate는 변수가 아닌 객체이다.    // 객체가 생성되는 순간의 날짜와 시간
		
// 생성자 메소드(이하 생성자)
// 생성자 이름은 반드시 클래스 이름과 같아야 한다.
// 생성자는 return을 가지지 않는다. return을 가지지 않는 메소드는 리턴타입에 "void"를 입력하는데 생성자는 리턴 타입을 쓰지 않는다.
// 생성자를 선언하지 않으면 자바 컴파일러가 아무런 일도 하지 않는 기본 생성자를 만들어 준다. 하지만 사용자가 생성자를 선언하면 기본 생성자는
// 자동으로 생성되지 않는다.
// 생성자는 객체가 생성될 때 자동으로 실행되며 멤버 변수를 초기화 시키는 목적으로 사용된다.(ex. money = defaultmoney;)
// public MemoVO() {      // 기본 생성자이다.(컴파일러가 자동으로 만들어주는)
//	   
// }
   public MemoVO() {      // 기본 생성자는 직접 입력하는 것보다 기본 생성자를 만들 자리에 커서를 두고 Ctrl + 스페이스바를 누르면 컨스트럭터가 나온다.
//	   System.out.println("기본 생성자가 실행됩니다.");
//	   name = "무명씨";
//	   gender = false;
//	   memo = "없음";	
	   
	   this("무명씨", false, "없음");       // 생성자 MemoVO(String name, boolean gender, String memo)를 실행한다.
   }
/*   public MemoVO(String name, boolean gender, String memo) {  // 좌측의 생성자 메소드의 인수로 사용된 변수들은 상단의 멤버 변수들과 변수명이 같긴 하지만 멤버 변수가 아닌 지역 변수라고 하며 이 지역 변수는 자기가 선언된 중가로 블록 안에서만 사용을 할 수가 있다.(위 멤버 변수와는 별개로 이 생성자 함수 안에서 새롭게 선언된 완전히 별개의 변수이다.)  
// 이와는 다르게 멤버 변수는 클래스 전체에서 사용이 가능하다. 하지만 여기서 주목할점은, 이 생성자 함수 중가로 블럭안에서 지역 변수만 사용할 수 있는 것이 아니라 멤버 변수도 동시에 같이 사용이 가능하기 때문에 헷갈릴 요지가 있다.
// 그래서 자바는 이런 규칙을 정해놓았다. 같은 {} 블록에 같은 이름을 가지는 지역 변수와 멤버 변수가 있을 경우 지역 변수에 우선권을 준다. 그런데 우리는 지역 변수로 넘어온 데이터를 멤버 변수에 집어넣어 줘야 한다.
	   this.name = name;        // 여기서 this는 이 MemoVO 클래스를 지칭하고, 그 다음 변수는 멤버 변수이고 = 다음 변수는 지역 변수이다. 
	   this.gender = gender;
	   this.memo = memo;
   }*/                          // 지금은 멤버 변수가 3개이지만 변수갯수가 더 늘어나면 이렇게 일일히 적어주기 힘드므로..

   	public MemoVO(String name, boolean gender, String memo) {
//		super();  <== 부모 클래스의 생성자를 의미한다. 생략하면 super()를 컴파일러가 자동으로 넣어준다.
//		this() : 현재 클래스의 생성자를 의미한다.
//		super()와 this()는 반드시 생성자의 첫 줄에 코딩해야 한다.
//		super : 부모 클래스를 의미한다.
//		this : 현재 클래스를 의미한다.
   		no = ++count;           // 현재 이 생성자 함수가 한번 실행될 때마다 int 자료형 초기값 0이 들어가있는 count가 ++로 인해 1씩 증가하면서 no가 1부터 차례대로 증가하게 된다. 따라서 toString 메소드에 의해 객체에 저장되어있는 값을 출력할 때마다 출력하는 객체의 수에 맞춰 1씩 증가하게 된다.  
   		this.name = name;
   		this.gender = gender;																																		
   		this.memo = memo;
   		writeDate = new Date();
   	}                          // 생성자를 만들고 싶은 위치에 커서를 두고 우클릭 후 Source - generate constructor using fields 를 통해 이렇게 자동으로 만들수 있다.

   	
// private 권한으로 설정된 멤버 변수는 클래스 외부에서 접근할 수 없다.
// 이 규칙이 너무 엄격히 적용되므로 이 규칙에 대한 예외 지정을 getter & setter 메소드를 사용해서 한다.
// getter는 private 권한을 가지는 멤버 변수의 값을 얻어올 때 사용한다.
// setter는 private 권한을 가지는 멤버 변수의 값을 수정할 때 사용한다.

//==========아래 첫번째 메소드가 getter, 그 아래 메소드가 setter인데 멤버 변수 1개당 getter, setter 모두 작성해야하기 때문에 멤버 1개당 6줄의 코딩을 작성해야 하는 번거로움이 있다.
//따라서, 우클릭 - Source - generate getter and setters 를 실행하면 아래처럼 자동으로 작성된다.=============
   	
/*   	
   public String getName() {           // getter 메소드
	   return name;	   
   }
   public void setName(String name) {  // setter 메소드
	   this.name = name;
   }
*/  

   	public int getNo() {
   		return no;
   	}
   	
   	public void setNo(int no) {
   		this.no = no;
   	}
   	
   	public String getName() {
   		return name;
   	}
   	
   	public void setName(String name) {
   		this.name = name;
   	}
   	
   	public boolean isGender() {             // 자료형이 boolean일 경우에는 get대신 is로 나온다.
   		return gender;
   	}
   	
   	public void setGender(boolean gender) {
   		this.gender = gender;
   	}
   	
   	public String getMemo() {
   		return memo;
   	}
   	
   	public void setMemo(String memo) {
   		this.memo = memo;
   	}
   	
   	public Date getWriteDate() {
   		return writeDate;
   	}
   	
   	public void setWriteDate(Date writeDate) {
   		this.writeDate = writeDate;
   	}

   	
   	
   	
// 객체에 저장된 내용을 출력해야 한다면 toString() 메소드를 override(재정의) 한다.
/*	@Override
	public String toString() {           // 우클릭 - Source - generate toString() 으로 자동 생성 가능.
		return "MemoVO [name=" + name + ", gender=" + gender + ", memo=" + memo + "]";

	}*/
   	
   	@Override
   	public String toString() {
   		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss.SSS");
// MM 대신 mm 을 입력하면 현재 몇분인지가 출력된다. E : 요일, H : 시간(24시각제), h : 시간(12시각제), s : 초, S : 초(1/1000), a : am/pm
// sdf도 객체이고 writeDate도 객체인데 sdf.format(writeDate) <= 이렇게 하면 writeDate 객체가 가지고 있는 기능인 Date() 생성자 메소드의 출력값을 sdf 객체가 가지고 있는 기능인 SimpleDateFormat 메소드 서식(("yyyy.MM.dd(E)"))으로 바꿔서 출력한다.                        
   		return no + ". " + name + "(" + (gender ? "남" : "여") + ")님이 " + sdf.format(writeDate) + "에 남긴말 " + memo;
   	}
   	 
}






























































