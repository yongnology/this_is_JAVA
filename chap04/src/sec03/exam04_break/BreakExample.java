package sec03.exam04_break;
// break�� while�� ����
public class BreakExample {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}
/* ��°�
3
3
3
1
1
6
���α׷� ����
*/

// while���� �̿��ؼ� �ֻ��� ��ȣ �� �ϳ��� �ݺ������� �̵�,
// 6�� ������ while���� �����Ų��.