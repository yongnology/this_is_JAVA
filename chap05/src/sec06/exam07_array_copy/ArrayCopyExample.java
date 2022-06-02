package sec06.exam07_array_copy;
// System.arraycoly()로 배열 복사
public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+", ");
		}
	}

}
/* 출력값
java, array, copy, null, null,
*/

// 3개가 복사가 되어 있고, 3,4번째 배열은 기본값 null값이 있다.