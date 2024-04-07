package day20;

import java.util.Scanner;

public class SnailTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 차수를 홀수로 입력하세요 : ");
		int n = sc.nextInt();
		
		int[][] a = new int[n][n];
//		count : 1에서 25까지 증가하는 변수, i : 행, j : 열, sw : 부호 변경, k : 반복횟수		
		int count = 0, i = 0, j = -1, sw = 1, k = n;
		
		while(true) {
			
//			행 방향 채우기
			for(int p=0 ; p<k ; p++) {
				j += sw;
				a[i][j] = ++count;
			}
			
//			k--;
			if(--k == 0 ) {     // 5 44 33 22 11  달팽이 처럼 돌며 좌측숫자 만큼 숫자가 1부터 25까지 채워진다.
				break;
			}
			
//			열 방향 채우기			
			for(int p=0 ; p<k ; p++) {
				i += sw;
				a[i][j] = ++count;
			}
			
			sw *= -1;
		}
		
		for(i=0 ; i<n ; i++) {       // 위에 i, j 를 이미 선언했기 때문에 int 자료형 생략.
			for(j=0 ; j<n ; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
	
	
}















































