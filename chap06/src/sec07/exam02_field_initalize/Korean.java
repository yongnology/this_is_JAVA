package sec07.exam02_field_initalize;

public class Korean {

	// 필드
	String nation = "대한민국";
	String name;
	String ssn;
/*	
	// 생성자
	public Korean(String n, String s) {
		name = n;
		ssn = s;
	}
*/
	// 생성자
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
