package me.goral.javaIntro.bankAssigment;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Person, CheckingAccount> customers = new HashMap<>();
    final double overdrawAmount = -1200;

    public Bank() {
    }

    public void openCheckingAccount(Person p, double initialDeposit){
        if (initialDeposit >= 100){
            customers.put(p, new CheckingAccount(initialDeposit));
            System.out.println("Welcome in the Bank");
        } else System.out.println("Not enough initial deposit money");
    }

    public void deposit(Person p, double amount){
        customers.get(p).depositMoney(amount);
    }

    public void withdraw(Person p, double amount){
        if (checkOverride(p, amount)) {
            customers.get(p).withdrawMoney(amount);
        }
    }

    public void checkBalance(Person p){
        double balance = customers.get(p).getBalance();
        System.out.println("Your balance is: " + String.format("%.2f",balance));
    }

    private boolean checkOverride(Person p, double a){
        double balance = customers.get(p).getBalance();
        if ((balance - a) < overdrawAmount){
            System.out.println("You will reach your overdraw limit. Cancelling action.");
            return false;
        }
        return true;
    }
}
