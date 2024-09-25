import java.util.Scanner;
public class HW_4_4 {
    public static void main(String[] args) {
        //программа для рисования прямоугольника
        Scanner in = new Scanner(System.in);

        System.out.println("Input lenght of rectangle");
        int lngt = in.nextInt();
        System.out.println("Input height of rectangle");
        int higt = in.nextInt();

        for (int j = 1; j <= higt; j++) {
            for (int i = 1; i <= lngt; i++) {

                //рисуем углы
                if ((j == 1 & i == 1) | (j == higt & i == lngt) | (j == 1 & i == lngt) | (j == higt & i == 1))
                    System.out.print('#');

                //рисуем потолок и пол если значение высоты соответствует началу или концу прямоугольника
                if ((i > 1 & i < lngt) & (j == 1 | j == higt))
                    System.out.print("-");
            }

            //если высота прямоугольника не 1 и не крайнее значение, то рисуем стены и пустоту в них
            if (j != 1 & j != higt) {
                System.out.print("|");
                for (int t = 2; t != lngt; t++)
                    System.out.print(" ");
                System.out.print("|");
            }
            //переводим отрисовку на следующую строку
            System.out.println();
        }

    }
}
