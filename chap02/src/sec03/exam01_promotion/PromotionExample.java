package sec03.exam01_promotion;
// �ڵ� Ÿ�� ��ȯ
public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;	// int �� byte
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;		// int �� char
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue;	// long �� int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	// double �� int
		System.out.println(doubleValue);
		
		longValue = 10000000000L;
		float floatValue = longValue;	// float �� long
		System.out.println(floatValue);
	}

}
/* ��°�
10
44032
500
200.0
1.0E10
*/