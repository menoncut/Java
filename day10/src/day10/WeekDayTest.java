package day10;

import java.util.Scanner;

public class WeekDayTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요일을 계산할 년, 월, 일 : ");
		int year = sc.nextInt();
		int month = sc.nextInt();		
		int day = sc.nextInt();
		
//		1년 1월 1일 부터 입력한 년도의 전년도 12월 31일 까지 지난 날짜를 계산한다.
		int sum = (year-1) * 365 + (year-1) / 4 - (year-1) / 100 + (year-1) / 400;        
//		윤년은 1년이 366일 이다. 윤년은 4년에 한번씩 오고, 100으로 나누어 떨어지는 해는 평년이며 400으로 나누어 떨어지는 해는 다시 윤년이므로 위와 같이 나누었을때 각각의 몫을 더하고 빼줘야 입력한 년도의
//		정확한 날짜 계산이 가능하다. 설명하자면, 4년에 한번씩 윤년이므로 4로 나눈 몫이 앞에서((year-1) * 365)놓친 366-365=1일을 더해주는것이고 근데 100으로 나누어 떨어지는 해와 4로 나누어 떨어지는 해가
//		중복되므로 100으로 나누어떨어지는 해의 몫을 빼주고(평년이므로) 100으로 나누어 떨어지는 해와 400으로 나누어 떨어지는 해가 중복되므로 400으로 나누어 떨어지는 해(윤년이므로)의 몫을 다시 더해준것이다.

//		전년도 12월 31일 까지 지난 날짜수에 올해 전달 까지 지난 날짜를 더한다.
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		m[1] = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;   // 왼쪽은 아래 스위치문 대신 int배열로 바꿔준 모습이다.
		for(int i=1 ; i<month ; i++) {    // 첫번째 케이스 - 31日까지 있는 月 : 1, 3, 5, 7, 8, 10, 12
			/*
			switch(i) {                   // 두번째 케이스 - 30日까지 있는 月 : 4, 6, 9, 11
			    case 2:                   // 세번째 케이스 - 28, 29日까지 있는 月 : 2
			    	sum += year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;    // day06 에서 설명한 삼항 연산자 계산식이다.
			    	break;
			    case 4: case 6: case 9: case 11:     // 짧은 月
			    	sum += 30;
			    	break;
			    default:                             // 긴 月
			    	sum += 31;
			    	break;
			}
			*/
			sum += m[i - 1];
		}

//		전달 까지 지난 날수에 일을 더한다.
		sum += day;
		System.out.println(sum % 7);  // 여기까지 계산된 sum값은, 입력한 해의 전년도 12.31일까지 (윤년의 일수도 포함되어)지난 날수 + 입력한 해의 입력한 월의 전월 까지(9월을 입력하면 8월까지)지난 날수가
		                          // (스위치 코딩에 의해)더해져 있는 상태이고 여기에 sum += day; 코딩에 의해 입력한 일(day)까지 더한 총 날수가 println함수에 의해 출력되는 것이다. 
// 우리가 현재 쓰는 그레고리안 캘린더는 서기 1년 1월 1일은 월요일이다 라고 시작한 달력이다. 따라서 7로 나눈 나머지가 0 = 일요일, 1 = 월요일, 2 = 화요일, 3 = 수요일, 4 = 목요일, 5 = 금요일, 6 = 토요일 이다.
		
// 1년 1월 1일 부터 입력한 날짜까지 지난 날짜의 합계를 7로 나눈 나머지에 따라 요일이 결정된다.(0이면 일요일, 1이면 월요일, 2이면 화요일, 3이면 수요일, 4-목, 5-금, 6-토)
// 아래와 같이 스위치로 해도 되지만, 배열로 하면 두 줄이면 끝난다.
		/*
		switch (sum % 7) {
		case 0:	System.out.println("일요일"); break;
		case 1:	System.out.println("월요일"); break;
		case 2:	System.out.println("화요일"); break;
		case 3:	System.out.println("수요일"); break;
		case 4:	System.out.println("목요일"); break;
		case 5:	System.out.println("금요일"); break;
		case 6:	System.out.println("토요일"); break;
		}
		*/
//		배열을 선언할 때 new를 사용하지 않고 {}안에 초기치를 지정하면 초기치의 개수만큼 자동으로 배열을 만들고 초기치로 초기화 시켜준다.
//		String[] week = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		char[] week = {'일','월','화','수','목','금','토'};        // 위와 같이 String(문자열 배열)으로 해도 되고 왼쪽과 같이 char(문자 배열)로 해도 된다.
		System.out.println(week[sum % 7] + "요일");
		
		
		sc.close();
		
	}

}