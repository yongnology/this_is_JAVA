package sec04.exam03_NaN_Infinity;
// Infinity 와 NaN(2)
public class InfinityAndNaNCheckExample2 {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;	// 만약 int y=0 이면, ArithmeticException 이 발생한다.
		
		double z = x/y;
		// double z = x%y;	// NaN 값 출력
		
		System.out.println(Double.isInfinite(z));
			// infinite 이여서 true값 출력
		System.out.println(Double.isNaN(z));
			// Nan이 아니라서 False 출력
		
		System.out.println((z + 2));	// 문제가 되는 코드
		System.out.println("-----");
		
		int x1 = 5;
		int y1 = 0;
		
		try {
			int z1 = x1 / y1;
			System.out.println(z1);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		}
		
	}

}
/* 출력값
true
false
Infinity
-----
0으로 나누면 안됨
*/

// Nan 또는 Infinity 값에는 산술 연산자가 되지 않는다.