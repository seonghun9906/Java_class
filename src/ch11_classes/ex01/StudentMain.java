package ch11_classes.ex01;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean run = true;


        while (run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.method1 호출 | 2.method 호출 | 3.method3 호출 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택 > ");
            num = sc.nextInt();
            if(num == 1){

            } else if (num == 2) {

            }else if (num == 3){

            }else if (num == 4){
                run = false;
            }
        }
    }
}
