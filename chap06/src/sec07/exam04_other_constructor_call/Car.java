package sec07.exam04_other_constructor_call;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car() {
		
	}
	Car(String model) {
		this(model, "은색", 250);
	}
	Car(String model, String color) {
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed) {
		// 공통 실행 코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
