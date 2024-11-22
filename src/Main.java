import ru.netology.service.Company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("asdf", "TaxEarningsMinusSpend");
        company.shiftMoney(1000);
        company.shiftMoney(-100);
        company.payTaxes();

        //TaxEarningsMinusSpend
        //TaxEarnings
    }


}

