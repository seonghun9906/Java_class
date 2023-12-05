package ch06_for;

import java.util.Scanner;

public class Ex07_ForEx {
    public static void main(String[] args) {
        /**
         * 중첩 for문
         */
//        System.out.println("바깥 for문 시작");
//        for (int i = 1; i <= 2; i++) {
//            System.out.println("안쪽 for문 시작");
//            for (int j = 1; j <= 3 ; j++) {
//                System.out.print("j = " + j);
//                System.out.println("   i = " + i);
//            }
//            System.out.println("안쪽 for문 종료");
//        }
//        System.out.println("바깥 for문 종료");

        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단 확인을 위하여 숫자 를 입력하세요. : ");
        int num1 = scanner.nextInt();



        for (int i = num1; i == num1; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + (j*i));

            }

        }



    }
}
