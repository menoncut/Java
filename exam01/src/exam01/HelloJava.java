package exam01;

class A{
	
}

class B{
	
}

public class HelloJava {  // main 클래스 : 파일의 이름과 동일해야 한다.

	public static void main(String[] args) {
		// 주석!
		/*
		 * 여러줄로
		 * 주석을 쓸 수 있습니다.
		 * */
		
		//정수형 타입 선언
		int num01 = 10;
		byte byNum = 20;		
		//실수
		double doubleNum = 30.311;
		float flNum = 33.12f;
		//문자
		char ch = 'A';
		//문자열
		String str = "날씨";
		//논리형
		boolean b = false;
			
		//문장이 끝나고 줄이 바뀌는 명령
		System.out.println(num01);
		System.out.println(byNum);
		System.out.print(doubleNum + "\n");
		System.out.println(ch);
		System.out.println(str);
		System.out.println(b);		
	}
}

























