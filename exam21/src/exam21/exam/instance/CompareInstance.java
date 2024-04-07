package exam21.exam.instance;

import exam21.exam.manytype.Computer;
import exam21.exam.manytype.LZCom;
import exam21.exam.manytype.SamsongCom;

public class CompareInstance {
	
	public static void getMyType(Computer com) {
		
		if(com instanceof SamsongCom) {
			System.out.println("삼송 컴퓨터");
		}else if(com instanceof LZCom) {
			System.out.println("LZ 컴퓨터");			
		}else {
			System.out.println("넌 누구니...");
		}
	}
	
	public static void main(String[] args) {
		
		SamsongCom sam = new SamsongCom();
		LZCom lz = new LZCom();
		
		CompareInstance.getMyType(sam);
		CompareInstance.getMyType(lz);
	}
}





































