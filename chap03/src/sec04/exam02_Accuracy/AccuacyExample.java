package sec04.exam02_Accuracy;
// 정확한 계산은 정수를 사용한다. (해결)
public class AccuacyExample {

	public static void main(String[] args) {
		int apple = 1;
		
		int totalPiece = apple *10;
		int number = 7;
		int temp = totalPiece - number;
		
		
		double result = temp / 10.0;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 뺴면,");
		System.out.println(result + "조각이 남는다.");
	}

}
/* 출력값
사과 한개에서
0.7 조각을 뺴면,
0.3조각이 남는다.
*/

// 정확한 계산이 필요하다면 정수 연산으로 변경해서 계산하는게 좋다.