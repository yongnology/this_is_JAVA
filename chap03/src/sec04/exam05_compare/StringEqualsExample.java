package sec04.exam05_compare;
// 문자열 비교
public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println( strVar1 == strVar2);	// 참조하는 객체(번지)가 같은지
		System.out.println( strVar1 == strVar3);	// 참조하는 객체(번지)가 같은지
		System.out.println();
		
		System.out.println( strVar1.equals(strVar2));	// 문자열이 같은지
		System.out.println( strVar1.equals(strVar3));	// 문자열이 같은지
	}

}
/* 출력값
true
false

true
true
*/