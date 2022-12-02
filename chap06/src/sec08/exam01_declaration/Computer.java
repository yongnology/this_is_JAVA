package sec08.exam01_declaration;

// 매개 변수의 수를 모를 경우
public class Computer {
	public int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i< values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i< values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
