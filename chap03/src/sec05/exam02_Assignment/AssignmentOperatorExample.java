package sec05.exam02_Assignment;
// 대입 연산자
public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result = " + result);	//10
		result -= 5;	// 10-5=5
		System.out.println("result = " + result);
		result *= 3;	// 5*3=15
		System.out.println("result = " + result);
		result /= 5;	// 15/5=3
		System.out.println("result = " + result);
		result %= 3;	// 3%3=0
		System.out.println("result = " + result);
	}

}
/* 출력값
result = 10
result = 5
result = 15
result = 3
result = 0
*/