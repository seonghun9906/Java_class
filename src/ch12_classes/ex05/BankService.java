package ch12_classes.ex05;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BankService {
    Scanner sc = new Scanner(System.in);
    BankRepository bankRepository = new BankRepository();

    public void save() {
        System.out.println("신규계좌 등록");
        System.out.print("이름 > ");
        String name = sc.next();
        System.out.print("희망하는 계좌번호 > ");
        String accountNum = sc.next();
        System.out.print("계좌 비밀번호 > ");
        String accountNumPw = sc.next();

        boolean savecheck = bankRepository.saveCheck(accountNum);
        if (!savecheck) {
            ClientDTO clientDTO = new ClientDTO(name, accountNum, accountNumPw);
            boolean save = bankRepository.save(clientDTO);
            if (save) {
                System.out.println("계좌 등록이 완료 되었습니다.");
                System.out.println(clientDTO);
            } else {
                System.out.println("알 수없는 오류로 계좌 등록에 실패하였습니다.");
            }
        } else {
            System.out.println("계좌번호가 중복되어 다른 계좌번호를 입력 해주시길 바랍니다.");
        }
    }

    public void Balance() {
        System.out.println("잔액을 확인 하기 위하여 확인하고 싶은 계좌번호를 입력해주세요.");
        System.out.print("계좌번호 입력 > ");
        String accountNum = sc.next();

        boolean balanceCheck = bankRepository.saveCheck(accountNum);
        if (balanceCheck) {
            bankRepository.balance(accountNum);
        } else {
            System.out.println("존재하지 않은 계좌번호 입니다.");
        }

    }

    public void deposit() {
        System.out.println("입금하려는 계좌번호를 입력해 주세요.");
        System.out.print("계좌번호 입력 > ");
        String accountNum = sc.next();

        boolean depositNum = bankRepository.saveCheck(accountNum);
        if (depositNum) {
            System.out.println("입금할 금액을 입력해 주세요.");
            System.out.print("입금 금액 > ");
            long deposit = sc.nextInt();
            String at = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            bankRepository.deposit(accountNum, deposit, at);
        } else {
            System.out.println("계좌가 존재하지 않습니다.");
        }
    }

    public void withdraw() {
        System.out.println("출금하려는 계좌번호와 비밀번호를 입력해주세요");
        System.out.print("계좌번호 입력 > ");
        String accountNum = sc.next();
        System.out.print("비밀번호 입력 > ");
        String accountPw = sc.next();
        boolean withDrawNum = bankRepository.withDrawCheck(accountNum, accountPw);
        if (withDrawNum) {
            System.out.println("출금할 금액을 입력해 주세요.");
            System.out.print("출금 금액 > ");
            long withDraw = sc.nextInt();
            String a = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            bankRepository.withDraw(accountNum, withDraw, a);
        } else {
            System.out.println("계좌가 존재하지 않습니다.");
        }
    }
    public void detail() {
       boolean run = true;

           System.out.println("-----------");
           System.out.println("계좌번호 입력");
           System.out.println("-----------");
           String accountNum = sc.next();
       while(run) {
           boolean accountNum1 = bankRepository.saveCheck(accountNum);
           if (accountNum1) {
               System.out.println("------------------------------------------------------");
               System.out.println("1. 전체 내역 조회 | 2. 입금 내역 조회 | 3. 출금 내역 조회 | 4. 종료");
               System.out.println("------------------------------------------------------");
               int selectNum = sc.nextInt();

               if (selectNum == 1) {
                   bankRepository.List(accountNum);
               } else if (selectNum == 2) {
                   bankRepository.depositDetail(accountNum);
               } else if (selectNum == 3) {
                   bankRepository.withDrawDetail(accountNum);
               } else if (selectNum == 4) {
                   run = false;
               }
           }
       }
    }

}



