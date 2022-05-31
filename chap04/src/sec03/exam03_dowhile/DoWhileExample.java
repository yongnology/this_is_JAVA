package sec03.exam03_dowhile;
//do-while문
import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
			// Scanner 객체 새엇ㅇ
		String inputStirng;
		
		do {
			System.out.print(">");
			inputStirng = scanner.nextLine();
			System.out.println(inputStirng);
		} while( ! inputStirng.equals("q"));
		System.out.println();
		System.out.println("프로그램 종료");
	}
	
}
/* 출력값
메세지를 입력하세요
프로그램을 종료하려면 q를 입력하세요
>안녕하세요\
안녕하세요\
>12345 반갑습니다.
12345 반갑습니다.
>q
q

프로그램 종료
*/