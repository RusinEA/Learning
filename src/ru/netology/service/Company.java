package ru.netology.service;

import ru.netology.service.taxes.TaxEarningMinusSpend;
import ru.netology.service.taxes.TaxEarnings;
import ru.netology.service.taxes.TaxSystem;

public class Company {
    private String title;
    private int debit = 0;
    private int credit = 0;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            this.debit += amount;
        } else if (amount < 0) {
            this.credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        System.out.println("Компания " + title + " уплатила налог в размере:" + taxSystem.calcTaxFor(debit, credit) + "руб.");
        this.debit = 0;
        this.credit = 0;
    }
}

