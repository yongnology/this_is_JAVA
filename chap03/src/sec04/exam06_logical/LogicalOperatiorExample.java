package sec04.exam06_logical;
// �� ������
public class LogicalOperatiorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		System.out.println("�Էµ� charCode : "+(char)charCode);
		if( (charCode>=65) & (charCode<=90) ) {
			System.out.println("�빮�� �̱���");
		}
		
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("�ҹ��� �̱���");
		}
		
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0 ~9 �����̱���");
		}
		System.out.println("-----------------");
		int value = 6;
		System.out.println("�Էµ� value = "+value);
		if( (value%2 == 0) | (value%3 ==0) ) {
			// �ΰ��� ��� ���� �ϰ� ��� ����
			System.out.println("2�Ǵ� 3�� ����̱���");
		}
		
		if( (value%2 == 0) || (value%3 == 0) ) {
			// ���� ���� ������ ���� ������ ��� X
			System.out.println("2�Ǵ� 3�� ��� �̱���");
		}
	}

}
/* ��°�
�Էµ� charCode : A
�빮�� �̱���
-----------------
�Էµ� value = 6
2�Ǵ� 3�� ����̱���
2�Ǵ� 3�� ��� �̱���
*/