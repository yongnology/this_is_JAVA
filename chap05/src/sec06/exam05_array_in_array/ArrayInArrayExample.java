package sec06.exam05_array_in_array;
// �迭 ���� �迭
public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];	// 2�� 3�� �̶�� �����ص� ����.
		
		for(int i=0; i<mathScores.length; i++) {	// 2�� ����.
			for(int k=0; k<mathScores[i].length; k++) {	// �� ���� ������ŭ ����.
				System.out.println("mathScores["+i+"]["+k+"] = "+ mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++) {	// 2�� ����.
			for(int k=0; k<englishScores[i].length; k++) { // �� ���� ������ŭ ����.
				System.out.println("englishScores["+i+"]["+k+"] = "+ englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { {95,80}, {92,96,80} };
		for(int i=0; i<javaScores.length; i++) {	// 2�� ����.
			for(int k=0; k<javaScores[i].length; k++) { // �� ���� ������ŭ ����.
				System.out.println("javaScores["+i+"]["+k+"] = "+ javaScores[i][k]);
			}
		}
	}
}
/* ��°�
mathScores[0][0] = 0
mathScores[0][1] = 0
mathScores[0][2] = 0
mathScores[1][0] = 0
mathScores[1][1] = 0
mathScores[1][2] = 0

englishScores[0][0] = 0
englishScores[0][1] = 0
englishScores[1][0] = 0
englishScores[1][1] = 0
englishScores[1][2] = 0

javaScores[0][0] = 95
javaScores[0][1] = 80
javaScores[1][0] = 92
javaScores[1][1] = 96
javaScores[1][2] = 80
*/