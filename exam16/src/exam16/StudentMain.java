package exam16;

public class StudentMain {

	public static void main(String[] args) {
		Student st01 = new Student();
		Student st02 = new Student();
		
		st01.myName = "홍길동";
		st02.myName = "고길동";
		Student.school = "강남고등학교";
		st01.schoolnfo();
		System.out.println("나의 학교는 " + Student.school);
		st02.schoolnfo();
		
	}

}
