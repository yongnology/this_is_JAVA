package sec03.exam05_continue;
// continue�� ����� for��
public class ConinueExample {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			if(i%2 != 0) { // Ȧ���ΰ��
				continue;
			}
			System.out.println(i);
			// Ȧ���� ������� �ʴ´�.
		}
	}

}
/* ��°�
2
4
6
8
*/

// continue�� �ݺ����� ó������ ���ư���.