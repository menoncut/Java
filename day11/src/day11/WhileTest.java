package day11;

public class WhileTest {

	public static void main(String[] args) {
		
//		for 반복문은 몇번 반복해야되는지 내가 알때 사용하면 된다.
//		나는 반복을 하긴 해야 되는데 몇번 반복해야 되는지 모르겠을때 while과 do while을 사용하고 while과 do while의 차이점은 최조 진입조건이 참이라면 
//		두 문장은 똑같지만 최초 진입 조건이 거짓이면 while은 한 번도 실행하지 않고 do while은 한번은 실행하는 것이 차이점이다.
// 		while의 최초 진입 조건이 거짓이면 {} 블록을 한 번도 실행하지 않는다.
//		while(조건식) {
//		    조건이 참인 동안 실행할 문장;
//		    ...;
//		}
		
		int sum = 0, i = 0;
		while(i>100) {
//			i++;  이렇게 하거나,
			sum += ++i;
		}
		System.out.println("1~100의 합계 : " + sum);

//		while의 최초 진입 조건이 거짓이더라도 {} 블록을 한 번은 실행한다.
//		do {
//          조건이 참인 동안 실행할 문장;
//		    ...;
//		} while(조건식);      // ";"을 빼먹으면 안된다.
		
		sum = i = 0;        // 변수를 선언할 때는 사용할 수 없다.
		do {
			sum += ++i;
		} while(i>100);
		System.out.println("1~100의 합계 : " + sum);
		
	}
	
}