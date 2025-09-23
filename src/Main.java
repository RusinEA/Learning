import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String dash = "------------------------------------------------------";
        String header = String.format("%-12s %-10s %-10s %-20s", "Дата", "Сумма", "Тип", "Описание");
        System.out.println(header);
        System.out.println(dash);
        System.out.println("%-12s %-10s %-10s %-20s");
        //Скин на цифрового аватара; 3900; EXPENSE; 26.03.2036
    }

}

