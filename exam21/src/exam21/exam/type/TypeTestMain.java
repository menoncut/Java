package exam21.exam.type;

public class TypeTestMain {

	public static void main(String[] args) {

		Bus b = new Bus("버스");
		Taxi t1 = new Taxi("개인택시");
		
		//형변환
		Car car = t1;
		
		b.getInfo();
		t1.getInfo();
		
		//부모타입으로 형변환되면 자식클래스가 가진 기능이나 속성을 사용할 수 없다.
		//car.getInfo();
		
		Taxi t2 = (Taxi)car;
		
		t2.getInfo();
	}

}



































