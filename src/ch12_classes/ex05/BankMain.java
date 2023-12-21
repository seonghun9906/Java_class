package ch12_classes.ex05;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        Scanner sc = new Scanner(System.in);
        int selectNum = 0;
        boolean run = true;


        while (run) {
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("1. 신규계좌 등록 | 2. 잔액 조회 | 3. 입금 | 4. 출금 | 5. 입출금 내역 조회 | 6. 계좌이체 | 0. 종료 ");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.print("서비스 번호 입력 > ");
            selectNum = sc.nextInt();

            if (selectNum == 1) {
                bankService.save();
            } else if (selectNum == 2) {
                bankService.Balance();
            } else if (selectNum == 3) {
                bankService.deposit();
            } else if (selectNum == 4) {
                bankService.withdraw();
            } else if (selectNum == 5) {
                bankService.detail();
            } else if (selectNum == 6) {
                bankService.transfer();
            } else if (selectNum == 0) {
                run = false;
            }
        }
    }
}
