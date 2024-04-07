package exam08;

public class WhileTest01 {

	public static void main(String[] args) {
		int sum = 0;
		int count = 1;
		
		while(count <= 10) {
			sum = sum + count;
			//카운트를 증가
			count++;
		}
		System.out.println(sum);
	}
}
