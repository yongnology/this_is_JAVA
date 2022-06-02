package sec06.exam04_main_argument;
// main() 메소드의 매개 변수
public class MainStringArrayExample {

	public static void main(String[] args) {
		if(args.length != 2) {	// 배열의 길이
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);	// 프로그램 강제 종료
		}
		String strNum1 = args[0];	// 첫 번째 데이터 얻기
		String strNum2 = args[1];	// 두 번쨰 데이터 얻기
		
		int num1 = Integer.parseInt(strNum1);	// 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);	// 문자열을 정수로 변환
		
		int result = num1 + num2;
		System.out.println(num1+" + "+strNum2+" = "+result);
	}

}
/* 출력값
// Argument에 아무것도 넣지 않은 경우
프로그램의 사용법
java MainStringArrayArgument num1 num2


// Argument에10, 20 을 넣은 경우
10 + 20 = 30
*/

// Argument는 Run Configurations... 에서 수정 가능하다.