package sec06.exam01_array_bylist;
// 값의 리스트로 배열 생성
public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		// 변수로 선언하려 new 연산자를 붙여서 생성해야 한다.
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		// add 메소드를 사용하여 총합 구하기
		int sum2 = add( new int[] {83, 90, 87} );
		System.out.println("총합 : " + sum2);
		System.out.println();
	}
	
	// 총합을 계산해서 리턴하는 메소드
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
/* 출력값
총합 : 260
총합 : 260
*/