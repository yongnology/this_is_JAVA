package sec03.exam01_for;
// float 타입 카운터 변수
public class ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}

}
/* 출력값
0.1
0.2
0.3
0.4
0.5
0.6
0.70000005
0.8000001
0.9000001
*/

// float는 0.1을 처리하기 어렵다.
// 따라서 10번 출력이 아닌 9번 출력된다.