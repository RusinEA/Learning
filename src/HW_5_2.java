import java.util.Scanner;
public class HW_5_2 {
    public static void main (String [] args){


        //------------HW 5.2
        int[] fnum = new int[5];


        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++ ) {
            System.out.println("Введите элемент массива: " + i);
            fnum[i] = in.nextInt();
        }

        int sum = 0;
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
