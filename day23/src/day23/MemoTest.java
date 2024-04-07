package day23;

public class MemoTest {
	
	public static void main(String[] args) {
		
		MemoVO vo1 = new MemoVO();   // new 뒤에 MemoVO();(<= 생성자 함수 실행하라는 뜻.)가 바로 생성자이다. 따라서 MemoVO 클래스의 기본 생성자 메소드값이 출력된다.
		MemoVO vo2 = new MemoVO("홍길동", true, "1등 입니다.");
		
		System.out.println(vo1);              // 객체는 우리가 매우 자주 출력하는 것이라서 좌측처럼 vo1이라고만 써도 아래 vo2.toString()처럼 toString() 메소드가 있는 것으로 자동으로 간주를 해준다.   
		System.out.println(vo2.toString());   // toString() 메소드는 어떤 객체 안에 들어있는 내용을 출력할 때 쓰는 메소드이다.
		
		
		
		
		
	}

  
	
}



































































