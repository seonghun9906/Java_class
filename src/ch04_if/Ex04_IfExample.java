package ch04_if;

import java.util.Scanner;

public class Ex04_IfExample {

	public static void main(String[] args) {
		/**
		 * 중첩 if문을 적용한 학점 출력
		 * 100점을 초과하거나 0점 미만의 점수를 입력하면 '입력범위를 초과하였습니다.'출력
		 * 0~100점 사이의 값을 입력했다면 앞의 예제에서 했던 학점 출력을 진행함.
		 * 단, 각 조건마다 학점값을 출력하는 것이 아니라 학점 출력을 위한 print 문장은 한 번만 사용
		 */
		
		int score = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
		
		score = scanner.nextInt();
		String pack = "";
		
		if(score <= 100 && score >= 0) {
			if(score >= 90) {
				pack = "A";				
			} else if (score >= 80) {
				pack = "B";
			} else if (score >= 70) {
				pack = "C";
			} else if (score >= 60) {
				pack = "D";
			} else {
				pack = "F";		
			}
		} else {
			System.out.println("입력범위를 초과하였습니다.");
		}System.out.println(pack);
		
	}
			
}
// if (score > 100 || score <0){
//	
// else {
//	System.out.println("입력범위를 초과하였습니다.");
//}
