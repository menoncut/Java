package day05;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("3과목 점수를 입력하세요 : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		int total = java + jsp + spring;
		double average = (double) total / 3;
//		double average = total / 3.;        위와 같이 캐스트 연산자를 이용하거나 좌측과 같이 3. 을 해주어 실수형으로 형변환시키면 된다.   
		
//		System.out.println("평균 점수 : " + average);   좌측과 같이 해주거나 소수점이 너무 많이 나와서 싫다면 아래와 같이 해준다.
		System.out.printf("평균 점수 : %6.2f\n", average);
		
		if(average >= 90) {
			System.out.println("수");
		} else if(average >=80) {
			System.out.println("우");
		} else if(average >=70) {
			System.out.println("미");
		} else if(average >=60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
				
	}
		
}







































