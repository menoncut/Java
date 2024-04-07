package day18;

import java.util.Scanner;

// 달력을 출력하는 클래스
public class MyCalender {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달력을 출력할 년, 월 : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		
		System.out.println("============================");
		System.out.printf("        %4d년 %2d월\n", year, month);
		System.out.println("============================");
		System.out.println("  일  월   화  수   목  금   토 ");
		System.out.println("============================");
		
// 1일의 요일 만큼 반복하며 빈칸을 출력한다.
		for(int i=1 ; i<=MyCalen.weekDay(year, month, 1) ; i++) {
			System.out.print("    ");
		}
		
// 1일 부터 달력을 출력할 달의 마지막 날짜 만큼 반복하며 날짜를 출력한다.
		for(int i=1 ; i<=MyCalen.lastDay(year, month) ; i++) {
			System.out.printf(" %2d ", i);
// 출력한 날짜가 토요일이고 그 달의 마지막 날짜가 아니면 줄을 바꾼다.   // 2017년 09월처럼 토요일이면서 09월의 마지막 날짜인 경우 줄바꿈이 실행되면 아래 줄긋기 출력함수에서 날짜와 줄 사이에 공백이 발생하므로 토요일이면서 마지막 날짜가 아닐때만 줄 바꿈이 되도록 해준다.
			if(MyCalen.weekDay(year, month, i) == 6 && MyCalen.lastDay(year, month) != i) {
				System.out.println();
			}
		}
		System.out.println("\n============================");
	
	}
	
}
















































