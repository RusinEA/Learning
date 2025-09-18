package ru.skillbox;

import java.math.BigDecimal;

public class MainStringFormat {
    public static void main(String[] args) {
        String format = "Здравствуйте, %8s, добро пожаловать!";
        System.out.println(String.format(format, "Алиса"));
        System.out.println(String.format(format, "Олег"));

        String format2 = "Здравствуйте, %-15s, добро пожаловать!";
        System.out.println(String.format(format2, "Алиса"));
        System.out.println(String.format(format2, "Олег"));

        int age = 30;
        String message = String.format("Мне %d лет.", age);
        System.out.println(message); // Вывод: Мне 30 лет.

        double price = 45.678;
        String formattedPrice = String.format("Цена: %.2f руб.", price);
        System.out.println(formattedPrice); // Вывод: Цена: 45.68 руб.

        String multiLine = String.format("Первая строка.%nВторая строка.");
        System.out.println(multiLine);
        // Вывод:
        // Первая строка.
        // Вторая строка.


        //Аргументы форматирования и позиционная индексация
        String firstName = "Алиса";
        String lastName = "Иванова";
        age = 30;
        String formattedString = String.format("Имя: %s %s, Возраст: %d", firstName, lastName, age);
        System.out.println(formattedString);
        // Вывод: Имя: Алиса Иванова, Возраст: 30

//      Здесь %s используется для строк, а %d — для целого числа.
//      Это полезно, если нужно повторно использовать одинаковые аргументы или изменить их расположение в строке, например когда вы работаете с похожими шаблонами. Чаще всего это применяют при создании строк на разных языках, так как правила формирования предложений могут различаться.
//      1. Указание позиции аргумента
        firstName = "Алиса";
        lastName = "Иванова";
        formattedString = String.format("Фамилия, Имя: %2$s, %1$s", firstName, lastName);
        System.out.println(formattedString);
//      Вывод: Фамилия, Имя: Иванова, Алиса
        //Здесь %1$s и %2$s показывают порядок использования аргументов.

//      2. Повторное использование аргументов
//      Позиционная индексация позволяет повторять аргументы, не указывая их повторно:
        String name = "Алиса";
        age = 18;
        formattedString = String.format("%1$s, вам больше %2$d лет. Верно, %1$s?", name, age);
        System.out.println(formattedString);
        // Вывод: Алиса, вам 30 года. Верно, Алиса?
//      Позиционная индексация и работа с несколькими аргументами в String.format()
//      значительно расширяют возможности форматирования,
//      позволяя создавать более сложные структуры строк и упрощая работу с повторяющимися элементами.
//      Это помогает сохранять структурированность больших объёмов информации как в тексте, так и в таблицах.

        //Указание минимальной ширины
        int number = 42;
        String result = String.format("Число: %10d", number);
        System.out.println(result); // Вывод: Число:         42
        //В этом примере строка с числом состоит минимум из десяти символов,
        // а недостающее пространство перед числом заполняют пробелы.

        // Число больше минимальной ширины выводится полностью.
        String pattern = "Число: %5d";
        String result1 = String.format(pattern, 42);
        String result2 = String.format(pattern, 42_000_000);
        System.out.println(result1); // Число:    42
        System.out.println(result2); // Число: 42000000

//      Форматирование с разделителями для тысяч
//      Спецификатор %,d (пробел) упрощает чтение больших чисел при помощи разделителей.
//      Используйте их, когда возвращаете пользователю числовые значения.
        int largeNumber = 1234567;
        result = String.format("Большое число: %,d", largeNumber);
        System.out.println(result); // Вывод: Большое число: 1 234 567 (Большое число: 1 234 567)

//      Использование спецификатора без дополнительных условий
//      Этот вывод отображает число с шестью знаками после запятой, так как это стандартное количество знаков для спецификатора %f.
        double pi = 3.14159;
        result = String.format("Число π: %f", pi);
        System.out.println(result); // Вывод: Число π: 3.141590

//      Указание количества знаков после запятой
        pi = 3.14159;
        result = String.format("Число π с точностью: %.2f", pi);
        System.out.println(result); // Вывод: Число π с точностью: 3.14

//      Форматирование с разделителями для тысяч
//      Чтобы упростить восприятие длинных чисел, их делят на разряды при помощи спецификатора %f.
//      Он ставит пробелы в тысячах, как %d в целых числах.
        double dLargeNumber = 1234567.8908;
        String formattedNumber = String.format("%,f", dLargeNumber);
        System.out.println(formattedNumber); // Вывод: 1 234 567,890800

//      Разделители и указание точности можно использовать одновременно:
        dLargeNumber = 1234567.89;
        formattedNumber = String.format("%,.2f", dLargeNumber);
        System.out.println(formattedNumber); // Вывод: 1 234 567.89

        // Пример товаров в корзине
        String[] items = {"Товар 1", "Товар 2", "Товар 3"};
        double[] prices = {123.45, 678.90, 234.56};
        int[] quantities = {2, 1, 3};
        // Заголовок таблицы
        String header = String.format("%-15s %-10s %-10s %-10s", "Товар", "Цена", "Кол-во", "Итого");
        System.out.println(header);
        System.out.println("--------------------------------------------");
        double totalSum = 0.0; // Переменная для подсчёта общей суммы
        // Итерация по товарам для вывода строк с данными
        for (int i = 0; i < items.length; i++) {
            double itemTotal = prices[i] * quantities[i];
            totalSum += itemTotal;
            String row = String.format("%-15s %-10.2f %-10d %-10.2f", items[i], prices[i], quantities[i], itemTotal);
            System.out.println(row);
        }
        System.out.println("--------------------------------------------");
        // Общая сумма
        String totalRow = String.format("%-35s %-10.2f", "Общая сумма:", totalSum);
        System.out.println(totalRow);

        System.out.println();

        //шаблоны
        format = "Товар: %-10s Цена: %8.2f%n";
        String formattedLaptop = String.format(format, "Ноутбук", 999.99);
        String formattedPhone = String.format(format, "Смартфон", 356.99);
        System.out.println(formattedLaptop + formattedPhone);

        //Пример форматирования BigDecimal
        BigDecimal amount = new BigDecimal("98765.4233");
        String currencyFormat = String.format("Счёт: %,.2f руб.", amount);
        System.out.println(currencyFormat); // Вывод: Счёт: 98,765.43 руб.
    }
}
