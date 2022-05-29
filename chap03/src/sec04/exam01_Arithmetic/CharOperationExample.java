package sec04.exam01_Arithmetic;
// char 타입 연산
public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
				// 66
		char c2 = 'A';
		//char c3 = c2 +1;	// 컴파일 에러
		//(결과값은 4byte int타입 이지만 변수가 2byte char타입으로 저장할 수 없다.
		
		// 만약 하고 싶은 경우
		int result = c2 +1;
		System.out.println((char)(result));
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
	}

}
/* 출력값
B
c1 = B
c2 = A
*/

// 리터럴로 더해서 char에 넣는것은 괜찮지만,
// 변수로 연산하는 경우에는 자동 int타입으로 강제타입변환해야 가능하다.