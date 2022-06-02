package sec06.exam01_array_bylist;
// 값 목록으로 배열 생성
public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		// scores는 stack영역, 83,90,87은 힙 영역에 저장된다.
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}

}
/* 출력값
scores[0] : 83
scores[1] : 90
scores[2] : 87
총합 : 260
평균 : 86.66666666666667
*/