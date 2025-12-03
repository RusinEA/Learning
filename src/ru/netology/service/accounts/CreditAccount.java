package ru.netology.service.accounts;
import ru.netology.service.Account;

public class CreditAccount extends Account {

    private int maxCredit;

    public CreditAccount(int maxCredit) {
        this.maxCredit = maxCredit;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount <= 0){
        balance += amount;
        return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount){
        if (balance - amount > maxCredit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
