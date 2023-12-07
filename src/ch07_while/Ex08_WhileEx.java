package ch07_while;

import java.util.Scanner;

public class Ex08_WhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num = 0; // 기능선택
        int money = 0; // 예금
        int money1 = 0; //잔고
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
                        System.out.println("입금이 완료되었습니다.");
                        System.out.println("현재잔액은" + money1 + "입니다.");
                    } else if (num == 2) {
                        System.out.print("출금액 >");
                        money = sc.nextInt();
                        money1 -= money;
                        if(money1 < 0) {
                            System.out.println("잔고가 부족합니다. 출금 서비스를 종료합니다.");
                            System.out.println("메뉴를 다시 열어주세요.");
                            run = false;
                        }else{
                            System.out.println("출금이 완료되었습니다.");
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

