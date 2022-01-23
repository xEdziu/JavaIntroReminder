package me.goral.javaIntro.bankAssigment;

//assignment 4 - Bank Management Program
public class Main {
    public static void main(String[] args){
        Bank bank = new Bank();
        Person me = new Person("Adrian", "Max", "Goral", 20, 321321321);
        System.out.println(me.getAge());
        me.birthDay();
        System.out.println(me.getFirstName() + " " + me.getLastName());
        System.out.println(me.getAge());
        bank.openCheckingAccount(me, 1000);
        bank.checkBalance(me);
        bank.deposit(me, 200.55);
        bank.checkBalance(me);
        bank.withdraw(me, 1500);
        bank.checkBalance(me);
        bank.withdraw(me, 1000);
        bank.checkBalance(me);
    }
}
