package sec04.exam01_Arithmetic;
// char Ÿ�� ����
public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
				// 66
		char c2 = 'A';
		//char c3 = c2 +1;	// ������ ����
		//(������� 4byte intŸ�� ������ ������ 2byte charŸ������ ������ �� ����.
		
		// ���� �ϰ� ���� ���
		int result = c2 +1;
		System.out.println((char)(result));
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
	}

}
/* ��°�
B
c1 = B
c2 = A
*/

// ���ͷ��� ���ؼ� char�� �ִ°��� ��������,
// ������ �����ϴ� ��쿡�� �ڵ� intŸ������ ����Ÿ�Ժ�ȯ�ؾ� �����ϴ�.