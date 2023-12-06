package ch07_while;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {
        /**
         * random() 메서드를 이용해서 1~100 사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출 때까지 계속 숫자를 입력받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력하기.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("UP & Down");

        int a = (int) ((Math.random() * 100) + 10);
        System.out.println(a);

        int check = 0;
        boolean run = true;

        while (run) {
            System.out.print("1부터 100까지의 숫자를 입력하세요. : ");
            int num1 = sc.nextInt();
            if (a == num1) {
                run = false;
                System.out.println("맞췄습니다.");
            } else if (a > num1) {
                System.out.println("더 큰 수를 입력하세요.");
            } else {
                System.out.println("더 작은 수를 입력하세요.");
            }
            check++;
        }
        System.out.println("시도 횟수는 " + check + " 입니다.");
    }
}
