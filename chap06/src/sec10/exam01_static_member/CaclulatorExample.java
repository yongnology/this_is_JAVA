package sec10.exam01_static_member;

public class CaclulatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
// ��°�
/*
314.159
15
5
*/
