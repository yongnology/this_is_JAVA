package sec03.exam03_deny_logic;
// 논리 부정 연산자
public class DenyLogicOperatiorExample {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}

}
/* 출력값
true
false
true
*/