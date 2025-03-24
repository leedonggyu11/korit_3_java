package ch11_access_modifier;

import java.util.Scanner;

public class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public void showInfo() {
        System.out.println(accountHolder + " 님의 계좌번호는 " +
                accountNum + "이며, 현재 잔액은 " + balance + "원입니다.");
    }

    // deposit(int amount, int inputPin) -> call2()
    public void deposit(int amount, int inputPin) {
        if (inputPin == pinNumber) { // 계좌비밀번호와 argument 로 입력한 비밀번호가 일치
            // amount가 0 초과인지 확인하는 조건문을 작성하시오.
            if (amount > 0) {
                // balance에 amount만큼 값을 더하고, 그리고 현재 잔액을 출력하는 출력문을 작성
                balance += amount;  // balance = balance + amount;
                System.out.println("입금 성공! 현재 잔액 " + balance);
            } else {
                System.out.println("불가능한 입금 금액입니다.");
                return;
            }
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
            return;         // 메서드 종료
        }
    }

    public void withdraw(int amount, int inputPin) {
        // 비밀번호가 맞는지 체크 -> 1차 -> 베끼면 되고


        if (inputPin == pinNumber) {
            // amount가 0 초과인지 체크 -> 2차 -> 베끼면 되고
            if(amount > 0) {
                // balance - amount가 0이상인지 체크 -> 3차 -> 1-3차까지 다 통과해야 출금 성공 -> 작성해야합니다.
                int charge = balance - amount;
                if(charge >= 0) {
//                    balance = charge;
                    balance -= amount;
                    System.out.println("출금 성공! 현재 잔액 : " + balance );
                } else {
                    System.out.println("잔액이 부족합니다.");
                    return;
                }
            } else {
                System.out.println("불가능한 출금 금액입니다.");
                return;
            }
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
    }
}