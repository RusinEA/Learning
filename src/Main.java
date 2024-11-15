import java.util.Random;

import ru.netology.service.MatrixOut;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                colors[i][j] = random.nextInt(256);
            }
        }

        MatrixOut.mxOut(colors, SIZE);

        MatrixOut.mxRotate(colors, SIZE);

    }


}
