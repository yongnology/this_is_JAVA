package sec04.exam01_Arithmetic;
// �����÷ο�
public class OverflowExample {

	public static void main(String[] args) {
		// �߸��� ����
		int x = 1000000;
		int y = 1000000;
		
		int z = x *y;
		// int Ÿ�Կ� ������ �� �ִ� �� �ʰ��Ǿ� ���ϴ� ���� ������ �ʴ´�.
		System.out.println(z);
		
		// �ذ�
		long x2 = 1000000;
		long y2 = 1000000;
		
		long z2 = x2 *y2;
		System.out.println(z2);
	}

}
/* ��°�
-727379968
1000000000000
*/