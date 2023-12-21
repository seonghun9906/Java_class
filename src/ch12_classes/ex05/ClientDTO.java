package ch12_classes.ex05;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientDTO {
    public Long id;
    public String clientName;
    public String accountNumber;
    public String clientPass;
    public String clientCreatedAt;
    public long balance;

    public ClientDTO(String name, String accountNum, String accountNumPw) {
        this.id = idValue++;
        this.clientName = name;
        this.accountNumber = accountNum;
        this.clientPass = accountNumPw;
        this.clientCreatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClientPass() {
        return clientPass;
    }

    public void setClientPass(String clientPass) {
        this.clientPass = clientPass;
    }

    public String getClientCreatedAt() {
        return clientCreatedAt;
    }

    public void setClientCreatedAt(String clientCreatedAt) {
        this.clientCreatedAt = clientCreatedAt;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(long accountBalanceB) {
        this.balance = accountBalanceB;
    }


    public ClientDTO() {

    }

    public static Long idValue = 1L;

    public ClientDTO(String clientName, String accountNumber, String clientPass, Long balance) {
        this.id = idValue++;
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.clientPass = clientPass;
        this.clientCreatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", clientPass='" + clientPass + '\'' +
                ", clientCreatedAt='" + clientCreatedAt + '\'' +
                ", balance=" + balance +
                '}';
    }

}