package sec04.exam02_Accuracy;
// 정확한 계산은 정수를 사용한다. (않좋은 예시)
public class AccuacyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 뺴면,");
		System.out.println(result + "조각이 남는다.");
	}

}
/* 출력값
사과 한개에서
0.7 조각을 뺴면,
0.29999999999999993조각이 남는다.
*/