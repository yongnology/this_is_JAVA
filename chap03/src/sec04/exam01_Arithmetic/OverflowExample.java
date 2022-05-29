package sec04.exam01_Arithmetic;
// 오버플로우
public class OverflowExample {

	public static void main(String[] args) {
		// 잘못된 예시
		int x = 1000000;
		int y = 1000000;
		
		int z = x *y;
		// int 타입에 저장할 수 있는 값 초과되어 원하는 값이 나오지 않는다.
		System.out.println(z);
		
		// 해결
		long x2 = 1000000;
		long y2 = 1000000;
		
		long z2 = x2 *y2;
		System.out.println(z2);
	}

}
/* 출력값
-727379968
1000000000000
*/