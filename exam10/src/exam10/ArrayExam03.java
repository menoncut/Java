package exam10;

import java.util.Arrays;

public class ArrayExam03 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		//배열에 값을 부여
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		//버블 정렬
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < (arr.length - 1) - i; j++) {
				//오름차순(버블정렬)은 현재위치보다 다음위치 값이 커야하는데
				//현재 위치값이 크다면 앞뒤를 변경한다!
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("정렬 후 : " + Arrays.toString(arr));
	}
}
