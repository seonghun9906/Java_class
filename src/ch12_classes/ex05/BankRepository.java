package ch12_classes.ex05;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BankRepository {
    List<ClientDTO> clientDTOList = new ArrayList<>();
    List<AccountDTO> bankingList = new ArrayList<>();

    public boolean saveCheck(String accountNum) {
        boolean result = false;
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNum.equals(clientDTO.getAccountNumber())) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean save(ClientDTO clientDTO) {
        return clientDTOList.add(clientDTO);
    }

    public boolean balance(String accountNum) {
        boolean result = false;
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNum.equals(clientDTO.getAccountNumber())) {
                System.out.println("현재 잔액은 " + clientDTO.getBalance() + " 원 입니다.");
                result = true;
                break;
            }
        }
        return result;
    }

    public void deposit(String accountNumber, long deposit, String at) {
        long accountBalanceA = 0;
        long accountBalanceB = 0;

        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNumber.equals(clientDTO.getAccountNumber())) {
                accountBalanceA = clientDTO.getBalance();
                accountBalanceB = accountBalanceA + deposit;
                clientDTO.setBalance(accountBalanceB);

                //입출금 과정 accountDTO에 저장하는 과정
                AccountDTO accountDTO = new AccountDTO(accountNumber, deposit, 0, at);
                bankingList.add(accountDTO);
                System.out.println("입금되었습니다. 현재 잔액은 " + clientDTO.getBalance() + " 원 입니다. " + at);
                break;
            }
        }
    }

    public boolean withDrawCheck(String accountNum, String accountPw) {
        boolean result = false;
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNum.equals(clientDTO.getAccountNumber()) && accountPw.equals(clientDTO.getClientPass())) {
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

        for (ClientDTO clientDTO : clientDTOList) {
            if (clientDTO.getBalance() >= withDraw) {
                if (accountNumber.equals(clientDTO.getAccountNumber())) {
                    accountBalanceA = clientDTO.getBalance();
                    accountBalanceB = accountBalanceA - withDraw;
                    clientDTO.setBalance(accountBalanceB);
                    System.out.println("출금되었습니다. 현재 잔액은 " + clientDTO.getBalance() + " 원 입니다. " + a);
                    //입출금 과정 accountDTO에 저장하는 과정
                    AccountDTO accountDTO = new AccountDTO(accountNumber, 0, withDraw, a);
                    bankingList.add(accountDTO);
                    break;
                }
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        }
    }

    public void List(String accountNum) {
        for (AccountDTO accountDTO : bankingList) {
            if (accountNum.equals(accountDTO.getAccountNumber())) {
                System.out.println(accountDTO);

            }
        }
    }

    public void depositDetail(String accountNum) {
        for (AccountDTO accountDTO : bankingList) {
            if (accountNum.equals(accountDTO.getAccountNumber())) {
                if (accountDTO.getDeposit() > 0) {
                    System.out.println("입금 : " + accountDTO.getDeposit() + " " + accountDTO.getBankKingAt());
                }
            }

        }
    }

    public void withDrawDetail(String accountNum) {
        for (AccountDTO accountDTO : bankingList) {
            if (accountNum.equals(accountDTO.getAccountNumber())) {
                if (accountDTO.getWithdraw() > 0) {
                    System.out.println("출금 : " + accountDTO.getWithdraw() + " " + accountDTO.getBankKingAt());
                }
            }
        }
    }


    public boolean accountNumCheck(String sender, String reciver, String pw, long money, String a) {
        boolean result = false;
        for (ClientDTO clientDTO : clientDTOList) {
            if (sender.equals(clientDTO.getAccountNumber()) && pw.equals(clientDTO.getClientPass())) {
                if (clientDTO.getBalance() >= money) {
                    long b = clientDTO.getBalance();
                    long c = b - money;
                    clientDTO.setBalance(c);
                    AccountDTO accountDTO = new AccountDTO(sender, 0, money, a);
                    bankingList.add(accountDTO);
                    for (ClientDTO clientDTO1 : clientDTOList) {
                        if (reciver.equals(clientDTO1.getAccountNumber())) {
                            long d = clientDTO1.getBalance();
                            long e = d + money;
                            clientDTO1.setBalance(e);
                            AccountDTO accountDTO1 = new AccountDTO(reciver, money, 0, a);
                            bankingList.add(accountDTO1);
                        }
                    }
                    result = true;
                } else {
                    System.out.println("잔액이 부족합니다.");
                }
            }
        }
        return result;
    }
}








