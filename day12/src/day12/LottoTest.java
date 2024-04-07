package day12;

import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		
//		추첨기를 준비한다.
		int[] lotto = new int[45];
//		추첨기에 공을 넣는다.
		for(int i=0 ; i<lotto.length ; i++) {
			lotto[i] = i + 1;
		}
		for(int i=0 ; i<lotto.length ; i++) {
			System.out.printf("%2d ", lotto[i]);
			if((i + 1) % 10 ==0) {
				System.out.println();
			}
		}
		System.out.println("\n=============섞기전==============");
		
//		추첨기의 공을 섞는다.
//		lotto[0]에 저장된 값과 lotto[1]~[44] 사이의 랜덤한 위치의 값을 교환한다.
		Random random = new Random();
		for(int i=0 ; i<8145060 ; i++) {
			int r = random.nextInt(44) + 1;  // (44)로만 하면 컴퓨터는 0~43 로 인식하므로 마지막 숫자 45가 섞이지 않는다
			int temp = lotto[0];             // 우리가 필요한 배열 자리는 교환하는 자리인 0을 제외한 1~44 번째 자리이므로 1을 더해준다.
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
		for(int i=0 ; i<lotto.length ; i++) {
			System.out.printf("%2d ", lotto[i]);
			if((i + 1) % 10 ==0) {
				System.out.println();
			}
		}
		System.out.println("\n=============섞은후==============");
		
		System.out.print("1등 번호 : ");
		for(int i=0 ; i<6 ; i++) {
			System.out.print(lotto[i] + " ");
			
//			sleep() : 괄호 안에 지정된 시간(1/1000초) 만큼 프로그램을 잠깐 멈춘다.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("보너스 : " + lotto[6]);
		
	}
	
}
