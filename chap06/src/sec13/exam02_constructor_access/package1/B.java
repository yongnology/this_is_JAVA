package sec13.exam02_constructor_access.package1;

public class B {
	A a1 = new A(true);		// 
	A a2 = new A();			// default 생성자는 같은 패키지에서 접근 가능
	//A a3 = new A("문자열");	// private 생성자 접근 불가(컴파일 에러)
}
