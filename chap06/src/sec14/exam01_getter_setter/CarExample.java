package sec14.exam01_getter_setter;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		// �߸��� �ӵ� ����
		myCar.setSpeed(-60);
		System.out.println("����ӵ� : " +myCar.getSpeed());
		
		// �ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		System.out.println("����ӵ� : " +myCar.getSpeed());
		
		// ����
		if(!myCar.isStop()) {
			myCar.setStop(true);			
		}
		
		System.out.println("����ӵ�: " + myCar.getSpeed());
	}
}

// ��°�
/*
0
false
*/
