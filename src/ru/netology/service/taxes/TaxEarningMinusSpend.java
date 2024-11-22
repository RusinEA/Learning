package ru.netology.service.taxes;

public class TaxEarningMinusSpend extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (debit - credit) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
}
