package sec02.exam01_if;
// 중첩 if문
public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;
		System.out.println("점수 : "+ score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";	// if문은 여기까지만 실행
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점 : "+score+"점 = "+grade);
		// A+
	}
}
/* 출력값
점수 : 95
학점 : A+
*/