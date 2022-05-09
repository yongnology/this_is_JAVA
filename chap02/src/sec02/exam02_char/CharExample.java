package sec02.exam02_char;
// char 타입 변수
public class CharExample {
	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uAC00';
		
		int uniCode = c1;	// 유니코드 값으로 불러옴
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		System.out.println(uniCode);
	}
}
/* 출력값
A
A
A
가
가
가
65
*/