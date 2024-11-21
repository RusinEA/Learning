import ru.netology.service.taxes.PrintTaxes;

import java.util.Scanner;

public class NetologyHW4 {
    public static void main(String[] args) {
        //Создаем scanner - объект, который будет считывать из стандартного потока ввода/вывода (console)
        Scanner scanner = new Scanner(System.in);

        int earnings = 0;    // доходы
        int spendings = 0;   // расходы

        //Цикл будет работать, пока пользователь не введет `end`
        while (true) {
            // Выводим информацию о возможных операциях пользователю
            PrintTaxes.prntMessages();
            String input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            }

            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String spentStr = scanner.nextLine();
                    int spent = Integer.parseInt(spentStr);
                    spendings += spent;
                    break;
                case 3:
                    if (earnings <= 0) {
                        System.out.println("Доходы не были введены");
                        break;
                    }
                    else {
                        PrintTaxes.taxCompare(earnings, spendings);
                        break;
                    }
                default:
                    System.out.println("Такой операции нет");
            }

        }
        System.out.println("Программа завершена!");
    }
}
