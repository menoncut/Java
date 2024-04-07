package exam20.override;

public class SamSong extends Computer {
	
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("헬로우!! 삼송!!");
		System.out.println("컴퓨터가 실행됩니다.");
	}
	
	@Override
	public void powerOff() {
		super.powerOff();
		System.out.println("굿바이!! 삼송!!");
		System.out.println("컴퓨터가 종료됩니다.");		
	}
}































