package sec02.exam01_if;
// Switch문
public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		// 주사위 번호 하나 뽑기
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:	// default 값은 선택사항이지, 필수사항이 아니다.
			System.out.println("6번이 나왔습니다.");
			break;
		}
	}

}
/* 출력값
2번이 나왔습니다.
*/

// break가 없다면 case가 연달아 실행된다.