package exam16;

import java.util.Scanner;

public class MathMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("넓이를 구할 원의 반지름 : ");
		int ban = sc.nextInt();
		
		double result = (ban*ban) * MathCalc.pi;
		
		MathCalc.print(result);
		
		sc.close();
	}

}
