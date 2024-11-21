import java.util.Random;
import java.util.Scanner;

import ru.netology.service.MatrixOut;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                colors[i][j] = random.nextInt(256);
            }
        }

        MatrixOut.mxOut(colors, SIZE);

        System.out.println("Введите на сколько градусов повернуть матрицу: 1 - 90; 2 - 180; 3 - 270");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1:
                MatrixOut.mxRotate90(colors, SIZE);
                break;
            case 2:
                MatrixOut.mxRotate180(colors, SIZE);
                break;
            case 3:
                MatrixOut.mxRotate270(colors, SIZE);
                break;
            default:
                System.out.println("Такого выбора нет");
        }

    }


}
