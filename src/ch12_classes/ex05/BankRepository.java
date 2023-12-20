package ch12_classes.ex05;


import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    List<ClientDTO> clientDTOList = new ArrayList<>();
    List<AccountDTO> bankingList = new ArrayList<>();

    public boolean saveCheck(String accountNum) {
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNum.equals(clientDTOList.get(i).getAccountNumber())) {
                result = true;
            }
        }
        return result;
    }

    public boolean save(ClientDTO clientDTO) {
        return clientDTOList.add(clientDTO);
    }

    public boolean balance(String accountNum) {
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNum.equals(clientDTOList.get(i).getAccountNumber())) {
                System.out.println("현재 잔액은 " + clientDTOList.get(i).getBalance() + " 원 입니다.");
                result = true;
                break;
            }
        }
        return result;
    }

    public void deposit(String accountNumber, long deposit, String at) {
        long accountBalanceA = 0;
        long accountBalanceB = 0;

        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                accountBalanceA = clientDTOList.get(i).getBalance();
                accountBalanceB = accountBalanceA + deposit;
                clientDTOList.get(i).setBalance(accountBalanceB);

                //입출금 과정 accountDTO에 저장하는 과정
                AccountDTO accountDTO = new AccountDTO(accountNumber, deposit, 0, at);
                bankingList.add(accountDTO);
                System.out.println("입금되었습니다. 현재 잔액은 " + clientDTOList.get(i).getBalance() + " 원 입니다. " + at);
                break;
            }
        }
    }

    public boolean withDrawCheck(String accountNum, String accountPw) {
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNum.equals(clientDTOList.get(i).getAccountNumber()) && accountPw.equals(clientDTOList.get(i).getClientPass())) {
                result = true;
            } else {
                System.out.println("존재하지 않은 계좌번호 이거나, 비밀번호가 올바르지 않습니다.");
            }
        }
        return result;
    }

    public void withDraw(String accountNumber, long withDraw, String a) {
        long accountBalanceA = 0;
        long accountBalanceB = 0;

        for (int i = 0; i < clientDTOList.size(); i++) {
            if(clientDTOList.get(i).getBalance() >= withDraw){
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                accountBalanceA = clientDTOList.get(i).getBalance();
                accountBalanceB = accountBalanceA - withDraw;
                clientDTOList.get(i).setBalance(accountBalanceB);
                System.out.println("출금되었습니다. 현재 잔액은 " + clientDTOList.get(i).getBalance() + " 원 입니다. " + a);
                //입출금 과정 accountDTO에 저장하는 과정
                AccountDTO accountDTO = new AccountDTO(accountNumber, 0, withDraw, a);
                bankingList.add(accountDTO);
                break;
            }
            }else{
                System.out.println("잔액이 부족합니다.");
            }
        }
    }


    public void depositDetail(String accountNum) {
        for (int i = 0; i < bankingList.size(); i++) {
            if (accountNum.equals(bankingList.get(i).getAccountNumber())) {
                System.out.println(bankingList.get(i).getDeposit() + " " + bankingList.get(i).getBankKingAt());
            }

        }
    }

    public void withDrawDetail(String accountNum) {
        for (int i = 0; i < bankingList.size(); i++) {
            if (accountNum.equals(bankingList.get(i).getAccountNumber())) {
                System.out.println(bankingList.get(i).getWithdraw() + " " + bankingList.get(i).getBankKingAt());

            }
        }
    }

    public void List(String accountNum) {
        for (int i = 0; i < bankingList.size(); i++) {
            if (accountNum.equals(bankingList.get(i).getAccountNumber())) {
                System.out.println(bankingList.get(i));

            }
        }
    }
}

