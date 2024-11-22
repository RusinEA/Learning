package ru.netology.service.taxes;

public class TaxEarnings extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        if (debit > 0) {
            return (debit * 6) / 100;
        }
        else {
            return 0;
        }
    }
}
