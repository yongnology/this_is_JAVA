package sec05.exam01_string_equals;
// ���ڿ� ��
public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "�̿��";
		String strVar2 = "�̿��";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		
		System.out.println();
		String strVar3 = new String("�̿��");
		String strVar4 = new String("�̿��");
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		if(strVar3.equals(strVar4) ) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
		
	}

}
/* ��°�
strVar1�� strVar2�� ������ ����
strVar1�� strVar2�� ���ڿ��� ����

strVar3�� strVar4�� ������ �ٸ�
strVar3�� strVar4�� ���ڿ��� ����
*/