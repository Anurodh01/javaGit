package org.example;

import java.util.concurrent.TimeUnit;

public class BankAccount {
    private double balance;
    private double minimumBalance;
    private String holderName;

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public BankAccount(double balance, double minimumBalance){
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double withdrawMoney(double amount){
        if((balance- amount) > minimumBalance){
            return balance- amount;
        }else{
            throw new RuntimeException("InSufficient Balance!");
        }
    }
    public double depositMoney(double amount) throws InterruptedException{
        TimeUnit.MILLISECONDS.sleep(2);
        return balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
}
