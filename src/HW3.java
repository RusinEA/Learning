import java.util.Scanner;

public class HW3 {
    public static void main(String [] args) {
        //3.1
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

        //3.2


    }
}
