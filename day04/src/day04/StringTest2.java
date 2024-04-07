package day04;

import java.util.Scanner;

public class StringTest2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
//		length() : 변수에 저장된 문자열을 구성하는 문자의 개수를 얻어온다.
		System.out.println("입력한 문자열의 크기 : " + str.length());
//		trim() : 문자열 앞, 뒤의 불필요한 공백을 제거한다.(사이에 있는 공백은 제거하지 못한다.)
		System.out.println("입력한 문자열에서 불필요한 공백을 제거한 문자열의 크기 : " + str.trim().length());
//		toUpperCase() : 영문자를 무조건 대문자로 변환한다.
		System.out.println("무조건 대문자로 출력 : " + str.toUpperCase());
//		toLowerCase() : 영문자를 무조건 소문자로 변환한다.
		System.out.println("무조건 소문자로 출력 : " + str.toLowerCase());
//		charAt(index) : 문자열에서 index 번째 문자 1문자를 얻어온다. 문자의 위치를 계산할 때 맨 앞의 문자 index가 0부터 시작된다.
		System.out.println("3번째 문자 : " + str.charAt(2));
		
		sc.close();
	}

}








































