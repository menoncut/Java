package day21;

import java.util.Scanner;

public class MagicSquareTest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		while(true) {
			System.out.print("배열의 차수를 홀수로 입력하세요 : ");
			n = sc.nextInt();
			if(n % 2 == 1) {
			break;
			}
			System.out.println("홀수를 입력하라니까는~~~~~ 콱~~~~~");
		}
		
//		입력받은 배열의 차수만큼 배열을 선언한다.		
		int[][] data = new int[n][n];   // 5행 5열 짜리 마방진.
//		마방진의 첫 번째 숫자(1)가 채워지는 자리는 첫 줄 가운데 열 이다.
//		숫자가 채워질 첫 번째 위치(첫 줄 가운데)를 계산한다.		
		int i = 0, j = (n -1) / 2;   // 첫 줄 가운데 위치를 잡아준다.
		
//		Math.pow(x, y) : x의 y승을 계산한다.
		for(int k = 1; k<=Math.pow(n, 2) ; k++) {
			
			data[i][j] = k;
//		방금 배열에 채운 숫자(k)가 5의 배수면 다음 숫자가 채워질 위치는 행만 1 증가 시킨다.
//		5의 배수가 아니면 다음 숫자가 채워질 위치는 오른쪽, 위 방향(행은 -1, 열은 +1)으로 변경한다.
			if(k % n == 0) {
				i++;
			} else {
//				i--;
				if(--i < 0) {
//					행이 배열의 범위를 벗어나면 마지막 행으로 변경한다.
					i = n - 1;
				}
//				j++;
				if(++j == n) {
//					열이 배열의 범위를 벗어나면 첫 번째(0) 열로 변경한다.
					j = 0;
				}
			}
			
		}
		
		
		
		
		for(i=0 ; i<n ; i++) {
			for(j=0 ; j<n ; j++) {
				System.out.printf("%3d ", data[i][j]);
			}
			System.out.println();
		}
	}
	
}

















































