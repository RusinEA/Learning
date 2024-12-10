package ru.netology.service;

public class CreditAccount {

    boolean add(long amount){
        if (getBalance() >= 0) {
            setBalance += amount;
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
