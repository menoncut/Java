package exam13;

public class DoubleArrayExam01 {

	public static void main(String[] args) {
		//2차배열 선언
		int[][] arr = new int[3][5];
		//선언2
		int[][] arr01 = new int[3][];
		//선언3
		int[][] arr02 = {{1,2,3}, {4,5,6}};
		
		//출력
		System.out.println("2차 배열 : " + arr);
		System.out.println("2차 배열의 1차수 출력 : " + arr[1]);
		System.out.println("2차 배열의 1차수 출력 : " + arr[2]);
		System.out.println("2차 배열의 2차수 출력 : " + arr02[1][1]);
		
		//열을 쓰지 않고 선언했다면 추가해주어야 한다.
		for(int i = 0; i < arr01.length; i++) {
			arr01[i] = new int[3]; // arr01[0],arr01[1],arr01[2]행들 각각에 열을 3으로 추가해준것. 따라서, arr01[3][3] 형태로 됨.			
		}
	}

}























