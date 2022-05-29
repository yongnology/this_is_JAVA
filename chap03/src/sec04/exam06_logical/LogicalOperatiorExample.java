package sec04.exam06_logical;
// 논리 연산자
public class LogicalOperatiorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		System.out.println("입력된 charCode : "+(char)charCode);
		if( (charCode>=65) & (charCode<=90) ) {
			System.out.println("대문자 이군요");
		}
		
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자 이군요");
		}
		
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0 ~9 숫자이군요");
		}
		System.out.println("-----------------");
		int value = 6;
		System.out.println("입력된 value = "+value);
		if( (value%2 == 0) | (value%3 ==0) ) {
			// 두개를 모두 개산 하고 결과 산출
			System.out.println("2또는 3의 배수이군요");
		}
		
		if( (value%2 == 0) || (value%3 == 0) ) {
			// 앞의 값이 맞으면 뒤의 조건은 계산 X
			System.out.println("2또는 3의 배수 이군요");
		}
	}

}
/* 출력값
입력된 charCode : A
대문자 이군요
-----------------
입력된 value = 6
2또는 3의 배수이군요
2또는 3의 배수 이군요
*/