package sec08.exam02_return;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas ==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("Run (gas�ܷ� : "+gas+")");
				gas -=1;
			} else {
				System.out.println("Stop (gas�ܷ� : " + gas+")");
				return;	// �޼ҵ� ���� ����
			}
		}
	}
}
