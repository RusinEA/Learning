package ru.netology.service.taxes;

import static ru.netology.service.taxes.TaxSystem.taxEarnings;
import static ru.netology.service.taxes.TaxSystem.taxEarningsMinusSpendings;

public class PrintTaxes {
    public static void taxCompare(int earnings, int spendings) {

        int txEarn = taxEarnings(earnings);
        int txEarnMinsSpend = taxEarningsMinusSpendings(earnings, spendings);

        if (txEarn > txEarnMinsSpend) {
            System.out.println("___________________________________________________________");
            System.out.println("Вам подходит форма налогообложения УСН доходы минус расходы");
            System.out.println("___________________________________________________________");
            System.out.println("Ваш налог составит: " + taxEarningsMinusSpendings(earnings, spendings));
            System.out.println("Налог на другой системе: " + (taxEarnings(earnings)));
            System.out.println("Экономия составит: " + (taxEarnings(earnings) - taxEarningsMinusSpendings(earnings, spendings)));
        } else if (txEarn == txEarnMinsSpend){
            System.out.println("_____________________________________________");
            System.out.println("Выбирайте любую систему налогообложения");
            System.out.println("_____________________________________________");
            System.out.println("Ваш налог составит: " + txEarn);
            System.out.println("Налог на другой системе: " + txEarnMinsSpend);
            System.out.println("Экономия составит: " + (txEarnMinsSpend - txEarn));
        }
        else{
            System.out.println("_____________________________________________");
            System.out.println("Вам подходит форма налогообложения УСН доходы");
            System.out.println("_____________________________________________");
            System.out.println("Ваш налог составит: " + txEarn);
            System.out.println("Налог на другой системе: " + txEarnMinsSpend);
            System.out.println("Экономия составит: " + (txEarnMinsSpend - txEarn));
        }

    }

    public static void prntMessages() {
        System.out.println();
        System.out.println("Выберите операцию и введите её номер:");
        System.out.println("1. Добавить новый доход");
        System.out.println("2. Добавить новый расход");
        System.out.println("3. Подобрать систему налогообложения на основе введённых данных");
        System.out.println("Или введите слово end для завершения программы");
    }
}
