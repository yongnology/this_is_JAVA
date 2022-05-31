package sec03.verify;
// while문과 Math.random()메소드를 이용하여
// 두 개의 주사위를 던졌을 때
// 나오는 눈의 합이 5이면 실행을 멈추는 코드 작성
public class Excercise04 {

	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			
			System.out.println("("+num1+","+num2+")");
			if((num1 + num2) ==5) {
				break;
			}
		}
	}

}
/* 출력값
(6,5)
(6,6)
(3,4)
(6,5)
(6,6)
(4,1)
*/

// 마지막 4,1 합이 5여서 멈추었다.