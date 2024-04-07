package exam21.exam.manytype;

public class ComputerRoom {

	private Computer com1;
	private Computer com2;
	
	public Computer getCom1() {
		return com1;
	}
	public void setCom1(Computer com1) {
		this.com1 = com1;
	}
	public Computer getCom2() {
		return com2;
	}
	public void setCom2(Computer com2) {
		this.com2 = com2;
	}
	
	public void allPowerOn() {
		this.com1.powerOn();
		this.com2.powerOn();
	}
	
	public void allPowerOff() {
		this.com1.powerOff();
		this.com2.powerOff();
	}
}



























