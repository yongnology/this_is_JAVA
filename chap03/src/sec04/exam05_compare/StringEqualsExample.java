package sec04.exam05_compare;
// ���ڿ� ��
public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö");
		
		System.out.println( strVar1 == strVar2);	// �����ϴ� ��ü(����)�� ������
		System.out.println( strVar1 == strVar3);	// �����ϴ� ��ü(����)�� ������
		System.out.println();
		
		System.out.println( strVar1.equals(strVar2));	// ���ڿ��� ������
		System.out.println( strVar1.equals(strVar3));	// ���ڿ��� ������
	}

}
/* ��°�
true
false

true
true
*/