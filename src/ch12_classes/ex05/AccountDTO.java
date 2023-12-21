package ch12_classes.ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccountDTO {
    public Long id;
    public String accountNumber;
    public long deposit;
    public long withdraw;
    public String bankKingAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public long getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(long withdraw) {
        this.withdraw = withdraw;
    }

    public String getBankKingAt() {
        return bankKingAt;
    }

    public void setBankKingAt(String bankKingAt) {
        this.bankKingAt = bankKingAt;
    }
    public  AccountDTO(){

    }
    public static Long idValue = 1L;
    public AccountDTO(String accountNumber, long deposit, long withdraw, String bankKingAt) {
        this.id = idValue;
        this.accountNumber = accountNumber;
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.bankKingAt = bankKingAt;
    }

    public AccountDTO(long deposit){
        this.deposit = deposit;
        this.bankKingAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    @Override
    public String toString() {
        return "AccountDTO{" +
                " 관리 id=" + id +
                ", 계좌번호 ='" + accountNumber + '\'' +
                ", 입금 내역 =" + deposit +
                ", 출금 내역 =" + withdraw +
                ", 거래 시간 ='" + bankKingAt + '\'' +
                '}';
    }
}
