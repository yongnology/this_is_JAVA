package sec03.verify;
// while���� Math.random()�޼ҵ带 �̿��Ͽ�
// �� ���� �ֻ����� ������ ��
// ������ ���� ���� 5�̸� ������ ���ߴ� �ڵ� �ۼ�
public class Excercise04 {

	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			
			System.out.println("("+num1+","+num2+")");
			if((num1 + num2) ==5) {
				break;
			}
		}
	}

}
/* ��°�
(6,5)
(6,6)
(3,4)
(6,5)
(6,6)
(4,1)
*/

// ������ 4,1 ���� 5���� ���߾���.