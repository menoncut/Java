package exam17;

public class PersonMain {

	public static void main(String[] args) {
		Person p01 = new Person();
		
		p01.setMyName("홍길동");
		p01.setAge(300);
		
		System.out.println("나는 " + p01.getMyName() + " 이고 나이는 " + p01.getAge() + " 살 이다." );
	}

}
