package sec04.exam04_InputDataCheckNaN;
// "NaN"�� üũ�ϰ� ���� ����
public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		
		double val = Double.valueOf(userInput);
		
		double currentBallence = 10000.0;
		
		if(Double.isNaN(val)) {	// NaN�� �˻���
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			val = 0.0;
		} else 
			currentBallence += val;
			//currentBallence = currentBallence + val;
		
		System.out.println(currentBallence);
	}

}
/* ��°�
NaN�� �ԷµǾ� ó���� �� ����
10000.0
*/

// ������ �ִ� ���� NaN���� �ٲپ� ������.