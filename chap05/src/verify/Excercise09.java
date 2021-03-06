package verify;

import java.util.Scanner;

public class Excercise09 {

	public static void main(String[] args) {
		boolean run = true; // while문의 괄호
		int studentNum = 0; // 학생수
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2){
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = scanner.nextInt();
				}
			} else if(selectNo == 3){
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]> " + scores[i]);
				}
				
			} else if(selectNo == 4){
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i< scores.length; i++) {
					max = (max<scores[i]) ? scores[i]:max;
					sum += scores[i];
				}
				avg = (double)sum / studentNum;
				
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg);
			} else if(selectNo == 5){
				run = false;
				
			}
		}
			System.out.println("프로그램 종료");
			
		
	}
}
/* 출력값
-------------------------------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
-------------------------------------------
선택> 1
학생수> 3
-------------------------------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
-------------------------------------------
선택> 2
scores[0]> 85
scores[1]> 95
scores[2]> 93
-------------------------------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
-------------------------------------------
선택> 3
scores[0]> 85
scores[1]> 95
scores[2]> 93
-------------------------------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
-------------------------------------------
선택> 4
최고점수 : 95
평균점수 : 91.0
-------------------------------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
-------------------------------------------
선택> 5
프로그램 종료
*/