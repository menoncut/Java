package day25;

import java.util.ArrayList;

public class ArrayListTest1 {
	
	public static void main(String[] args) {
		
//		배열은 한 번 선언하면 프로그램에서 크기를 변경할 수 없다.				
		int[] data = new int[10];

// 		데이터 개수가 항상 일정하다, 매번 거의 일정한 경우에는 배열을 사용하면 되겠지만, 유동성이 많은 데이터는 배열 대신 ArrayList를 사용하면 된다.
		
//		<E> : 제네릭이라 부르며 ArrayList에 저장할 자료형을 반드시 클래스로 적는다.
//		ArrayList에 저장할 자료가 기본 자료형이라면 기본 자료형을 클래스화 시켜놓은 랩퍼 클래스를 사용한다.
//		랩퍼 클래스는 기본 자료형의 첫 문자만 대문자로 적으면 되고 Character와 Integer는 풀네임을 사용한다.		
//		ArrayList list = new ArrayList();                       // JDK 1.4 이전의 코딩 방법
//		ArrayList<Integer> list = new ArrayList<Integer>();     // JDK 1.5 이후의 코딩 방법
		ArrayList<Integer> list = new ArrayList<>();            // JDK 1.7 이후의 코딩 방법
		
		for(int i=0 ; i<10 ; i++) {
			data[i] = i + 1;
			list.add(i + 1);
		}
		for(int i=0 ; i<10 ; i++) {
			System.out.println("data[" + i + "] = " + data[i] + ", list.get(" + i + ") = " + list.get(i));
		}
		
		for(int i=10 ; i<20 ; i++) {
//			data[i] = i + 1;
			list.add(i + 1);
		}
		for(int i=10 ; i<20 ; i++) {
//			System.out.println("data[" + i + "] = " + data[i]);
			System.out.println("list.get(" + i + ") = " + list.get(i)); 
		}
			
	}

}




























































