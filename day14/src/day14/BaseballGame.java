package day14;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		
		int[] ball = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		Random random = new Random();
		for(int i=0 ; i<10000 ; i++) {
			int r = random.nextInt(9) + 1;  // 그냥 9라고 하면 0~8까지 숫자가 나오므로 우리가 필요한 숫자인 1~9가 나오도록 +1을 해준다
			int temp = ball[0];
			ball[0] = ball[r];
			ball[r] = temp;
		}
		
		System.out.print("레벨을 입력하세요 : ");
		Scanner sc = new Scanner(System.in); // 키보드로 입력을 받을려면 system.in을 입력해야 한다.
		int level = sc.nextInt();  // 입력함수. int 자료형으로 "level" 변수 선언과 동시에 입력함수 코딩.
		
		System.out.print("CPU : ");
		for(int i=0 ; i<level ; i++ ) {
			System.out.print(ball[i]);
		}
		System.out.println();
		
		sc.nextLine();         // 이 코딩에 의해 남아있는 키보드 버퍼가 비워지게 된다. 이제 레벨을 입력하면 USER : 가 한번만 나오게 된다.
//		맞출때까지 반복한다.
		int count = 0;
//		currentTimeMillis() : 1900년 1월 1일 부터 이 메소드가 실행되는 순간까지 지난 시간을 1/1000초 단위로 얻어온다.
		long start = System.currentTimeMillis();      // 게임 시작 시간
//		int s = 0, b = 0;      // 이렇게 s와 b를 반복문 바깥에 초기화하면 s값과 b값이 계속해서 누적되어 반복할때마다 더해서 출력된다.
		while(true) {
			System.out.print("USER : ");
			String user = sc.nextLine();  // 레벨을 입력하면 해당 입력정수만 윗쪽 변수 level의 nextInt로 입력되고 우리 눈에는 안보이는 키보드 버퍼는 남아있게 된다.
			count++;                      // 숫자를 한자리가 아닌 여러자리를 입력하므로 int가 아닌 string을 사용한다.
			
// 그래서 키보드 버퍼가 nextLine을 한번 거쳐서 입력되어(입력되고 소멸) USER : 가 표시되고 while반복문에 의해 다시 위로 올라가 반복이 시작되어 USER : 가 한번 더 나오게 된다.
// 따라서 위 nextInt와 nextLine 사이에 존재하는 키보드 버퍼를 비워주면 USER : 가 한번만 표시될 것이다.
// C나 C++은 아스키코드를 쓰고 자바는 유니코드를 쓰는데 어차피 영문자는 유니코드나 아스키코드나 똑같다.			
			
//			스트라이크와 볼의 개수를 센다.
//			스트라이크와 볼의 개수는 반복마다 다시 계산해야 하므로 반복문 안에서 초기화 시켜야 한다.
			int s = 0, b = 0;      // 이렇게 while반복문 안쪽에 초기화해야 USER : 값을 반복해서 입력할때마다 s와 b값이 누적되지 않고 새로이 계산된다.
			for(int i=0 ; i<level ; i++) {
//				스트라이크의 개수
				if(ball[i] == user.charAt(i) - 48) {   // 변수.charAt() : 변수에 저장된 데이터에서 ()안의 숫자(인덱스값)에 해당하는 위치의 글자를 출력한다.     
// 변수 ball은 int형이고 user는 string형이므로 컴퓨터가 출발점을 다르게 인식하므로 영점을 맞춰야 한다.
// 아스키코드표를 보면 문자값 '0' 은 10진수로 48이므로 int와 string이 서로 0값을 가진다고 할 때 string도 int와 같은 10진수로 놓고보면 48만큼 앞선 출발점을 가지고 있는것이다.
// 따라서 -48 또는 -'0'(문자 0은 10진수로 변환하면 48므로)을 해주어 서로 출발점이 같도록 영점을 맞춰줘야 정확한 계산이 된다.	
// 따라서 이제 레벨을 입력하고 출력되는 CPU값과 동일한 값을 USER에 그대로 입력해주면 자리수만큼 그대로 스트라이크로 나올것이다.(볼은 0볼) 					
					s++;
				}
//				indexOf() : 문자열에서 괄호 안의 문자나 문자열이 최초로 나타나는 위치(인덱스값=배열위치값)를 얻어온다. 없으면 -1을 리턴한다.
//				문자열에 특정한 문자 또는 문자열이 포함되어 있는가를 알 수 있다.(없으면 -1을 리턴해주므로)
//				System.out.println(user.indexOf(ball[i] + "")); // +""을 해주면 ball[i] 에서, 변수 ball 배열의 i번째 위치에 저장되있는 숫자를 문자열로 변환시켜준다.
				//이렇게 해야 indexOf()함수가 제대로 작동한다.
//				볼의 개수
				if(user.indexOf(ball[i] + "") >=0) {  // 배열 변수 ball의 i번째 배열 위치에 저장되있는 값을 string자료형 변수 user에 입력된 값중에서 찾아서 똑같은 자리는 아니더라도 어쨋든 일치하는 값이
// 있다면 그 일치하는 값에 해당하는 변수 user의 인덱스값(배열 위치)을 리턴해준다.					
					b++;
				}
			}
			
// 			맞췄으면 반복을 탈출한다.			
			if(s == level) {
				break;
			}
			System.out.println(s + " 스트라이크 " + (b - s) + " 볼");
			
		}
		long end = System.currentTimeMillis();      // 게임 종료 시간
		System.out.println((end - start) /1000. + "초 걸려서 " + count + "번 만에 맞췄다.");
	
	}
	
}