package verify;
// 배열의 항목에서 최대값을 구하기(for문 이용)
public class Excercise07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max : " + max);
	}

}

/* 출력값
max : 8
*/