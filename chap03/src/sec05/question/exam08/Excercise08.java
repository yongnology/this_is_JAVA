package sec05.question.exam08;
// Ȯ�ι��� 08
// NaN ���� �˻��ؼ� �ùٸ� �ܷΰ��� ����� �� �ְ� �ϱ�
public class Excercise08 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if(Double.isNaN(z)) {	// ���� NaN���� Ȯ���ϴ� �ڵ� .isNaN()
			System.out.println("0.0���� ���� �� �����ϴ�.");
		} else {
			double result = z +10;
			System.out.println("��� : " + result);
		}
	}

}
/* ��°�
0.0���� ���� �� �����ϴ�.
*/