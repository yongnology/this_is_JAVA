package sec03.exam02_while;
// 1부터 100까지의 합을 출력
public class WhileSumFrom1To100Example {
	
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" +(i-1)+" 합 : " + sum);
	}
}
/* 출력값
1~100 합 : 5050
*/

// while 문 내에서 계속 누적되는 값을 갖는 변수는
// while문 시작 전에 미리 선언해야 한다.