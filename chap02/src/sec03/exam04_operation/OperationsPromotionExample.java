package sec03.exam04_operation;
// 연산식에서 자동 타입 변환
public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;	// 컴파일 에러
		// 플러스 연산은 int 연산자로 선언해야 한다.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2;	// 컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;	// 결과값은 정수값(int)이므로 몫 2가 출력된다.
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10/4.0;	// 컴파일 에러
		// 4.0으로 나누기는 실수임으로 double로 해야한다.
		double doubleValue = intValue5/4.0; 	// intValue5는 자동 형변환이 이뤄진다.
		System.out.println(doubleValue);
	}

}

/* 출력값
30
유니코드 = 66
출력문자 = B
2
2.5
*/
