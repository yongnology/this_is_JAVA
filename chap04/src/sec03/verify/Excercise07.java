package sec03.verify;
//while문과 Scanner를 이용해서
//예금, 출금, 조회, 종료 기능을 제공하는 코드
import java.util.Scanner;

public class Excercise07 {

	public static void main(String[] args) {
		boolean run = true;	// while문의 변수
		int balance = 0;	// 잔고
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			// 작성위치
			int menuNum = scanner.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.print("예금액> ");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run=false;	// while문의 변수 run을 false로 설정
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
/* 출력값
----------------------------
1.예금 | 2.출금 | 3.잔고 | 4.종료
----------------------------
선택> 1
예금액> 10000
----------------------------
1.예금 | 2.출금 | 3.잔고 | 4.종료
----------------------------
선택> 2
출금액> 2000
----------------------------
1.예금 | 2.출금 | 3.잔고 | 4.종료
----------------------------
선택> 3
잔고> 8000
----------------------------
1.예금 | 2.출금 | 3.잔고 | 4.종료
----------------------------
선택> 4
프로그램 종료
*/