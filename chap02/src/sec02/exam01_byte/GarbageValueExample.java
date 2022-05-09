package sec02.exam01_byte;
// byte 타입 변수
public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		
		int var2 = 125;
		for(int i=0; i<5; i++) {	// 5회 반복 실행
			var1 ++;	// byte 타입은 경우 127이 넘는 순간 -128부터 다시 저장
			var2 ++;	// int 타입은 정상적으로 1씩 증가
			System.out.println("var1:"+var1+"\t"+"var2: "+var2);
		}
	}
}
/* 출력값
var1:126	var2: 126
var1:127	var2: 127
var1:-128	var2: 128
var1:-127	var2: 129
var1:-126	var2: 130
*/