package day29;
// 부모(상위, 슈퍼, 기반) 클래스
public class Parent {

	/*
	private String name;
	private boolean gender;
	*/
	protected String name;     // protected 권한은 부모 클래스와 그 부모 클래스를 상속받은 자식 클래스에서 자유롭게 접근할 수 있다.
	protected boolean gender;
	
	public Parent() {
		this("무명씨", false);
	}
	public Parent(String name, boolean gender) {
 		this.name = name;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return name + "(" + (gender ? "남" : "여") + ")";
	}
	
	
	
	
}


























































