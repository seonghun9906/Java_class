package ch04_if;

import java.util.Scanner;

public class Ex05_IfExample {

    public static void main(String[] args) {
        // 정수 하나를 입력 받아서 양수, 음수, 0 인지를 출력
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를입력하세요 : ");


        int number = scanner.nextInt();

        String a = "";

        if (number > 0) {
            a = "양수";
        } else if (number == 0) {
            a = "0";
        } else {
            a = "음수";
        }
        System.out.println(a);

    }

}
