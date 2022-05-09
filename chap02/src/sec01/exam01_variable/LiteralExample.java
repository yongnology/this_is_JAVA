package sec01.exam01_variable;
// 리터럴
public class LiteralExample {

	public static void main(String[] args) {
		// 정수 리터럴
		int var1 = 10;		// 10진수
		System.out.println(var1);
		
		int var2 = 010;		// 8진수
		System.out.println(var2);
		
		int var3 = 0x10;	// 16진수
		System.out.println(var3);
		
		// 실수 리터럴
		double var4 = 0.25;
		System.out.println(var4);
		
		double var5 = 2E5;
		System.out.println(var5);
		
		//문자 리터럴
		char var6 = 'A';
		System.out.println(var6);
		
		char var7 = '한';
		System.out.println(var7);
		
		System.out.println("\t 들여쓰기");				// tab
		System.out.println("대한 \n민국");				// 줄바꿈
		System.out.println("This\'s Java");			// '
		System.out.println("이것은 \"중요\" 합니다."); 	// "
		System.out.println("가격이 '\\'300 입니다.");		// /
		
		char var8 = '\u0041';						// 16진수
		System.out.println(var8);
		
		String var9 = "자바";
		
		boolean var10 = true;
		boolean var11 = false;
		System.out.println(var10);
		
	}
}
/* 출력값
10
8
16
0.25
200000.0
A
한
	 들여쓰기
대한 
민국
This's Java
이것은 "중요" 합니다.
가격이 '\'300 입니다.
A
true
*/