package day09;

import java.util.Random;

//  주사위를 10번 굴렸을 때 얻어지는 눈의 개수
public class CountTest {

	public static void main(String[] args) {
		
		Random random = new Random();
//		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
//		배열이란 같은 이름으로 여러개의 기억장소를 만들어 사용 할 경우 쓴다.
//		배열을 선언하면 숫자는 0, 문자는 공백, boolean은 false, 클래스로 만든 배열은 null로 자동으로 초기화 된다.
//		배열의 위치를 지정하는 첨자(index)는 0부터 시작하는 것에 주의하자
//		자료형[] 배열명 = new 자료형[배열의 크기];          // 1차원 배열
		int[] count = new int[6];                   // ㅁㅁㅁㅁㅁㅁ  맨 첫번째 ㅁ : count[0], 맨 마지막 ㅁ : count[5] 이다.

		for(int i=1 ; i<=10 ; i++) {
			int r = random.nextInt(6) + 1;
			System.out.println(r);
			/*
			switch (r) {
			    case 1:	a++; break;
			    case 2:	b++; break;
			    case 3:	c++; break;
			    case 4:	d++; break;
			    case 5:	e++; break;
			    case 6:	f++; break;
			    case 1:	count[0]++; break;
			    case 2:	count[1]++; break;
			    case 3:	count[2]++; break;
			    case 4:	count[3]++; break;
			    case 5:	count[4]++; break;
			    case 6:	count[5]++; break;
            }
            */
			count[r - 1]++;
		   		
		}
		
		/*
		System.out.println("1의 개수 : " + a);
		System.out.println("2의 개수 : " + b);
		System.out.println("3의 개수 : " + c);
		System.out.println("4의 개수 : " + d);
		System.out.println("5의 개수 : " + e);
		System.out.println("6의 개수 : " + f);
		*/
//		System.out.println("1의 개수 : " + count[0]);
//		System.out.println("2의 개수 : " + count[1]);
//		System.out.println("3의 개수 : " + count[2]);
//		System.out.println("4의 개수 : " + count[3]);
//		System.out.println("5의 개수 : " + count[4]);
//		System.out.println("6의 개수 : " + count[5]);
//		배열명.length : 배열의 크기를 얻어온다.
		for(int i=0 ; i<count.length ; i++) {     // count[0]~count[5] 까지 6의 값이 count.length 의 결과값이다 => i<6
			System.out.println("1의 개수 : " + count[i]);       // 바로 윗쪽의(48~53행) println("1~6의 개수 : " + count[0~5]) 의 코딩과 같은 결과값을 출력한다.배열문을 반복문으로 코딩함.
		}
		
	} 
		
}







































