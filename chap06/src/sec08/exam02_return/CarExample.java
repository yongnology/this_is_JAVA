package sec08.exam02_return;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);	// Car�� setGas() �޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		
		if(myCar.isLeftGas() ) {
			System.out.println("gas�� ������ �ʿ䰡 �ֽ��ϴ�.");
		} else {
			System.out.println("gas�� �־��ּ���");
		}
	}
}
// ��°�
/*
gas�� �ֽ��ϴ�.
����մϴ�.
Run (gas�ܷ� : 5)
Run (gas�ܷ� : 4)
Run (gas�ܷ� : 3)
Run (gas�ܷ� : 2)
Run (gas�ܷ� : 1)
Stop (gas�ܷ� : 0)
gas�� �����ϴ�.
gas�� �־��ּ���
*/