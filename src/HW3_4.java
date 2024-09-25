import java.util.Scanner;
public class HW3_4 {
    public static void main(String [] args) {

        /*
        Введите с клавиатуры два целых числа. Если первое – четное ИЛИ второе – кратно трем, выведите в консоль результат сравнения этих чисел в любом формате.
        Например, Число1 больше Числа2. Или true (если числа равны) и false - если нет.
        Если первое число кратно и двум, и трем – также выведите на экран число один, возведенное в степень N, где N – второе число.
        Для возведения в степень можно использовать Math.pow().
        В случае, если результат выражения выходит за пределы типа int (допустимые значения - [-2147483648; 2147483647]) – вывести сообщение Результат выражения слишком большой!.
        Также минимальное и максимальное значение int содержится в константах Integer.MIN_VALUE и Integer.MAX_VALUE соответственно.
        */

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int num1 = in.nextInt();
        System.out.print("Input a number 2: ");
        int num2 = in.nextInt();

        if (num1 % 2 == 0 | num2 % 3 ==0){
            if (num1 == num2)
                System.out.println("Числа равны");
            else if (num1 > num2)
                System.out.println(("Число " + num1 + " больше числа " + num2));
            else
                System.out.println(("Число " + num2 + " больше числа " + num1));
        }
        if (num1 % 2 == 0 & num1 % 3 ==0){
            if (Math.pow(num1, num2) > Integer.MAX_VALUE | Math.pow(num1, num2) < Integer.MIN_VALUE)
                System.out.println("Число слишком большое");
            else
                System.out.println(Math.pow(num1, num2));
        }

        in.close();

    }
}
