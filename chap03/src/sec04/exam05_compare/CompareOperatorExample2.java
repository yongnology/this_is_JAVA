package sec04.exam05_compare;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);	// true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);	// flase
		// float과 double의 정밀도가 다르다.
		System.out.println((float)v4 == v5);	// true
		System.out.println((int)(v4*10) == (int)(v5*10));	// true
	}
}
/* 출력값
true
false
true
true
*/