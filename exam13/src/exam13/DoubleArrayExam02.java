package exam13;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleArrayExam02 {

	public static void main(String[] args) {
		int[][] std = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < std.length; i++) {
			System.out.println((i+1) + "번째 학생 국어점수 : ");
			std[i][0] = sc.nextInt();
			System.out.println((i+1) + "번째 학생 영어점수 : ");
			std[i][1] = sc.nextInt();
			System.out.println((i+1) + "번째 학생 수학점수 : ");
			std[i][2] = sc.nextInt();
		}
		
		//Arrays.toString(1차배열)
		for(int i = 0; i < std.length; i++) {
			System.out.println((i+1) + "번째 학생 : " + Arrays.toString(std[i]));
		}
		sc.close();
		
		//1등 뽑기!
		int maxIndex = 0;
		int sum = 0; //총점을 저장할 변수
		int maxSum = 0;
		
		for(int i = 0; i < std.length; i++) {
			sum = 0; //합산 초기화
			for(int j = 0; j < std[i].length; j++) {
				sum += std[i][j];
			}
			
			//합산이 끝난 후 비교
			if(maxSum < sum) {
				maxSum = sum;
				maxIndex = i;
			}
		}
		System.out.println("성적최 우수자 : " + (maxIndex+1) + "번 학생 : " + Arrays.toString(std[maxIndex]) + " 총점 : " + maxSum);
	}

}























