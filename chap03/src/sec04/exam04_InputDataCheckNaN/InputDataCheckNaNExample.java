package sec04.exam04_InputDataCheckNaN;
// "NaN" ���ڿ��� ������
public class InputDataCheckNaNExample {

	public static void main(String[] args) {
		String userInput = "NaN";
		
		double val = Double.valueOf(userInput);
		
		double currentBallence = 10000.0;
		
		currentBallence = currentBallence + val;
		System.out.println(currentBallence);
	}

}
/* ��°�
NaN
*/

// ������ �ִ� ���� NaN���� �ٲپ� ������.