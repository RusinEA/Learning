import java.util.Scanner;

public class HW5_2 {
    public static void main (String [] args){


        //------------HW 5.2
        /*
        Создать массив int из 5 элементов. Заполнить его значениями, введенными с клавиатуры.
        Вывести на экран сумму каждого значения с предыдущим.
        Предыдущим значением для 0-го (нулевого) элемента считать последнее значение массива.
        */
        int[] fnum = new int[5];


        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++ ) {
            System.out.println("Введите элемент массива: " + i);
            fnum[i] = in.nextInt();
        }

        int sum;
        for (int i = 0; i < 5; i++ ) {
            if (i==0)
                sum = fnum[i] + fnum[fnum.length - 1];
            else
                sum = fnum[i] + fnum [i-1];
            System.out.println(sum);
        }

        in.close();
    }
}
