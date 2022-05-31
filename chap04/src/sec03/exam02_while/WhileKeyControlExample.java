package sec03.exam02_while;
// 키보드로 while문 제어
public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				// 엔터키가 아니라면
				System.out.println("----------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("----------------------");
				System.out.print("선택 : ");
			}
			
			keyCode = System.in.read();
				// 키보드의 키코드값을 읽어 리턴한다. + 예외처리가 있어야 한다.
			
			if(keyCode == 49) { // 1을 읽었을 경우
				speed++;
				System.out.println("현재 속도 = "+speed);
			} else if (keyCode==50) { // 2를 읽었을 경우
				speed--;
				System.out.println("현재 속도 = "+speed);
			} else if (keyCode ==51) {	// 3을 읽었을 경우
				run = false;	// while문을 빠져나갈 수 있도록 한다.
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
/* 출력값
----------------------
1.증속 | 2.감속 | 3.중지
----------------------
선택 : 1
현재 속도 = 1
----------------------
1.증속 | 2.감속 | 3.중지
----------------------
선택 : 1
현재 속도 = 2
----------------------
1.증속 | 2.감속 | 3.중지
----------------------
선택 : 2
현재 속도 = 1
----------------------
1.증속 | 2.감속 | 3.중지
----------------------
선택 : 3
프로그램 종료
 */

// Enter 키는 두가지 기능을 한다.(13, 10)
// 13 : Carriage Return
// 10 : Line Feed
