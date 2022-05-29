package sec05.exam01_bit;
// 비트 이동 연산자
public class BitShiftExample {

	public static void main(String[] args) {
		System.out.println("1 << 3 = " +(1<<3));
		System.out.println("-8 >> 3 = " + (-8>>3));	// 오른쪽으로 3비트
		System.out.println("-8 >>> 3 = " + (-8>>>3));
		// 새로 생긴 비트 자리에는 "0"을 대입
		
		System.out.println(toBinaryString(-8));
		System.out.println(">>3 = ");
		System.out.println(toBinaryString(-8>>3));
		System.out.println("--- 기준점---");
		System.out.println(toBinaryString(-8));
		System.out.println(">>>3 = ");
		System.out.println(toBinaryString(-8>>>3));
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
1 << 3 = 8
-8 >> 3 = -1
-8 >>> 3 = 536870911
11111111111111111111111111111000
>>3 = 
11111111111111111111111111111111
--- 기준점---
11111111111111111111111111111000
>>>3 = 
00011111111111111111111111111111
*/