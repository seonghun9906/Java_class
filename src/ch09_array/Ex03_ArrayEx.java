package ch09_array;

import java.util.Scanner;

public class Ex03_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 3인 정수형 배열을 선언하고
         * 실행 했을 때 스캐너로 정수값을 입력받아 배열에 저장
         * 배열에 저장된 값의 총합, 평균 계산
         */
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int avg = 0;
        int[] num = new int[3];

        System.out.println("숫자를 입력하세요. : ");

        for (int i = 0; i <num.length ; i++) {
            num[i] = sc.nextInt(); //입력받은 값을 배열에 저장하는 과정
            sum += num[i];
            avg = sum / num.length;
        }
            System.out.println("합계는 " + sum + "입니다.");
            System.out.println("평균은 " + avg + "입니다.");
    }
}
