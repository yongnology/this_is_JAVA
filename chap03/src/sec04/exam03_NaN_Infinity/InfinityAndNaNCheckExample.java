package sec04.exam03_NaN_Infinity;
// Infinity �� NaN
public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x/y;
		// double z = x%y;	// NaN �� ���
		
		System.out.println("Infinite : "+Double.isInfinite(z));
			// infinite �̿��� true�� ���
		System.out.println("NaN : "+Double.isNaN(z));
			// Nan�� �ƴ϶� False ���
		
		System.out.println((z + 2));	// ������ �Ǵ� �ڵ�
		
		if( Double.isInfinite(z) || Double.isNaN(z) ) {
			System.out.println("�� ���� �Ұ�");
		} else {
			System.out.println(z+2);
		}
	}

}
/* ��°�
Infinite : true
NaN : false
Infinity
�� ���� �Ұ�
*/

// Nan �Ǵ� Infinity ���� ���� ������ �����ϸ� �����Ͱ� ������ �ȴ�.