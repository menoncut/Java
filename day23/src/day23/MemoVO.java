package day23;

import java.util.Date;

public class MemoVO {

	private int no;             //멤버 변수    // 객체가 생성될 때 마다 자동으로 1씩 증가
	private String name;        //멤버 변수
	private boolean gender;     //멤버 변수
	private String memo;        //멤버 변수
	private Date writeDate;     //멤버 변수    // 객체가 생성되는 순간의 날짜와 시간
	
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
	   
	   this("무명씨",false, "없음");       // 생성자 MemoVO(String name, boolean gender, String memo)를 실행한다.
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
   		this.name = name;
   		this.gender = gender;
   		this.memo = memo;
   	}                          // 생성자를 만들고 싶은 위치에 커서를 두고 우클릭 후 Source - generate constructor using fields 를 통해 이렇게 자동으로 만들수 있다.

   	
// 객체에 저장된 내용을 출력해야 한다면 toString() 메소드를 override(재정의) 한다.
/*	@Override
	public String toString() {           // 우클릭 - Source - generate toString() 으로 자동 생성 가능.
		return "MemoVO [name=" + name + ", gender=" + gender + ", memo=" + memo + "]";

	}*/
   	
   	@Override
   	public String toString() {
   		return name + "(" + (gender ? "남" : "여") + ")이 남긴말 " + memo;
   	}
   	
	
	      
	
	
	
   
   
}






























































