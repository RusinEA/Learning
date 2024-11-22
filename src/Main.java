import ru.netology.service.Company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("Рога и копыта", "TaxEarningsMinusSpend");
        company.shiftMoney(1000);
        company.shiftMoney(-100);
        company.payTaxes();

        company.setTaxSystem("TaxEarnings");
        company.shiftMoney(5000);
        company.shiftMoney(-100);
        company.payTaxes();
        //TaxEarningsMinusSpend
        //TaxEarnings
    }


}

