import java.util.Scanner;
public class HW4 {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");

        int inpnum = in.nextInt();
        int fctrl = 1;
        //-----------------4.1 Ввести с клавиатуры целое число. Вывести в консоль его факториал.
        for (int i = 1; i <= inpnum; i++){
            fctrl = i * fctrl;
        }
        System.out.println(fctrl);

        //-----------------4.2 Вывести в консоль сумму цифр введенного числа.
        int sum = 0;
        while (inpnum >0){
            sum = sum + inpnum % 10;
            inpnum = inpnum % 10;
        }

    }
}
