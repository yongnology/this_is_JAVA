package sec04.exam02_Accuracy;
// ��Ȯ�� ����� ������ ����Ѵ�. (�ذ�)
public class AccuacyExample {

	public static void main(String[] args) {
		int apple = 1;
		
		int totalPiece = apple *10;
		int number = 7;
		int temp = totalPiece - number;
		
		
		double result = temp / 10.0;
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����,");
		System.out.println(result + "������ ���´�.");
	}

}
/* ��°�
��� �Ѱ�����
0.7 ������ ����,
0.3������ ���´�.
*/

// ��Ȯ�� ����� �ʿ��ϴٸ� ���� �������� �����ؼ� ����ϴ°� ����.