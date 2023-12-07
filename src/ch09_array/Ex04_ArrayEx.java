package ch09_array;

import java.util.Scanner;

public class Ex04_ArrayEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {5, 2, 1, 3, 4, 7, 6, 9, 10, 8};
        /**
         * 위와 같은 배열이 있을때 1~10 사이의 숫자 중에서 하나를
         * 입력했을 때 그 숫자가 몇 번 인덱스에 있는지 출력
         */

        while (true) {
            System.out.println("1~10 사이의 숫자를 입력하세요 : ");
            int number = sc.nextInt();

            for (int i = 0; i < num.length; i++) {
                if (num[i] == number) {
                    System.out.println("입력한 숫자는 " + (i+1) + " 번째 순서입니다.");
                }
                //보기 쉬우려면 +1을 적어줘야함 (칸수는 넘버링이 0부터 시작하기 때문)
                // num[i]는 배열안의 값이고,
                // number은 입력한 수
                // i 는 몇번쨰인지.
                // 입력한 수와 배열안의 값이 같다면 입력한 숫자의 값이 나와야 하기
            }
        }
    }
}
