package sec11.exam01_final;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "���");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa";	// final �ʵ�� �� ���� �Ұ�
		
		p1.name= "��������";	// �ν��Ͻ� �ʵ�� ���� ����
		System.out.println(p1.name);
	}
}
// ��°�
/*
Korea
123456-1234567
���
��������
*/
