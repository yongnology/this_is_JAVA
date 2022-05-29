package sec05.exam01_bit;
// 비트 논리 연산자
public class BitLogicExample {

	public static void main(String[] args) {
		System.out.println("4&25 = "+(45&25));
		System.out.println("4|25 = "+(45|25));
		System.out.println("4^25 = "+(45^25));
		System.out.println("~45 = "+~45);
		
	// 강의 추가 예제
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		System.out.println("||");
		System.out.println(toBinaryString(45&25));
		
	}
	
	// 강의 추가 예제
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
/* 출력값
4&25 = 9
4|25 = 61
4^25 = 52
~45 = -46
00000000000000000000000000101101
&
00000000000000000000000000011001
||
00000000000000000000000000001001
*/