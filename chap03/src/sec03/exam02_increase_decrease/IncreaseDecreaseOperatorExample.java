package sec03.exam02_increase_decrease;
// 증감 연산자
public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------");
		x++;	// 11
		++x;	// 12  단독으로 있기 떄문에 그냥 +1 이라고 생각하면 된다.
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
		// 기존 x = 14+1, y는 8로 15+8=23=z 가 되고, 연산 후 y=9
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
/* 출력값
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