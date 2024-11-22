import ru.netology.service.Company;
import ru.netology.service.taxes.TaxEarnings;
import ru.netology.service.taxes.TaxEarningMinusSpend;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("Рога и копыта", new TaxEarningMinusSpend());
        company.shiftMoney(1000);
        company.shiftMoney(-100);
        company.payTaxes();

        company.setTaxSystem(new TaxEarnings());
        company.shiftMoney(1000);
        company.shiftMoney(-100);
        company.payTaxes();
    }
}

