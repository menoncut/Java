package exam18;

public class StudentMain {

	public static void main(String[] args) {
		Student st1 = new Student(); 
		Student st2 = new Student(17, "홍길동", "자바고등학교"); 
		
		st1.setAge(18);
		st1.setMyName("일지매");
		st1.setSchool("조선고등학교");
		
		System.out.println("이름 : " + st1.getMyName() + ", 나이 : " + st1.getAge() + ", 학교 : " + st1.getSchool());
		System.out.println("이름 : " + st2.getMyName() + ", 나이 : " + st2.getAge() + ", 학교 : " + st2.getSchool());
		
				
		
		
		
		
	}

}
