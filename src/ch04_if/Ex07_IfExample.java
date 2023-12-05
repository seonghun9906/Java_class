package ch04_if;

import java.util.Scanner;

public class Ex07_IfExample {

    public static void main(String[] args) {
        // 성적 출력예제 응용
//		입력값 : 학년(year), 점수(score)
//		처리
//		 1~3학년은 60점이이상 합격
//		4학년 70점 이상 합격
        Scanner scanner = new Scanner(System.in);
        System.out.println("학년을 입력하세요 : ");
        System.out.println("점수를 입력하세요 : ");

        int year = scanner.nextInt();
        int score = scanner.nextInt();
        String a = "";


        if (year <= 0 || score < 0) {
            a = "입력범위 초과";
        } else if (year < 4 && score >= 60) {
            a = "합격";
        } else if (year == 4 && score >= 70) {
            a = "합격";
        } else if (year == 4 && score < 70) {
            a = "붏합격";
        } else if (year < 4 && score < 60) {
            a = "불합격";
        } else {
            a = "입력범위 초과";
        }
        System.out.println(a);

    }
}

//		if(year >= 1 && year <= 4 && score >=0 && score <=100){
//			if(score >= 60) {
//				if(year !=4) {
////					1~3학년 합격
//					System.out.println("합격");
//				}else if (score >= 70) {
////					4학년 합격
//					System.out.println("합격");
//				}else {
////					위의 두 조건을 만족하지 안기 때문에 불합격
//					System.out.println("불합격");
//				}
//			}else {
//			System.out.println("불합격")
// 	}else {
//			System.out.println("불합격");
//	}

//		}
//
//

