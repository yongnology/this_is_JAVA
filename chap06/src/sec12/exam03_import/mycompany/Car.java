package sec12.exam03_import.mycompany;

import sec12.exam03_import.hankook.SnowTire;
import sec12.exam03_import.hyndai.Engine;
import sec12.exam03_import.kumho.BigWidthTire;

public class Car {
	// �ʵ�
	// ��ܿ� import���� �̿��Ͽ� ���
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// ��ü ��Ű���� Ŭ������ ��� ���
	sec12.exam03_import.hankook.Tire tire3 = new sec12.exam03_import.hankook.Tire();
	sec12.exam03_import.kumho.Tire tire4 = new sec12.exam03_import.kumho.Tire();
}


// Ctrl + Shift + O
// import���� �ڵ����� �߰��ϴ� ���