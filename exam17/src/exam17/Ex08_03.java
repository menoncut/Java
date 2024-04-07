package exam17;

public class Ex08_03 {

	public static void main(String[] args) {
		int money = 34000;
		int count = 0;
		while(true) {
			if(money < 1500) {
				System.out.println("버스를 " + count + "만큼 탔음.");
				System.out.println("버스카드 : " + money + " 남음!! 버스카드 충전요망!!");
				return;
			}
			
			money -= 1500;
			count++;
		}
	}
}
