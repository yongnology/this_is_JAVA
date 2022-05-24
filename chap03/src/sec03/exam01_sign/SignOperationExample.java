package sec03.exam01_sign;
// 부호 연산자
public class SignOperationExample{

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1);
		System.out.println(result2);
		
		short s = 100;
		// short result3 = -s; 컴파일 에러. int 타입을 해야한다.
		int result3 = -s;
		System.out.println("result3 : "+result3);
	}

}
/* 출력값
-100
100
result3 : -100
*/

// -1을 곱하는 것도 int 타입이다.