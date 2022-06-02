package sec05.exam01_string_equals;
// 문자열 비교
public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "이용민";
		String strVar2 = "이용민";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		System.out.println();
		String strVar3 = new String("이용민");
		String strVar4 = new String("이용민");
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		if(strVar3.equals(strVar4) ) {
			System.out.println("strVar3와 strVar4는 문자열이 같음");
		}
		
	}

}
/* 출력값
strVar1과 strVar2는 참조가 같음
strVar1과 strVar2는 문자열이 같음

strVar3과 strVar4는 참조가 다름
strVar3와 strVar4는 문자열이 같음
*/