package sec09.exam01_instance_member;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("������");
		Car yourCar = new Car("����");
		
		myCar.run();
		yourCar.run();
	}
}
// ��°�
/*
�������� �޸��ϴ�.(�ü�:10km/h)
�������� �޸��ϴ�.(�ü�:20km/h)
�������� �޸��ϴ�.(�ü�:30km/h)
�������� �޸��ϴ�.(�ü�:40km/h)
�������� �޸��ϴ�.(�ü�:50km/h)
������ �޸��ϴ�.(�ü�:10km/h)
������ �޸��ϴ�.(�ü�:20km/h)
������ �޸��ϴ�.(�ü�:30km/h)
������ �޸��ϴ�.(�ü�:40km/h)
������ �޸��ϴ�.(�ü�:50km/h)
*/
