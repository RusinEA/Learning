package ru.skillbox;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class MainBigDecimalAndBigInteger {
    public static void main(String[] args) {
        //объявление
        double doubleValue = 0.1;
        BigDecimal bigDecimalFromDouble = BigDecimal.valueOf(doubleValue);
        BigDecimal bigDecimalFromString = new BigDecimal("0.1");
        System.out.println(bigDecimalFromDouble);
        System.out.println(bigDecimalFromString);

        //сложение
        BigInteger chairs = new BigInteger("1234");
        BigInteger tables = BigInteger.valueOf(1111);
        BigInteger furniture = chairs.add(tables);
        System.out.println(furniture);

        //вычитание
        BigDecimal money = new BigDecimal("500");
        BigDecimal price = BigDecimal.valueOf(198.66D);
        BigDecimal charge = money.subtract(price);
        System.out.println(charge);

        //умножение
        BigDecimal width = new BigDecimal("330");
        //BigDecimal length = new BigDecimal("75");
        BigDecimal length = BigDecimal.valueOf(75);
        BigDecimal square = width.multiply(length);
        System.out.println(square);

        //деление
        BigInteger modulesInCourse = BigInteger.valueOf(10);
        BigInteger hoursInCourse = BigInteger.valueOf(66);
        BigInteger avgHoursForSingleCourse = hoursInCourse.divide(modulesInCourse);
        System.out.println(avgHoursForSingleCourse);
        //BigInteger — это целое число, поэтому при делении остаётся только целая часть, а дробная отбрасывается без округления.

        //Аналогично происходит и деление с помощью long или int. Всё, что остаётся после запятой, — отбрасывается.
        int intHoursInCourse = 78;
        int intModulesInCourse = 10;
        int avgHoursForCourse = intHoursInCourse / intModulesInCourse;
        System.out.println(avgHoursForSingleCourse);


        //При делении компьютер рекомендует вам указать, как выполнить округление и какая точность вам необходима.
        // Точность — это количество разрядов после запятой в результате.
        //Существуют готовые правила округления:
        //•	CEILING: округление всегда к большему значению;
        //•	FLOOR: округление всегда к меньшему значению;
        //•	математическое округление HALF_UP: если последняя цифра равна или больше пяти,
        // округляется к верхнему значению, а если меньше — к меньшему;
        //•	«банковское округление» HALF_EVEN: если последняя цифра до пяти чётная,
        // целое число округляют в меньшую сторону, а если нечётное — в большую.

        BigDecimal hours = BigDecimal.valueOf(78);
        BigDecimal modules = BigDecimal.valueOf(10);
        BigDecimal bDavgHoursForSingleCourse = hours.divide(modules, 2, RoundingMode.HALF_UP);
        System.out.println(bDavgHoursForSingleCourse);

        //прочие операции
        //1. Округление числа. Любое число можно округлить, указав точность и стратегию:
        BigDecimal oPrice = new BigDecimal("56.4645");
        BigDecimal oPriceScaled = price.setScale(2, RoundingMode.HALF_UP);
        //56.4645 → 56.46

        //2. Остаток от деления. Для примитивов используют знак %, а с классами — метод mod:
        BigInteger a = new BigInteger("10");
        BigInteger b = new BigInteger("3");
        BigInteger remainder = a.mod(b);
        // 10 mod 3 = 1

        //3. Возведение в степень:
        BigDecimal squareSideLength = new BigDecimal("10");
        BigDecimal squareArea = squareSideLength.pow(2);
        // 10 ^ 2 = 100

        //Чтобы сравнения объектов типа BigDecimal и BigInteger было корректным, стоит использовать метод compareTo().
        // Он учитывает только числовое значение и возвращает:
        //•	0 (числа равны);
        //•	1 (число, вызванный метод которого больше числа в аргументе);
        //•	−1 (число, вызванный метод которого меньше числа в аргументе).
        BigDecimal sum = BigDecimal.valueOf(12_000);
        BigDecimal workerAmount = BigDecimal.valueOf(10);

        BigDecimal paymentForPerson =
                sum.divide(workerAmount, 2, RoundingMode.HALF_EVEN);

        BigDecimal salary = BigDecimal.valueOf(1200);

        boolean isEqualsSum = paymentForPerson.compareTo(salary) == 0;
        System.out.println(isEqualsSum);



    }
}
