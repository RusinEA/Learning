import java.util.Scanner;

public class HW3 {
    public static void main(String [] args) {
        //----------------------3.1
        /*
        Ввести с клавиатуры два целых числа. Если Число1 четное, вывести произведение двух чисел (пр.1), если нет - частное (пр.2).
        Также если числа равны - вывести надпись Числа равны!
        пр1.: Число1 * Число2 = Произведение, где число1 - значение 1-го числа, число2 - значение 2-го числа, Произведение - результат умножения.
        пр2.: Число1 / Число2 = Частное, где число1 - значение 1-го числа, число2 - значение 2-го числа, Частное - результат деления.
        Помните, что в Java результатом деления двух целых чисел будет целое число.
        */
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int num1 = in.nextInt();
        System.out.print("Input a number 2: ");
        int num2 = in.nextInt();

        if (num1 % 2 == 0)
            System.out.println((num1 * num2));
        else if (num1 == num2)
            System.out.println("Значения равны!");
        else
            System.out.println((double) num1 / num2);
        //in.close();


        //----------------------3.2
        /*
        Написать программу, которая принимает строку с клавиатуры:
        Если введенная строка равна Hi - вывести в консоль Hello;
        Если Bye - Good bye;
        Если How are you - How are your doing;
        Если любая другая строка - вывести Unknown message.
        */

        //else-if
        Scanner str1 = new Scanner(System.in);
        System.out.print("Input a word: ");
        String s1 = str1.nextLine();
        if (s1.equals("Hi"))
            System.out.println("Hello!");
        else if (s1.equals("Bye"))
            System.out.println("Good bye!");
        else if (s1.equals("How are you?"))
            System.out.println("How are you doing?");
        else
            System.out.println("Unknown message");

        //str1.close();

        //switch
        Scanner str2 = new Scanner(System.in);
        System.out.print("Input a word: ");
        String s2 = str2.nextLine();
        switch (s2) {
            case "Hi":
                System.out.println("Hello!");
                break;
            case "Bye":
                System.out.println("Good bye!");
                break;
            case "How are you?":
                System.out.println("How are you doing?");
                break;
            default:
                System.out.println("Unknown message");
        }
        //str2.close();

        //---------------------------3.3
        /*
        Заведите три переменные типа String. С клавиатуры введите в них вашу фамилию, имя и отчество соответственно.
        Выведите в консоль ваше ФИО в одну строку.
        Реализуйте, используя:
        System.out.println()
        System.out.printf()
        */

        Scanner str3 = new Scanner(System.in);
        System.out.print("Input a name: ");
        String i = str3.nextLine();
        System.out.print("Input a surname: ");
        String f = str3.nextLine();
        System.out.print("Input a father name: ");
        String o = str3.nextLine();

        System.out.println(i + " " + f + " " + o);

        System.out.printf("%s %s %s", i, f, o );

        str3.close();

    }
}
