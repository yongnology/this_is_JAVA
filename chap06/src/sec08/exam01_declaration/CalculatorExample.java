package sec08.exam01_declaration;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.powerOn();
		
		int result1 = calc.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = calc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		calc.powerOff();
	}
}

// 출력값
/*
전원을 켭니다.
result1 : 11
result2 : 2.5
전원을 끕니다.
*/