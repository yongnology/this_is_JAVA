package sec02.exam01_if;
// 주사위의 번호를 뽑는 예제
public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;	// +1을 해줘야 원하는 범위를 설정할 수 있다.
				// 랜덤으로 값 추출.
				// 0 <= Math.random() <1
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num ==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num ==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num ==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num ==5) {
			System.out.println("5번이 나왔습니다.");
		} else{
			System.out.println("6번이 나왔습니다.");
		} 
	}

}
/* 출력값
6번이 나왔습니다.
*/
