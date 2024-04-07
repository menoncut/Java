package day29;
// 자식(하위, 서브, 파생) 클래스
// Parent 클래스를 상속받아 Child 클래스를 만든다.
public class Child extends Parent {   // 자식 클래스 extends 부모 클래스 -> 자식 클래스를 부모 클래스에 상속 시키는 법.

	
// Parent 클래스를 상속 받았으므로 Parent 클래스의 모든 멤버 변수와 메소드를 별도로 정의하지 않아도 사용할 수 있다.
// 부모 클래스의 private 권한을 가진 멤버는 상속은 받았지만 접근할 수 없다.
	private int age;
	private String nickName;
	
	public Child() { }
// 이제 문제는, 이곳 Child 클래스에서 선언한 age, nickName 뿐만이 아니라 부모 클래스로부터 상속받은 멤버도 이 자식 클래스의 생성자에서 초기화를 시켜야 하는데
// 자동 완성 기능(우클릭 - source - constructor using fields)을 사용해도 현재 클래스에서 직접 입력해 정의하지 않은 멤버는 보이지 않는다. 	
// 부모 클래스로 부터 상속받은 멤버 변수의 접근 권한이 private일 경우 부모 클래스의 생성자를 호출해서 초기화 시킨다.
	/*
	public Child(String name, boolean gender, int age, String nickName) { // 따라서, 부모 클래스의 멤버인 name과 gender은 수기로 입력해줘야 한다.
		super(name, gender);   // super() : 부모 클래스의 생성자를 호출한다. // 부모 클래스의 멤버인 name과 gender도 자식 클래스의 age와 nickName과 마찬가지로 this.name = name; 을 해주어
//		생성자 함수의 인자값이 멤버에 대입되도록 해주어야 하는데 name과 gender는 부모 클래스에서 접근 권한이 private로 되어있어서 this.을 찍었을때 리스트에 나타나지 않는다 그래서 부모 클래스를 호출하는 super()를 사용한다.    
		this.age = age;
		this.nickName = nickName;
	}
  	*/   // 이렇게 super()를 사용하는 방법이 하나 있고,
// 부모 클래스로 부터 상속받은 멤버 변수의 접근 권한이 private일 경우 부모 클래스에 setter 메소드가 작성되어 있다면
// setter 메소드를 사용해서 초기화 시킬수 있다.	
	/*
	public Child(String name, boolean gender, int age, String nickName) {
		setName(name);
		setGender(gender);
		this.age = age;
		this.nickName = nickName;
	}
	*/
	// 이렇게 setter 메소드를 사용하는 방법도 있다.
	
// 부모 클래스로 부터 상속받은 멤버의 접근 권한이 protected일 경우 자식 클래스에서는 자유롭게 접근할 수 있으므로
// 일반 멤버 변수를 초기화 시키듯이 this를 사용한 초기화가 가능하다.	
	public Child(String name, boolean gender, int age, String nickName) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nickName = nickName;
	}
		
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
//		return getName() + "(" + (isGender() ? "남" : "여") + ") - " + age + ", " + nickName;
		// 여기서도 마찬가지로 부모 클래스의 name과 gender는 private 접근 권한이어서 get으로 가져와야 하고 gender는 자료형이 
		// boolean이므로 is로 가져온다.
		// 부모 클래스로 부터 상속받은 멤버 변수의 접근 권한이 private이면 접근할 수 없으므로 getter 메소드를 사용해야 한다.
		
// 부모 클래스로 부터 상속받은 멤버의 접근 권한이 protected일 경우 자식 클래스에서는 자유롭게 접근할 수 있으므로
// getter 메소드를 사용하지 않아도 된다.		
		return name + "(" + (gender ? "남" : "여") + ") - " + age + ", " + nickName;
	}

}




























































































