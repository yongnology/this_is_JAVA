package sec04.exam04_InputDataCheckNaN;
// "NaN"을 체크하고 연산 수행
public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		
		double val = Double.valueOf(userInput);
		
		double currentBallence = 10000.0;
		
		if(Double.isNaN(val)) {	// NaN을 검사함
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		} else 
			currentBallence += val;
			//currentBallence = currentBallence + val;
		
		System.out.println(currentBallence);
	}

}
/* 출력값
NaN이 입력되어 처리할 수 없음
10000.0
*/

// 기존에 있는 값도 NaN으로 바꾸어 버린다.