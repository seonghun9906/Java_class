package ch12_classes.ex05;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
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
        while (run) {
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
            }else{
                System.out.println("존재하지 않은 계좌번호 입니다.");
            }
        }
    }

    public void transfer() {
        boolean run = true;
        int num1 = 0;
        String a = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        while (run) {
            System.out.println("1. 계좌이체 기능 | 2. 종료");
            num1 = sc.nextInt();
            if (num1 == 1) {
                System.out.print("보내는 계좌번호 > ");
                String sender = sc.next();
                System.out.print("받는 계좌번호 > ");
                String reciver = sc.next();
                if (!Objects.equals(sender, reciver)) {
                    System.out.print("보낼 돈 > ");
                    long Money = sc.nextLong();
                    System.out.println("받으실분이 " + reciver + " 님이 맞습니까? ");
                    System.out.println("맞으면 1번 틀리면 2번을 눌러주세요");
                    int num = sc.nextInt();
                    if (num == 1) {
                        System.out.print("비밀번호를 입력해주세요. >");
                        String Pw = sc.next();
                        boolean accountNumCheck = bankRepository.accountNumCheck(sender, reciver, Pw, Money, a);
                        if (accountNumCheck) {
                            System.out.println("이체가 완료되었습니다.");
                        } else {
                            System.out.println("이체에 실패 하였습니다.");
                        }
                    } else if (num == 2) {
                        System.out.println(" 처음부터 다시 입력해 주세요.");
                    }
                } else {
                    System.out.println("보내는 분과 받는분의 계좌가 일치합니다. 다른 계좌번호를 입력해주세요.");
                }
            } else if (num1 == 2) {
                run = false;
            }
        }
    }
}



