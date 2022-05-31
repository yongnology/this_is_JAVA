package sec03.exam02_while;
// Ű����� while�� ����
public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				// ����Ű�� �ƴ϶��
				System.out.println("----------------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("----------------------");
				System.out.print("���� : ");
			}
			
			keyCode = System.in.read();
				// Ű������ Ű�ڵ尪�� �о� �����Ѵ�. + ����ó���� �־�� �Ѵ�.
			
			if(keyCode == 49) { // 1�� �о��� ���
				speed++;
				System.out.println("���� �ӵ� = "+speed);
			} else if (keyCode==50) { // 2�� �о��� ���
				speed--;
				System.out.println("���� �ӵ� = "+speed);
			} else if (keyCode ==51) {	// 3�� �о��� ���
				run = false;	// while���� �������� �� �ֵ��� �Ѵ�.
			}
		}
		
		System.out.println("���α׷� ����");
	}
}
/* ��°�
----------------------
1.���� | 2.���� | 3.����
----------------------
���� : 1
���� �ӵ� = 1
----------------------
1.���� | 2.���� | 3.����
----------------------
���� : 1
���� �ӵ� = 2
----------------------
1.���� | 2.���� | 3.����
----------------------
���� : 2
���� �ӵ� = 1
----------------------
1.���� | 2.���� | 3.����
----------------------
���� : 3
���α׷� ����
 */

// Enter Ű�� �ΰ��� ����� �Ѵ�.(13, 10)
// 13 : Carriage Return
// 10 : Line Feed
