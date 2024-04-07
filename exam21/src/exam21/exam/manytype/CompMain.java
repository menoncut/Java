package exam21.exam.manytype;

public class CompMain {

	public static void main(String[] args) {
		
		ComputerRoom room = new ComputerRoom();
		
		room.setCom1(new LZCom());
		room.setCom2(new SamsongCom());
		
		room.allPowerOn();
		room.allPowerOff();
	}

}







































