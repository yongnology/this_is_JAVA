package sec03.exam03_dowhile;
// do-while문 기초
public class DoWhileExample2 {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		int i=0;
		
		do {
			System.out.println(i);
			i++;
		} while(i<=10);
		System.out.println();
		System.out.println("프로그램 종료");
	}
	
}
