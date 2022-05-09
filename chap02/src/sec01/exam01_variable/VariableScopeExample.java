package sec01.exam01_variable;
// 변수의 사용 범위
public class VariableScopeExample {

	public static void main(String[] args) {
		int var1;
		
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
		}
		var1 = 10;
		//var2 = 20;	// 에러
		
		for(int i =0; i<1; i++) {
			int var3;
			
			var1 = 10;
			var3 = 30;
		}
		var1 = 10;
		//var3 = 30;	// 에러
	}
}
