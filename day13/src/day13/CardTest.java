package day13;

import java.util.Random;

public class CardTest {

	public static void main(String[] args) {
		
		String number[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
//		char symbol[] = {'♠', '◇', '♥', '♧'};
		String symbol[] = {"♠", "◇", "♥", "♧"};
//		스페이드, 다이아, 하트, 클로버를 만들때 C, C++은 무조건 문자열로 만들어야 하지만 자바는 Char의 크기가 유니코드를 쓰기 때문에 크기가 2byte이다. 그래서 문자, 문자열 모두 가능하다.		
		int card[] = new int[52];
		for(int i=0 ; i<card.length ; i++) {
			card[i] = i;
		}
		for(int i=0 ; i<card.length ; i++) {
//			System.out.printf("%2s ", number[card[i] % 13]);  // 이건 숫자만 표기한 것.   
//			System.out.printf("%s ", symbol[card[i] / 13]);  // 이건 무늬만 표기한 것.
			System.out.printf("%s%2s ", symbol[card[i] / 13], number[card[i] % 13]);
//			System.out.printf("%2s ", number[card[i]]);  // number 배열의 수가 12까지이므로 이렇게 하면 첫 줄은 12까지이므로 잘 나오지만
// 그 다음줄 13부터는 오류가 발생된다. 따라서, 위와 같이 13으로 나눈 나머지가 출력되게 하면 모두 첫 줄과 같이 출력되므로 오류가 없다.card[i]값 자체가 바뀐것은 아니다. 이제 number[card[i] % 13]; 을 해주면 A~K까지 카드번호가 출력된다.														 
//			System.out.printf("%d ", card.length);
			if((i+1) % 13 == 0) {      // 카드 무늬 하나당 카드가 13장씩 있으므로 13으로 나누어 줄바꿈 해주었다.
				System.out.println();  // 카드순서 : A 2 3 4 5 6 7 8 9 10 J Q K (10은 두자리이므로 문자' '가 아닌 " "문자열로 봐야한다.
			}
		}
		System.out.println("=========================섞기전================================");
		
		Random random = new Random();
		for(int i=0 ; i<100000 ; i++) {
			int r = random.nextInt(51) + 1;  //51이라고 입력하면 컴퓨터는 0~50으로 인식하는데 우리가 필요한 숫자는 1~51이므로 +1을 해준다. 이렇게 해주지 않으면 맨 마지막 51번째인 클로버k 가 섞이지 않게된다.
			int temp = card[0];
			card[0] = card[r];
			card[r] = temp;
		}
		for(int i=0 ; i<card.length ; i++) {
			System.out.printf("%s%2s ", symbol[card[i] / 13], number[card[i] % 13]);
			if((i+1) % 13 == 0) {      
				System.out.println();  
			}
		}
		System.out.println("=========================섞은후================================");
		
	}
	
}