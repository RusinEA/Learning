package ru.netology.service;

import ru.netology.service.taxes.TaxEarningMinusSpend;
import ru.netology.service.taxes.TaxEarnings;

public class Company{
    String title;
    int debit = 0;
    int credit = 0;
    String taxSystem;

    public Company(String title, String taxSystem){
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount){
        if (amount > 0) {
            this.debit += amount;
        } else if (amount < 0){
            this.credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(String taxSystem) {
        this.taxSystem = taxSystem;
    }

    public String getTaxSystem (){
        return taxSystem;
    }

    TaxEarnings taxCalcEarn = new TaxEarnings();
    TaxEarningMinusSpend taxCalcEarnMinusSpend = new TaxEarningMinusSpend();

    public void payTaxes(){
        if (getTaxSystem().equals("TaxEarnings")){
            System.out.println("Компания " + title + " уплатила налог в размере:" + taxCalcEarn.calcTaxFor(debit, credit) + "руб.");
        } else if (getTaxSystem().equals("TaxEarningsMinusSpend")) {
            System.out.println("Компания " + title + " уплатила налог в размере:" + taxCalcEarnMinusSpend.calcTaxFor(debit, credit) + "руб.");
        }
        this.debit = 0;
        this.credit = 0;
    }


}
