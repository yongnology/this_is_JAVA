package sec03.exam04_operation;
// ����Ŀ��� �ڵ� Ÿ�� ��ȯ
public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;	// ������ ����
		// �÷��� ������ int �����ڷ� �����ؾ� �Ѵ�.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2;	// ������ ����
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ� = " + intValue2);
		System.out.println("��¹��� = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;	// ������� ������(int)�̹Ƿ� �� 2�� ��µȴ�.
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10/4.0;	// ������ ����
		// 4.0���� ������� �Ǽ������� double�� �ؾ��Ѵ�.
		double doubleValue = intValue5/4.0; 	// intValue5�� �ڵ� ����ȯ�� �̷�����.
		System.out.println(doubleValue);
	}

}

/* ��°�
30
�����ڵ� = 66
��¹��� = B
2
2.5
*/
