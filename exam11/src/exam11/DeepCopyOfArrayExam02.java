package exam11;

public class DeepCopyOfArrayExam02 {
	public static void main(String[] args) {
		int[] cards = {1,6,9,8,2,7};
		int[] newCards = new int[6];
		
		//복사 메서드를 이용해서 깊은 복사 해봅시다.
		System.arraycopy(cards, 0, newCards, 0, newCards.length);
		
		cards[1] = 11;
		newCards[3] = 20;
		
		System.out.println("cards : ");
		for(int i = 0; i < cards.length; i++) {
			System.out.print(cards[i] + "\t");
		}
		
		System.out.println();
		
		System.out.println("newCards: ");
		for(int i = 0; i < newCards.length; i++) {
			System.out.print(newCards[i] + "\t");
		}
		
		
	}

}
