import java.util.Scanner;
public class HW3_4 {
    public static void main(String [] args) {

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
