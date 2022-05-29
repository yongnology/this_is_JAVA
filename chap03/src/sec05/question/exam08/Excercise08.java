package sec05.question.exam08;
// 확인문제 08
// NaN 값을 검사해서 올바른 겨로가가 출력할 수 있게 하기
public class Excercise08 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if(Double.isNaN(z)) {	// 값이 NaN인지 확이하는 코드 .isNaN()
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z +10;
			System.out.println("결과 : " + result);
		}
	}

}
/* 출력값
0.0으로 나눌 수 없습니다.
*/