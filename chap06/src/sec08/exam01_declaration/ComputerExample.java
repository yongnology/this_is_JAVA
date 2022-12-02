package sec08.exam01_declaration;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		// ���1 �迭�� ����
		// �迭 ������ ����
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1);
		
		// �迭�� ���� ����
		int result2 = myCom.sum1( new int[] {1,2,3});
		System.out.println("result2 : " + result2);
		
		// ���2... ���
		int result3 = myCom.sum2( 1,2,3);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2( 1,2,3,4 ,5);
		System.out.println("result4 : " + result4);
	}
}

// ��°�
/*
result1 : 6
result2 : 6
result3 : 6
result4 : 15
*/