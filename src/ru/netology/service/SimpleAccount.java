package ru.netology.service;

public class SimpleAccount extends Account{

    private long balance = 0;

    public SimpleAccount(long amount) {
        super(balance);
    }

    boolean add(long amount){
        if (balance >= 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    boolean pay(long amount){
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    boolean transfer(Account account, long amount){
        if (balance >= amount) {

            return true;
        }
        return false;

    }

    long getBalance() {
        return balance;
    }

}
