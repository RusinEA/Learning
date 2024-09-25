import java.util.Scanner;

public class HW4_1 {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");

        int inpnum = in.nextInt();

        //-----------------4.2 Вывести в консоль сумму цифр введенного числа.
        int sum = 0;
        while (inpnum > 0.9){
            sum = sum + inpnum % 10;
            inpnum = inpnum / 10;
        }
        System.out.println(sum);
    }


}
