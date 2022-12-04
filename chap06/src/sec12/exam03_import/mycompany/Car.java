package sec12.exam03_import.mycompany;

import sec12.exam03_import.hankook.SnowTire;
import sec12.exam03_import.hyndai.Engine;
import sec12.exam03_import.kumho.BigWidthTire;

public class Car {
	// 필드
	// 상단에 import문을 이용하여 사용
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// 전체 패키지와 클래스를 모두 기술
	sec12.exam03_import.hankook.Tire tire3 = new sec12.exam03_import.hankook.Tire();
	sec12.exam03_import.kumho.Tire tire4 = new sec12.exam03_import.kumho.Tire();
}


// Ctrl + Shift + O
// import문을 자동으로 추가하는 기능