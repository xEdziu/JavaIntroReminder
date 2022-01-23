package me.goral.javaIntro.bankAssigment;

public class CheckingAccount {
    private double balance;

    public CheckingAccount(double a) {
        this.balance = a;
    }

    public void withdrawMoney(double amount){
        this.balance -= amount;
    }

    public void depositMoney(double amount){
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
