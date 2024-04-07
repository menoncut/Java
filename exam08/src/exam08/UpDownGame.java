package exam08;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		int target = (int)(Math.random() * 50) + 1;
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		int user = 0;
		for(;;) {
			System.out.print("숫자를 입력! : ");
			user = sc.nextInt();
			
			if(target == user) {
				System.out.println("정답! 숫자는 " + user +" 입니다.!" + count + " 번만에 맞췄네요!");
				break;
			}else if(target > user) {
				System.out.println("업!");				
			}else if(target < user) {
				System.out.println("다운!");				
			}
			count++;			
		}
		sc.close();
	}
}
