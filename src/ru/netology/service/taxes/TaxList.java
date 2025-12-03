package ru.netology.service.taxes;

public class TaxList {
    public static int taxEarnings(int debit) {
        return (debit * 6) / 100;
    }

    public static int taxEarningsMinusSpendings(int debit, int credit) {
        int tax = (debit - credit) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }
}
