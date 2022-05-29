package sec02.exam01_if;
// break문이 없는 case
public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;
		// 8<= ·· <=11 즉 8, 9, 10, 11
		System.out.println("현재시간 : "+time+"시");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다..");
		case 10:
			System.out.println("업무를 봅니다.");
		case 11:
			System.out.println("외근을 나갑니다.");
		}
	}

}
/* 출력값
현재시간 : 9시
회의를 합니다..
업무를 봅니다.
외근을 나갑니다.
*/

// 출력값에 case9 부터 끝까지 실행한다.