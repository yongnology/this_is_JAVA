package sec02.exam01_byte;
// byte Ÿ�� ����
public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		
		int var2 = 125;
		for(int i=0; i<5; i++) {	// 5ȸ �ݺ� ����
			var1 ++;	// byte Ÿ���� ��� 127�� �Ѵ� ���� -128���� �ٽ� ����
			var2 ++;	// int Ÿ���� ���������� 1�� ����
			System.out.println("var1:"+var1+"\t"+"var2: "+var2);
		}
	}
}
/* ��°�
var1:126	var2: 126
var1:127	var2: 127
var1:-128	var2: 128
var1:-127	var2: 129
var1:-126	var2: 130
*/