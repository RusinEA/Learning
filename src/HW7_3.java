/*
 * Вычислите факториал введенного с клавиатуры целого числа, используя рекурсивный алгоритм.
 */

import java.util.Scanner;

public class HW7_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number < 0) {
            System.out.println("The number must be at least 0");
        }
        else{
            System.out.println(factorial(number));
        }

    }

    static long factorial(int x){
        if (x == 0){
            return 1;
        }

        if (x == 1){
            return 1;
        }

        return x * factorial(x - 1);
    }
}
