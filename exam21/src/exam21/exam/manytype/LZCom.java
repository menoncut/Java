package exam21.exam.manytype;

public class LZCom implements Computer {

	@Override
	public void powerOn() {
		System.out.println("사랑해요 LZ!");
		System.out.println("전원이 켜집니다!");
	}

	@Override
	public void powerOff() {
		System.out.println("사랑해요 LZ!");
		System.out.println("전원이 꺼집니다!");
	}

}
