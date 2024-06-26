package day08;

public class ForTest {

	public static void main(String[] args) {
		
//		반복 횟수가 몇 번인지 알 경우 for를 사용한다.
//		for가 실행되는 원리
//		1. 변수에 저장된 값으로 조건식을 실행해서 참이면 반복을 시작한다. 거짓이면 반복문을 실행하지 않는다.
//		2. {} 블록을 한 번 실행한 후 변수 값을 증감치 만큼 변경시키고 조건식을 실행해서 참이면 {} 블록을 반복하고 거짓이면 {} 블록을 탈출한다.
//		for(자료형 변수명=초기치 ; 조건식 ; 증감치) {
//		    조건식이 참인 경우 실행할 문장;
//		    ...;
//		}
		
//		변수를 선언만 하면 변수에 어떤 내용이 저장되어있는지 모르기 때문에 반드시 사용하기 전에 초기화를 시켜야 한다.
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
//			대입 연산자 : +=, -=, *=, /=, %=
//			sum에 저장된 값에 i에 저장된 값을 더해서 sum에 저장시켜라
			sum += i;     // sum = sum + i;와 같은 기능이 실행된다.
		}
		System.out.println("1~100의 합계 : " + sum);
		
//		증감 연산자(++ : 1증가, -- : 1감소)
//		++a : 변수 a에 저장된 값을 1증가 시키고 사용한다.
//		a++ : 변수 a에 저장된 값을 사용하고 1증가 시킨다. 현재 문장을 실행하고 ";"을 만나서 문장이 종료되는 순간 실행된다.
//		--a : 변수 a에 저장된 값을 1감소 시키고 사용한다.
//		a-- : 변수 a에 저장된 값을 사용하고 1감소 시킨다. 현재 문장을 실행하고 ";"을 만나서 문장이 종료되는 순간 실행된다.
		
		int a = 1, b, c;
		b = a++;
		c= ++a;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
//		() 안의 수식 => 산술 연산자(*, /, %) => 산술 연산자 => (+, -) => 관계 연산자 => 논리 연산자 => 대입 연산자
//		단항 연산자 => 이항 연산자 => 삼항 연산자
		
		int d = 1, e;
		e = ++d + ++d + ++d + ++d;
		System.out.println("d = " + d + ", e = " + e);
		
	}
	
}