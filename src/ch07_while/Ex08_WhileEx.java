package ch07_while;

import javax.swing.*;
import java.util.Scanner;

public class Ex08_WhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num = 0;
        int money = 0;
        int money1 = 0;
        int money2 = 0;
        boolean run = true;

        while(run) {
            System.out.println("---------------------------------");
            System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
                System.out.print("선택> ");
                 num = sc.nextInt();
                    if (num == 1) {
                    System.out.print("예금액>");
                    money = sc.nextInt();
                    money1 += money;
                        System.out.println("현재잔액은" + money1 + "입니다.");
                    } else if (num == 2) {
                        System.out.print("출금액 >");
                        money = sc.nextInt();
                        money1 -= money;
                        if(money1 < 0) {
                            System.out.println("잔고가 부족합니다.");
                            run = false;
                        }else{
                        System.out.println("현재잔액은" + money1 + "입니다.");
                        }
                    } else if (num == 3) {
                        System.out.println("현재잔액은" + money1 + "입니다.");
                    } else {
                        run = false;
                        System.out.println("종료합니다.");
                    }
                }
        }
    }

