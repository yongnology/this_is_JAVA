package sec02.exam01_if;
// char Ÿ���� Switch��
public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
			// case 'A'�� case 'a'���� ��µȴ�.
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
			// case 'B'�� case 'b'���� ��µȴ�.
		default :
			System.out.println("�մ��Դϴ�.");
		}
	}

}
/* ��°�
�Ϲ� ȸ���Դϴ�.
*/
