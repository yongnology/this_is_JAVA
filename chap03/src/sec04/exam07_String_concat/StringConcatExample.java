package sec04.exam07_String_concat;
// ���ڿ� ���� ������
public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;	//JDK6.0
		String str2 = str1 + "Ư¡";	//JDK6.0Ư¡
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;	// JDK33.0
		String str4 = 3 + 3.0 + "JDK";	// 6.0JDK
		// ���ں��� ���Ա⿡ �տ��� ��� ������, �ڿ��� ���� ������
		
		System.out.println(str3);
		System.out.println(str4);
	}

}
/* ��°�
JDK6.0Ư¡
JDK33.0
6.0JDK
*/