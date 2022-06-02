package sec06.exam05_array_in_array;
// 배열 속의 배열
public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];	// 2행 3열 이라고 생각해도 좋다.
		
		for(int i=0; i<mathScores.length; i++) {	// 2번 돈다.
			for(int k=0; k<mathScores[i].length; k++) {	// 각 열의 갯수만큼 돈다.
				System.out.println("mathScores["+i+"]["+k+"] = "+ mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++) {	// 2번 돈다.
			for(int k=0; k<englishScores[i].length; k++) { // 각 열의 갯수만큼 돈다.
				System.out.println("englishScores["+i+"]["+k+"] = "+ englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { {95,80}, {92,96,80} };
		for(int i=0; i<javaScores.length; i++) {	// 2번 돈다.
			for(int k=0; k<javaScores[i].length; k++) { // 각 열의 갯수만큼 돈다.
				System.out.println("javaScores["+i+"]["+k+"] = "+ javaScores[i][k]);
			}
		}
	}
}
/* 출력값
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