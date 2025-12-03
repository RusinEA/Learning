package ru.netology.service;

public abstract class Account {

    protected long balance = 0;

    public void setBalance(long balance) {
        this.balance = balance;
    }

    protected long getBalance() {
        return balance;
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount){
        if (pay(amount)){
            if (account.add(amount)){
                return true;
            }
            add(amount);
        }
        return false;
    }



}
