package exam16;

public class Student {
	static String school = "자바고등학교";
	
	String myName;
	int grade;
	
	void schoolnfo() {
		System.out.println("저는 " + this.myName + "이고 학교는 " + school + " 입니다.");
	}
}
