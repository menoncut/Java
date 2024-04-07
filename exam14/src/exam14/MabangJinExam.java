package exam14;

import java.util.Arrays;

public class MabangJinExam {

	public static void main(String[] args) {
		int [][] mabangjin = new int[5][5];
		
		int row = 0; //행의 위치
		int col = 2; //열의 위치
		
		//마방진 시작위치 설정
		mabangjin[row][col] = 1;
		
		for(int i = 2; i <= 25; i++) {
			//위치 이동 - 오른쪽 대각선 위
			row--;
			col++;
			
			//1. row가 벗어난다면?
			if(row < 0 && col < 5) {
				//해당 열의 마지막 행
				row = 4;
			}
			
			//2. col이 벗어난다면?
			if(row >= 0 && col > 4) {
				//해당 행의 마지막 행
				col = 0;
			}
			
			//3. row, col 둘다 벗어났을 경우
			if(row < 0 && col > 4) {
				//행이 2칸 밑으로, 열이 1칸 뒤로
				row += 2;
				col--;
			}
			
			//4. 이동 위치에 값이 이미 있는 경우
			if(mabangjin[row][col] != 0) {
				//행이 2칸 밑으로, 열이 1칸 뒤로
				row += 2;
				col--;
			}
			
			mabangjin[row][col] = i;			
		}
		
		for(int i = 0; i < mabangjin.length; i++) {
			System.out.println(Arrays.toString(mabangjin[i]));
		}
	}
}





















