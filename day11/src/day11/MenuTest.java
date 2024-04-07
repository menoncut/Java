package day11;

import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		
//		while(true) {
		while(menu != 5) {	
			
			do {
				System.out.println("===============================");
				System.out.println(" 1.저장 2.보기 3.수정 4.삭제 5.종료 ");
				System.out.println("===============================");
				System.out.print("원하는 메뉴를 선택하세요 : ");
				menu = sc.nextInt();               // 그래서 int만 빼고 사용해주면 된다.(중가로 블록 바깥에 새로 변수 선언을 해주고 난 다음에..)
	//			int menu = sc.nextInt();           // 좌측과 같이 중가로 블록 안에 변수 선언이 되어 아래쪽에 중가로 블록을 벗어난 menu변수에 에러가 난 것을 볼 수 있다.
			} while(menu < 1 || menu > 5);         // 현재 좌측 menu에 빨간줄이 그어지면서 에러가 난 것을 볼 수 있는데 그 이유는, 변수는 자기가 선언된 중가로 블록을 벗어나면 메모리에서 소멸되기 때문이다.
			                                       // 따라서 중가로 블록 바깥에 다시 변수 선언을 해주고 난 다음에 입력 함수에서 int만 빼주면 된다. 
	// 여기에 왔다는 것은 메뉴가 1~5 사이의 숫자가 입력되었다는 것이다.
			switch(menu) {
				case 1: System.out.println("입력"); break;
				case 2: System.out.println("보기"); break;
				case 3: System.out.println("수정"); break;
				case 4: System.out.println("삭제"); break;
				/*
				case 5: 
					System.out.println("바이바이");
					System.exit(0);           // 프로그램을 강제로 종료한다. (프로그램 강제종료는 그다지 권장되지 않는다.)
					break;
				*/
			}
		
		}
		
		System.out.println("바이바이");
		sc.close();
		
	}
		
}