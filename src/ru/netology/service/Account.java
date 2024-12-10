package ru.netology.service;

public abstract class Account {

    protected long balance;

    public void setBalance(long balance) {
        this.balance = balance;

    }

    long getBalance() {
        return balance;
    }

    boolean add(long amount){

        return false;
    }

    boolean pay(long amount){

        return false;
    }

    boolean transfer(Account account, long amount){

        return false;

    }



}
