package sec04.exam03_NaN_Infinity;
// Infinity �� NaN(2)
public class InfinityAndNaNCheckExample2 {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;	// ���� int y=0 �̸�, ArithmeticException �� �߻��Ѵ�.
		
		double z = x/y;
		// double z = x%y;	// NaN �� ���
		
		System.out.println(Double.isInfinite(z));
			// infinite �̿��� true�� ���
		System.out.println(Double.isNaN(z));
			// Nan�� �ƴ϶� False ���
		
		System.out.println((z + 2));	// ������ �Ǵ� �ڵ�
		System.out.println("-----");
		
		int x1 = 5;
		int y1 = 0;
		
		try {
			int z1 = x1 / y1;
			System.out.println(z1);
		} catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵ�");
		}
		
	}

}
/* ��°�
true
false
Infinity
-----
0���� ������ �ȵ�
*/

// Nan �Ǵ� Infinity ������ ��� �����ڰ� ���� �ʴ´�.