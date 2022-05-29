package sec05.exam01_bit;
// ��Ʈ �̵� ������
public class BitShiftExample {

	public static void main(String[] args) {
		System.out.println("1 << 3 = " +(1<<3));
		System.out.println("-8 >> 3 = " + (-8>>3));	// ���������� 3��Ʈ
		System.out.println("-8 >>> 3 = " + (-8>>>3));
		// ���� ���� ��Ʈ �ڸ����� "0"�� ����
		
		System.out.println(toBinaryString(-8));
		System.out.println(">>3 = ");
		System.out.println(toBinaryString(-8>>3));
		System.out.println("--- ������---");
		System.out.println(toBinaryString(-8));
		System.out.println(">>>3 = ");
		System.out.println(toBinaryString(-8>>>3));
	}
	// ���� �߰� ����
		public static String toBinaryString(int value) {
			String str = Integer.toBinaryString(value);
			while(str.length() < 32) {
				str = "0" + str;
			}
			return str;
		}

}
/* ��°�
1 << 3 = 8
-8 >> 3 = -1
-8 >>> 3 = 536870911
11111111111111111111111111111000
>>3 = 
11111111111111111111111111111111
--- ������---
11111111111111111111111111111000
>>>3 = 
00011111111111111111111111111111
*/