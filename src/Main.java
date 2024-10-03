import java.util.Scanner;
import ru.netology.service.Taxes;

public class Main {
    public static void main(String[] args) {
        //Создаем scanner - объект, который будет считывать из стандартного потока ввода/вывода (console)
        Scanner scanner = new Scanner(System.in);

        int earnings = 0;    // доходы
        int spendings = 0;   // расходы

        //Цикл будет работать, пока пользователь не введет `end`
        while (true) {
            // Выводим информацию о возможных операциях пользователю
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Подобрать систему налогообложения на основе введённых данных");

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
                        if (Taxes.taxEarnings(earnings) > Taxes.taxEarningsMinusSpendings(earnings, spendings)){
                            System.out.println("___________________________________________________________");
                            System.out.println("Вам подходит форма налогообложения УСН доходы минус расходы");
                            System.out.println("___________________________________________________________");
                            System.out.println("Ваш налог составит: " + Taxes.taxEarningsMinusSpendings(earnings, spendings));
                            System.out.println("Налог на другой системе: " + (Taxes.taxEarnings(earnings)));
                            System.out.println("Экономия составит: " + (Taxes.taxEarnings(earnings) - Taxes.taxEarningsMinusSpendings(earnings, spendings)));
                            break;
                        }
                        else {
                            System.out.println("_____________________________________________");
                            System.out.println("Вам подходит форма налогообложения УСН доходы");
                            System.out.println("_____________________________________________");
                            System.out.println("Ваш налог составит: " + Taxes.taxEarnings(earnings));
                            System.out.println("Налог на другой системе: " + (Taxes.taxEarningsMinusSpendings(earnings, spendings)));
                            System.out.println("Экономия составит: " + (Taxes.taxEarningsMinusSpendings(earnings, spendings) - Taxes.taxEarnings(earnings)));
                            break;
                        }
                    }
                default:
                    System.out.println("Такой операции нет");
            }

        }
        System.out.println("Программа завершена!");
    }
}
