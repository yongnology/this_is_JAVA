package sec06.exam01_array_bylist;
// �� ������� �迭 ����
public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		// scores�� stack����, 83,90,87�� �� ������ ����ȴ�.
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
		double avg = (double) sum / 3;
		System.out.println("��� : " + avg);
	}

}
/* ��°�
scores[0] : 83
scores[1] : 90
scores[2] : 87
���� : 260
��� : 86.66666666666667
*/