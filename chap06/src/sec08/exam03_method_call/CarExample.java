package sec08.exam03_method_call;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.keyTurnOn();
		myCar.run();
		
		int speed = myCar.getSpeed();
		System.out.println("현재속도 : "+ speed+ "km/h");
	}
}

// 출력값
/*
키를 돌립니다.
달립니다. <시속 : 10km/h>
달립니다. <시속 : 20km/h>
달립니다. <시속 : 30km/h>
달립니다. <시속 : 40km/h>
달립니다. <시속 : 50km/h>
현재속도 : 50km/h
*/
