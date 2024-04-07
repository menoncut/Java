package day17;
// 달력을 출력하는 클래스
public class MyCalender {

	public static void main(String[] args) {
		
//		MyCalen calen = new MyCalen();
//		System.out.println(calen.isLeapYear(2017));  
		
		System.out.println(MyCalen.isLeapYear(2100) ? "윤년" : "평년");  // 바로 위 주석처리 한 코딩은 "MyCalen" 클래스에 static 을 입력하지 않을때 사용하고 
// static을 지금처럼 입력했을때는 이렇게 객체를 만들지 않고 바로 클래스.메소드 로 "MyCalen" 클래스에 있는 isLeapYear 메소드를 가져와 쓸 수 있다.
		System.out.println(MyCalen.lastDay(2016, 2));
		System.out.println(MyCalen.totalDay(2017, 10, 14));
	    System.out.println(MyCalen.weekDay(2017, 10, 14));	
	}
	
}
















































