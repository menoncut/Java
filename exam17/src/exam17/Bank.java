package exam17;

public class Bank {
	private int money;
	
	//입금
	public void setMoney(int money) {
		if(money < 0) {
			System.out.println("값이 잘못입력되었습니다.");
			return; //일찍 종료...
		}
		this.money = money;
	}
	
	//돈 출력
	public int getMoney() {
		return money;
	}
}




















