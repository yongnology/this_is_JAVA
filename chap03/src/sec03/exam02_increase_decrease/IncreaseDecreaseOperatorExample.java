package sec03.exam02_increase_decrease;
// ���� ������
public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------");
		x++;	// 11
		++x;	// 12  �ܵ����� �ֱ� ������ �׳� +1 �̶�� �����ϸ� �ȴ�.
		System.out.println("x = " + x);
		
		System.out.println("------------------");
		y--;	// y = 9
		--y;	// y = 8
		System.out.println("y = " + y);
		
		System.out.println("------------------");
		z = x++;	// z = 12, x = 13
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("------------------");
		z = ++x;	// z = 14, x = 14 
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("------------------");
		z = ++x + y++;
		// ���� x = 14+1, y�� 8�� 15+8=23=z �� �ǰ�, ���� �� y=9
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
/* ��°�
------------------
x = 12
------------------
y = 8
------------------
z = 12
x = 13
------------------
z = 14
x = 14
------------------
z = 23
x = 15
y = 9
*/