package ch11_classes.ex01;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean run = true;
        //StudentService 클래스 객체 선언
        StudentService studentService = new StudentService();


        while (run) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("1.method1 호출 | 2.method2 호출 | 3.method3 호출 | 4.method4 호출 | 5.method5 호출 | 0.종료");
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("선택 > ");
            num = sc.nextInt();
            if (num == 1) {
                System.out.println("메서드 호출 전");
                studentService.method1();
                System.out.println("메서드 호출 후");


            } else if (num == 2) {
                studentService.method2();

            } else if (num == 3) {
                studentService.method3();

            } else if (num == 4) {
                studentService.method4();
            } else if (num == 5) {
                studentService.method5();
            } else if (num == 0) {
                run = false;
            }
        }
    }
}
