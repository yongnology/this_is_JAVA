package sec06.exam07_array_copy;
// System.arraycoly()�� �迭 ����
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
/* ��°�
java, array, copy, null, null,
*/

// 3���� ���簡 �Ǿ� �ְ�, 3,4��° �迭�� �⺻�� null���� �ִ�.