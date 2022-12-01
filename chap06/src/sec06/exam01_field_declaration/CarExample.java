package sec06.exam01_field_declaration;

public class CarExample {
	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();
		
		// 필드값 읽기
		System.out.println("제작회사 : " + myCar.commpany);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재 속도 : " + myCar.speed);
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
	}
}

// 출력값
/*
제작회사 : 현대 자동자
모델명 : 그랜저
색깔 : 검정
최고속도 : 350
현재 속도 : 0
수정된 속도 : 60
*/