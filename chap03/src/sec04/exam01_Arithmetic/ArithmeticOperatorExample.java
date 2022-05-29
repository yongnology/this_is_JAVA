package sec04.exam01_Arithmetic;
// 산술 연산자
public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;	// 5+2=7
		System.out.println("result1 = " + result1);
		
		int result2 = v1 - v2;	// 5-2=3
		System.out.println("result2 = " + result2);
		
		int result3 = v1 * v2;	// 5*2=10
		System.out.println("result3 = " + result3);
		
		int result4 = v1 / v2;	// 5/2=2
		System.out.println("result4 = " + result4);
		
		int result5 = v1 % v2;	// 5%2=1
		System.out.println("result5 = " + result5);
		
		double result6 = (double)v1 / v2;	// 5.0/2=2.5
		// v1을 double 타입으로 강제 타입 변환(캐스팅)한 후 연산을 하면 원하는 값이 나온다.
		System.out.println("result6 = " + result6);
	}
}
/* 출력값
result1 = 7
result2 = 3
result3 = 10
result4 = 2
result5 = 1
result6 = 2.5
*/