package sec03.exam03_dowhile;
//do-while��
import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
			// Scanner ��ü ������
		String inputStirng;
		
		do {
			System.out.print(">");
			inputStirng = scanner.nextLine();
			System.out.println(inputStirng);
		} while( ! inputStirng.equals("q"));
		System.out.println();
		System.out.println("���α׷� ����");
	}
	
}
/* ��°�
�޼����� �Է��ϼ���
���α׷��� �����Ϸ��� q�� �Է��ϼ���
>�ȳ��ϼ���\
�ȳ��ϼ���\
>12345 �ݰ����ϴ�.
12345 �ݰ����ϴ�.
>q
q

���α׷� ����
*/