package sec03.exam01_sign;
// ��ȣ ������
public class SignOperationExample{

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1);
		System.out.println(result2);
		
		short s = 100;
		// short result3 = -s; ������ ����. int Ÿ���� �ؾ��Ѵ�.
		int result3 = -s;
		System.out.println("result3 : "+result3);
	}

}
/* ��°�
-100
100
result3 : -100
*/

// -1�� ���ϴ� �͵� int Ÿ���̴�.