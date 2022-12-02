package sec11.exam01_final;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa";	// final 필드는 값 수정 불가
		
		p1.name= "을지문덕";	// 인스턴스 필드는 수정 가능
		System.out.println(p1.name);
	}
}
// 출력값
/*
Korea
123456-1234567
계백
을지문덕
*/
