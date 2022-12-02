package sec08.exam01_declaration;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		// 방법1 배열로 선언
		// 배열 변수를 대입
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1);
		
		// 배열을 직접 대입
		int result2 = myCom.sum1( new int[] {1,2,3});
		System.out.println("result2 : " + result2);
		
		// 방법2... 사용
		int result3 = myCom.sum2( 1,2,3);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2( 1,2,3,4 ,5);
		System.out.println("result4 : " + result4);
	}
}

// 출력값
/*
result1 : 6
result2 : 6
result3 : 6
result4 : 15
*/