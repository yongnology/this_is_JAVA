package sec08.exam04_overloading;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaReactangle(10);
		double result2 = myCalc.areaReactangle(10,20);
		
		System.out.println("정사각형 넓이(result1) : "+result1);
		System.out.println("직사각형 넓이(result2) : "+result2);
	}
}

// 출력값
/*
정사각형 넓이(result1) : 100.0
직사각형 넓이(result2) : 200.0
*/
