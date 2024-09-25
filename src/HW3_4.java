import java.util.Scanner;
public class HW3_4 {
    public static void main(String [] args) {
        /*
        Ввести с клавиатуры целое число (Число 2). Для каждого из чисел от 1 до 10 выполнить:
        Если Число1 четное, вывести сумму двух чисел (пр.1), если нет - разность (пр.2). Также если числа равны - вывести надпись Числа равны!.
        пр1.: Число1 + Число2 = Сумма, где Число1 - значение 1-го числа (от 1 до 10), Число2 - значение введенного с клавиатуры числа, Сумма - результат сложения.
        пр2.: Число1 - Число2 = Разность, где Число1 - значение 1-го числа (от 1 до 10), Число2 - значение введенного с клавиатуры числа, Разность - результат вычитания.
        */

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number 2: ");
        int num2 = in.nextInt();
        for (int num1 = 1; num1 <=10; num1++) {
            if (num1 % 2 == 0 | num2 % 3 == 0) {
                if (num1 == num2)
                    System.out.println("Числа равны");
                else if (num1 > num2)
                    System.out.println(("Число " + num1 + " больше числа " + num2));
                else
                    System.out.println(("Число " + num2 + " больше числа " + num1));
            }
            if (num1 % 2 == 0 & num1 % 3 == 0) {
                if (Math.pow(num1, num2) > Integer.MAX_VALUE | Math.pow(num1, num2) < Integer.MIN_VALUE)
                    System.out.println("Число слишком большое");
                else
                    System.out.println(Math.pow(num1, num2));
            }
        }
        in.close();

    }
}
