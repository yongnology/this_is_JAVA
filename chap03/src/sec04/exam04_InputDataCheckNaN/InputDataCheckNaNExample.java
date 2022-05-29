package sec04.exam04_InputDataCheckNaN;
// "NaN" 문자열의 문제점
public class InputDataCheckNaNExample {

	public static void main(String[] args) {
		String userInput = "NaN";
		
		double val = Double.valueOf(userInput);
		
		double currentBallence = 10000.0;
		
		currentBallence = currentBallence + val;
		System.out.println(currentBallence);
	}

}
/* 출력값
NaN
*/

// 기존에 있는 값도 NaN으로 바꾸어 버린다.