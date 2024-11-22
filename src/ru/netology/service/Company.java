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
            System.out.println(taxCalcEarn.calcTaxFor(debit, credit));
        } else if (getTaxSystem().equals("TaxEarningsMinusSpend")) {
            System.out.println(taxCalcEarnMinusSpend.calcTaxFor(debit, credit));
        }
    }


}
