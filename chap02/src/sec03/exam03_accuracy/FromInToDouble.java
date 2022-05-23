package sec03.exam03_accuracy;
//정수 타입을 실수 타입으로 변환할 때 정밀도 손실을 피한다.
public class FromInToDouble {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}
/* 출력값
0
*/

// 정상적으로 변환되고 복원되어 0을 출력하였다.