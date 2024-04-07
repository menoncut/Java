package day24;

public class MemoTest {
	
	public static void main(String[] args) {
		
		MemoVO vo1 = new MemoVO();   // new 뒤에 MemoVO();(<= 생성자 함수 실행하라는 뜻.)가 바로 생성자이다. 따라서 MemoVO 클래스의 기본 생성자 메소드값이 출력된다.
		MemoVO vo2 = new MemoVO("홍길동", true, "1등 입니다.");
		
		System.out.println(vo1);              // 객체는 우리가 매우 자주 출력하는 것이라서 좌측처럼 vo1이라고만 써도 아래 vo2.toString()처럼 toString() 메소드가 있는 것으로 자동으로 간주를 해준다.   
		System.out.println(vo2.toString());   // toString() 메소드는 어떤 객체 안에 들어있는 내용을 출력할 때 쓰는 메소드이다.
		
		MemoVO vo3 = new MemoVO("성춘향", false, "이쁜이에요");
		System.out.println(vo3);
		
//		vo2.count = 100;
		System.out.println(vo3.count);   // 이렇게 vo3 성춘향의 count를 출력하면 정상적으로 3이 출력되지만 바로 위처럼 vo2 객체 count에 100을 집어넣고 다시 출력해보면 100이 나오는데 그 이유는 count변수는 현재 static 정적 멤버 변수 이기때문에 클래스내 모든 객체에 공유되기 때문이다.		
		
//		System.out.println(vo2.name);   // name은 private 권한이 가지는 멤버이므로 에러가 발생된다.
		
		System.out.println(vo2.getName());   // getter 메소드를 작성후 getname으로 가져오자 private 권한임에도 불구하고 name을 가져올수 있는 것을 확인할 수 있다. 
		vo2.setName("임꺽정");                // set : 바꾸다 
		System.out.println(vo2.getName());  // 바꾼 이름인 임꺽정으로 출력되는 것을 확인할 수 있다.
		
		
	}

  
	
}



































































