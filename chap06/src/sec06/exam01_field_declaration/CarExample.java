package sec06.exam01_field_declaration;

public class CarExample {
	public static void main(String[] args) {
		// ��ü ����
		Car myCar = new Car();
		
		// �ʵ尪 �б�
		System.out.println("����ȸ�� : " + myCar.commpany);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
		System.out.println("���� �ӵ� : " + myCar.speed);
		
		// �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ� : " + myCar.speed);
	}
}

// ��°�
/*
����ȸ�� : ���� �ڵ���
�𵨸� : �׷���
���� : ����
�ְ�ӵ� : 350
���� �ӵ� : 0
������ �ӵ� : 60
*/