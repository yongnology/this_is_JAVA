package sec03.exam04_bit_reverse;
// ��Ʈ ���� ������
public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 +1;
		System.out.println(toBinaryString(v1)+ "(������ : "+v1+")");
		System.out.println(toBinaryString(v2)+ "(������ : "+v2+")");
		System.out.println(toBinaryString(v3)+ "(������ : "+v3+")");
		
		int v4 = -10;		// -10
		int v5 = ~v4;		// 9
		int v6 = ~v4 +1;	// 10
		System.out.println(toBinaryString(v4)+ "(������ : "+v4+")");
		System.out.println(toBinaryString(v5)+ "(������ : "+v5+")");
		System.out.println(toBinaryString(v6)+ "(������ : "+v6+")");
	}
	// �޼ҵ�
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = "0" + str;
		}
		return str;
	}
}
/* ��°�
00000000000000000000000000001010(������ : 10)
11111111111111111111111111110101(������ : -11)
11111111111111111111111111110110(������ : -10)
11111111111111111111111111110110(������ : -10)
00000000000000000000000000001001(������ : 9)
00000000000000000000000000001010(������ : 10)
*/

// �ϵ���� ���� �϶��� ���Ǹ�, ��, �� ���߿��� �� ������ �ʴ´�.