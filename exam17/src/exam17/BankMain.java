package exam17;

public class BankMain {

	public static void main(String[] args) {
		Bank b = new Bank();
		
		b.setMoney(-500);
		b.setMoney(10000);
		
		System.out.println("잔금 : " + b.getMoney());
		
	}
}
