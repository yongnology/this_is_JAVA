package sec07.exam04_other_constructor_call;

public class Car {
	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������
	Car() {
		
	}
	Car(String model) {
		this(model, "����", 250);
	}
	Car(String model, String color) {
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed) {
		// ���� ���� �ڵ�
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
