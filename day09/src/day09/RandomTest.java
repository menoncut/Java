package day09;

import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args) {
		
		for(int i=1 ; i<=10 ; i++) {
		    System.out.println((int)(Math.random() * 45)+1);
		}
		System.out.println("----------------------------");
		    
		Random random = new Random();
		for(int i=1 ; i<=6 ; i++) {
     		System.out.println(random.nextInt(45)+1);  //  로또 번호 추출(숫자들이 중복 되서 나오는 문제점이 있다)
		}
		
	}
	
}
