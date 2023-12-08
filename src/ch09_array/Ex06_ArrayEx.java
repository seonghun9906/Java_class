package ch09_array;

import java.util.Scanner;

public class Ex06_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 저장한 뒤
         * 입력된 값 중에서 가장 큰 값을 출력
         */

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int bigNum = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] > bigNum) {
                bigNum = num[i];
            }
        }
        System.out.println(bigNum);
    }
}
