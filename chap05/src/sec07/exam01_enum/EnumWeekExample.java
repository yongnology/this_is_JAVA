package sec07.exam01_enum;
//열거 타입과 열거 상수

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// 일(1) ~ 토(7)까지의 숫자를리턴
		System.out.println(week);
		
		switch(week) {
			case 1:
				today=Week.SUNDAY;
				break;
			case 2:
				today=Week.MONDAY;
				break;
			case 3:
				today=Week.TUESDAY;
				break;
			case 4:
				today=Week.WENDSDAY;
				break;
			case 5:
				today=Week.THURSDAY;
				break;
			case 6:
				today=Week.FRIDAY;
				break;
			case 7:
				today=Week.SATURDAY;
				break;
		}
		System.out.println("오늘 요일 : " + today);
		
		if(today==Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}

}
/* 출력값
3
오늘 요일 : TUESDAY
열심히 자바 공부합니다.
*/