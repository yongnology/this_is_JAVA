package sec04.exam02_Accuracy;
// ��Ȯ�� ����� ������ ����Ѵ�. (������ ����)
public class AccuacyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����,");
		System.out.println(result + "������ ���´�.");
	}

}
/* ��°�
��� �Ѱ�����
0.7 ������ ����,
0.29999999999999993������ ���´�.
*/