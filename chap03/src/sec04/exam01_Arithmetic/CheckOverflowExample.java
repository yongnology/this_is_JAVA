package sec04.exam01_Arithmetic;
// 산술 연산 전에 오버플로우 탐지
public class CheckOverflowExample {

	public static void main(String[] args) {
		// 경우 1
		try {
			int result = sageAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {	// 예외 처리
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		} 
		// 경우 2
		try {
			int result = sageAdd(200000, 200000);
			System.out.println(result);
		} catch(ArithmeticException e) {	// 예외 처리
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		} 
	}
	
	// 메소드 선언
	private static int sageAdd(int left, int right) {
		if(right>0) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left < (Integer.MIN_VALUE - right)){
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}

}
/* 출력값
오버플로우가 발생하여 정확하게 계산할 수 없음
400000
*/