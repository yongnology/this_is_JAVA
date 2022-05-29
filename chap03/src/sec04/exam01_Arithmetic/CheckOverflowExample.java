package sec04.exam01_Arithmetic;
// ��� ���� ���� �����÷ο� Ž��
public class CheckOverflowExample {

	public static void main(String[] args) {
		// ��� 1
		try {
			int result = sageAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {	// ���� ó��
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
		} 
		// ��� 2
		try {
			int result = sageAdd(200000, 200000);
			System.out.println(result);
		} catch(ArithmeticException e) {	// ���� ó��
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
		} 
	}
	
	// �޼ҵ� ����
	private static int sageAdd(int left, int right) {
		if(right>0) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		} else {
			if(left < (Integer.MIN_VALUE - right)){
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		return left + right;
	}

}
/* ��°�
�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����
400000
*/