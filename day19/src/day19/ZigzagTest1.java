package day19;

public class ZigzagTest1 {

	public static void main(String[] args) {
		
		int[][] a = new int[4][5];     // 4행 5열짜리 2차원 배열이다.
		int count = 0;
		
		for(int i=0 ; i<4 ; i++) {     // 행
			
//  짝수행(0, 2 배열 위치(인덱스값))은 숫자가 왼쪽에서 오른쪽으로 채워지고 홀수행은 숫자가 오른쪽에서 왼쪽으로 채워진다.
			if(i % 2 == 0) {     // 짝수행 이면
				
				for(int j=0 ; j<5 ; j++) {    // 열 (왼쪽부터 오른쪽으로 숫자가 채워지려면 열이 0~5 순서로 바껴야 한다.)(왼쪽 => 오른쪽)
					a[i][j] = ++count;
				}
				
			} else {     // 홀수행 이면
				
				for(int j=4 ; j>=0 ; j--) {     // 열(오른쪽 => 왼쪽)
					a[i][j] = ++count;
					
				}
				
			}
			
		}
		
		for(int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();		
	    }
	}
}