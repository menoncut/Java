package day21;

public class MagicSquareTest {

	public static void main(String[] args) {
		
		int[][] data = new int[5][5];
//		마방진의 첫 번째 숫자(1)가 채워지는 자리는 첫 줄 가운데 열 이다.
		int i = 0, j = 2;   // 첫 줄 가운데 위치를 잡아준다.
		
//		Math.pow(x, y) : x의 y승을 계산한다.
		for(int k = 1; k<=Math.pow(5, 2) ; k++) {
			
			data[i][j] = k;
//		방금 배열에 채운 숫자(k)가 5의 배수면 다음 숫자가 채워질 위치는 행만 1 증가 시킨다.
//		5의 배수가 아니면 다음 숫자가 채워질 위치는 오른쪽, 위 방향(행은 -1, 열은 +1)으로 변경한다.
			if(k % 5 == 0) {
				i++;
			} else {
//				i--;
				if(--i < 0) {
//					행이 배열의 범위를 벗어나면 마지막 행으로 변경한다.
					i = 4;
				}
//				j++;
				if(++j == 5) {
//					열이 배열의 범위를 벗어나면 첫 번째(0) 열로 변경한다.
					j = 0;
				}
			}
			
		}
		
		
		
		
		for(i=0 ; i<5 ; i++) {
			for(j=0 ; j<5 ; j++) {
				System.out.printf("%2d ", data[i][j]);
			}
			System.out.println();
		}
	}
	
}

















































