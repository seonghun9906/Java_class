package ch07_while;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int num1 = 0;
        int sum = 0;
        double avg = 0;


        while (true) {
            sum = 0;
            count = 0;
            System.out.println("점수를 입력하고 마지막에 0을 입력하세요. : ");
            while ((num1 = sc.nextInt()) != 0) {
                sum += num1;
                count++;
            }
            avg =(double) sum / count;
            System.out.println("평균 " + avg + "입니다.");
            System.out.println("입력한 숫자는 " + count + "개 입니다.");
        }
    }
}





