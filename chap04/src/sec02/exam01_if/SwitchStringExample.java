package sec02.exam01_if;
// String 타입의 Switch문
public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장": // 이것이 선택됨
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
	}

}
/* 출력값
500만원
*/