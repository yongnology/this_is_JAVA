package sec04.exam03_NaN_Infinity;
// Infinity 와 NaN
public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x/y;
		// double z = x%y;	// NaN 값 출력
		
		System.out.println("Infinite : "+Double.isInfinite(z));
			// infinite 이여서 true값 출력
		System.out.println("NaN : "+Double.isNaN(z));
			// Nan이 아니라서 False 출력
		
		System.out.println((z + 2));	// 문제가 되는 코드
		
		if( Double.isInfinite(z) || Double.isNaN(z) ) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z+2);
		}
	}

}
/* 출력값
Infinite : true
NaN : false
Infinity
값 산출 불가
*/

// Nan 또는 Infinity 값에 다음 연산을 수행하면 데이터가 엉망이 된다.