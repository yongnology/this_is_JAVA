package sec08.exam02_return;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas ==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("Run (gas잔량 : "+gas+")");
				gas -=1;
			} else {
				System.out.println("Stop (gas잔량 : " + gas+")");
				return;	// 메소드 실행 종료
			}
		}
	}
}
