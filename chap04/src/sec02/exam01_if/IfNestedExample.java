package sec02.exam01_if;
// ��ø if��
public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;
		System.out.println("���� : "+ score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";	// if���� ��������� ����
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
		System.out.println("���� : "+score+"�� = "+grade);
		// A+
	}
}
/* ��°�
���� : 95
���� : A+
*/