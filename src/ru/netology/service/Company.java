package ru.netology.service;

import ru.netology.service.taxes.TaxEarningMinusSpend;
import ru.netology.service.taxes.TaxEarnings;
import ru.netology.service.taxes.TaxSystem;

public class Company {
    String title;
    int debit = 0;
    int credit = 0;
    TaxSystem taxSystem;

    TaxEarnings taxCalcEarn = new TaxEarnings();
    TaxEarningMinusSpend taxCalcEarnMinusSpend = new TaxEarningMinusSpend();

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

    public TaxSystem getTaxSystem() {
        return taxSystem;
    }

    public void payTaxes() {
        System.out.println("Компания " + title + " уплатила налог в размере:" + taxCalcEarn.calcTaxFor(debit, credit) + "руб.");
        this.debit = 0;
        this.credit = 0;
    }
}

