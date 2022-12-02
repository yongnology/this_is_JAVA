package sec08.exam02_return;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);	// Car의 setGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas() ) {
			System.out.println("gas를 주입할 필요가 있습니다.");
		} else {
			System.out.println("gas를 넣어주세요");
		}
	}
}
// 출력값
/*
gas가 있습니다.
출발합니다.
Run (gas잔량 : 5)
Run (gas잔량 : 4)
Run (gas잔량 : 3)
Run (gas잔량 : 2)
Run (gas잔량 : 1)
Stop (gas잔량 : 0)
gas가 없습니다.
gas를 넣어주세요
*/