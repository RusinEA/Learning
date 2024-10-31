import java.util.Scanner;

import ru.netology.service.LeapYear;

public class NetologyHW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rightAnswer = 0;
        while (true) {
            System.out.println("Введите год в формате yyyy");
            int year = scanner.nextInt();

            System.out.println("Введите количество дней");
            int count = scanner.nextInt();

            if (LeapYear.calculateLeapYear(year, count)) {
                System.out.println("Верно");
                rightAnswer++;
            } else {
                System.out.println("Не верно!");
                System.out.println("В этом году " + LeapYear.countDays(year) + " дней");
                System.out.println("Количество верных ответов: " + rightAnswer);
                break;
            }

        }

    }
}
