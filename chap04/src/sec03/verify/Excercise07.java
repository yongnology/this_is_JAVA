package sec03.verify;
//while���� Scanner�� �̿��ؼ�
//����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ�
import java.util.Scanner;

public class Excercise07 {

	public static void main(String[] args) {
		boolean run = true;	// while���� ����
		int balance = 0;	// �ܰ�
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("����> ");
			
			// �ۼ���ġ
			int menuNum = scanner.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.print("���ݾ�> ");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("��ݾ�> ");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.print("�ܰ�> ");
				System.out.println(balance);
				break;
			case 4:
				run=false;	// while���� ���� run�� false�� ����
				break;
			}
		}
		System.out.println("���α׷� ����");
	}
}
/* ��°�
----------------------------
1.���� | 2.��� | 3.�ܰ� | 4.����
----------------------------
����> 1
���ݾ�> 10000
----------------------------
1.���� | 2.��� | 3.�ܰ� | 4.����
----------------------------
����> 2
��ݾ�> 2000
----------------------------
1.���� | 2.��� | 3.�ܰ� | 4.����
----------------------------
����> 3
�ܰ�> 8000
----------------------------
1.���� | 2.��� | 3.�ܰ� | 4.����
----------------------------
����> 4
���α׷� ����
*/