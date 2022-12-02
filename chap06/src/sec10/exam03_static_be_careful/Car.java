package sec10.exam03_static_be_careful;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "로 달립니다");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}

// 출력값
/*
60로 달립니다
 */

// 같은 클래스 내부에서도 객체 생성 후 사용해야 한다.
