import java.util.Scanner;
public class temp {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int num1 = in.nextInt();
        System.out.print("Input a number 2: ");
        int num2 = in.nextInt();

        if (num1 % 2 == 0)
            System.out.println((num1 * num2));
        else
            System.out.println((double)num1 / num2);
        in.close();
    }
}
