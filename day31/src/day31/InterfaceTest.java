package day31;

class Point {
	int x, y;
	public void move() { }
}
class Shape {
//	변수 앞에 final이 붙으면 그 변수는 프로그램에서 값을 변경할 수 없다.
//	프로그램에서 자주 사용하는 데이터는 변수에 저장시켜 사용하면 편리하고 프로그램에서 임의로 값을 변경할 수 없도록 상수로 만들어 사용한다.
	public static final double PI = 3.141592;    // 정적 멤버 변수, 상수
	public void draw() { }
	public void erase() { }	
}

// 자바는 다중 상속을 허용하지 않으므로 에러가 발생된다.
// class Line extends Point, Shape { }           // 에러 발생. 다중 상속 불가(부모 클래스를 다중으로 가질 수 없다.) 

// 인터페이스란 정적(static) 멤버 변수와 추상 메소드로만 구성된 클래스의 특별한 형태이다.
interface Draw {
	public static final double PI = 3.141592;   // 정적 멤버 변수, 상수
//	인터페이스는 멤버 변수 선언시 앞의 내용을 아래와 같이 생략해도 자동으로 public static final을 붙여준다.
	int LIMIT = 1000;
	public abstract void moveTo();               // 추상 메소드
//	인터페이스는 메소드 선언시에도 앞의 내용을 생략하면 자동으로 public abstract을 붙여준다.
	void erase();
}

interface Graphic {
	void rotate();
	void resize();	
}

// class Line extends Draw { }           // 클래스는 인터페이스를 상속받을 수 없으므로 에러가 발생된다.
// interface Graphics extends Point{ }   // 인터페이스는 클래스를 상속받을 수 없으므로 에러가 발생된다.
// 클래스는 클래스끼리 인터페이스는 인터페이스끼리 상속을 시켜야 한다.

interface Graphics extends Draw, Graphic {   // 인터페이스는 다중 상속을 허용한다.
//	아무런 내용도 가지지 않는 인터페이스를 표시(marker) 인터페이스라 부른다.
}

// 클래스 선언시 인터페이스에서 정의한 내용을 사용하려면 상속(extends)을 사용할 수 없고 구현(implements)을 사용한다.
// Line 클래스는 point 클래스를 상속받고 Draw 인터페이스와 Graphic 인터페이스를 구현해서 만든다.
class Line extends Point implements Draw, Graphic {

	@Override
	public void rotate() {
				
	}
	@Override
	public void resize() {
			
	}
	@Override
	public void erase() {
			
	}
	@Override
	public void moveTo() {
		 		
	}
	
}

public class InterfaceTest {
	
	public static void main(String[] args) {
		
		System.out.println(Shape.PI);
		System.out.println(Draw.PI);
		System.out.println(Draw.LIMIT);
				
	}
}







































































