package day16;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		
		MethodClass methodClass = new MethodClass();  // 우리는 현재 "MethodClass" 클래스에 1~100까지의 합계를 구하는 메소드인 total을 만들어 두었다.
// 그리고 그 값을 출력하는 실행 행위는 이 "MainClass" 클래스에서 하려고 한다. 따라서 MethodClass에 존재하는 메소드인 total을 가져와 사용해야 하는데 그러기 위해서 한번 이렇게 생각해보자
// 어떤 기능을 사용하려면 그 기능을 가지고 있는 제품이 필요하고 그 제품을 만들려면 그 제품의 설계도가 필요한데, "MethodClass" 클래스가 설계도이고 이 설계도로 만든 제품(객체)는
// methodClass이다. 그리고 이 methodClass 제품(객체)안에 total(메소드)이라는 기능이 있는 것이다. 따라서, 위와 같이 MethodClass(설계도) methodClass(제품) = new MethodClass();
// "MethodClass" 클래스의 설계도로 methodClass 제품(객체)을 만들어주는 코딩을 선언해주고, 그 다음에 아래와 같이 <methodClass.total()> => methodClass 제품(객체)안에 있는 total기능을 꺼내
// 사용하는 것이다.
// 정리하면, 우리가 어떤 함수(메소드)를 사용하려면 그 함수가 포함되있는 클래스의 객체를 반드시 만들어야 한다. 설계도만 있어서는 아무것도 안된다.		
		
		System.out.println("1~100의 합계 : " + methodClass.total());
		
		System.out.println("1~100의 합계 : " + MethodClass.total());  // 또 한가지 방법은, "MethodClass" 클래스에 접근 권한 지정자인 public 다음에 방금은 생략했었던 static을 추가해주면
// 정적(static) 메소드 의 설명과 같이 클래스 이름에 "."을 찍어서 total 메소드를 실행할 수 있다. 둘 모두 결과값이 똑같이 출력되는 것을 확인할 수 있다.
		
	}
	
}












































