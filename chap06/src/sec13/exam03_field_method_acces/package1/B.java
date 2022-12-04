package sec13.exam03_field_method_acces.package1;

public class B {
	// 생성자
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		// a.field3 = 1;	// private 필드 접근 불가
		
		a.method1();
		a.method2();
		// a.method3();		// private 메소드 접근 불가
	}
}
