package sec06.exam01_array_bylist;
// ���� ����Ʈ�� �迭 ����
public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		// ������ �����Ϸ� new �����ڸ� �ٿ��� �����ؾ� �Ѵ�.
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("���� : " + sum1);
		
		// add �޼ҵ带 ����Ͽ� ���� ���ϱ�
		int sum2 = add( new int[] {83, 90, 87} );
		System.out.println("���� : " + sum2);
		System.out.println();
	}
	
	// ������ ����ؼ� �����ϴ� �޼ҵ�
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
/* ��°�
���� : 260
���� : 260
*/