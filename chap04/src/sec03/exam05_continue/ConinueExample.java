package sec03.exam05_continue;
// continue를 사용한 for문
public class ConinueExample {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			if(i%2 != 0) { // 홀수인경우
				continue;
			}
			System.out.println(i);
			// 홀수는 실행되지 않는다.
		}
	}

}
/* 출력값
2
4
6
8
*/

// continue는 반복문의 처음으로 돌아간다.