package sec02.exam01_if;
// if문
public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if(score<90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		// 위의 if문에서 실행되었기 때문에 아래 if문은 실행되지 않는다.
	}

}
/* 출력값
점수가 90보다 큽니다.
등급은 A입니다.
*/