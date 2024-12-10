import ru.netology.service.Company;
import ru.netology.service.taxes.TaxEarningMinusSpend;
import ru.netology.service.taxes.TaxEarnings;

public class NetologyHW9 {

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

