package sec06.exam04_main_argument;
// main() �޼ҵ��� �Ű� ����
public class MainStringArrayExample {

	public static void main(String[] args) {
		if(args.length != 2) {	// �迭�� ����
			System.out.println("���α׷��� ����");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);	// ���α׷� ���� ����
		}
		String strNum1 = args[0];	// ù ��° ������ ���
		String strNum2 = args[1];	// �� ���� ������ ���
		
		int num1 = Integer.parseInt(strNum1);	// ���ڿ��� ������ ��ȯ
		int num2 = Integer.parseInt(strNum2);	// ���ڿ��� ������ ��ȯ
		
		int result = num1 + num2;
		System.out.println(num1+" + "+strNum2+" = "+result);
	}

}
/* ��°�
// Argument�� �ƹ��͵� ���� ���� ���
���α׷��� ����
java MainStringArrayArgument num1 num2


// Argument��10, 20 �� ���� ���
10 + 20 = 30
*/

// Argument�� Run Configurations... ���� ���� �����ϴ�.