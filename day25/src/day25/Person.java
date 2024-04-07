package day25;

public class Person {
	
	private String name;   // 멤버 
	private int age;       // 멤버 
	
	public Person() {      // 기본 생성자
		this("무명씨", 0);   // 기본 생성자가 실행되면 this()에 의해 현재 클래스의 다른 생성자(인수 순서가 문자열, 정수 인 다른 생성자)를 호출한다.
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
	
	

}












































