package sec02.exam01_if;
// char 타입의 Switch문
public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
			// case 'A'도 case 'a'값이 출력된다.
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
			// case 'B'도 case 'b'값이 출력된다.
		default :
			System.out.println("손님입니다.");
		}
	}

}
/* 출력값
일반 회원입니다.
*/
