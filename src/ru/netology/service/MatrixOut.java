package ru.netology.service;

public class MatrixOut {

    public static void mxOut(int colors[][], int SIZE) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", colors[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    public static void mxRotate90(int colors[][], int SIZE) {

        int[][] rotateArr = new int[SIZE][SIZE];

        int ir = SIZE - 1;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotateArr[j][ir] = colors[i][j];
            }
            ir--;
        }

        System.out.println();
        mxOut(rotateArr, SIZE);
    }

    public static void mxRotate270(int colors[][], int SIZE) {

        int[][] rotateArr = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            int ir = SIZE - 1;
            for (int j = 0; j < SIZE; j++) {
                rotateArr[ir][i] = colors[i][j];
                ir--;
            }

        }

        System.out.println();
        mxOut(rotateArr, SIZE);
    }

    public static void mxRotate180(int colors[][], int SIZE) {

        int[][] rotateArr = new int[SIZE][SIZE];

        int ir = SIZE - 1;
        for (int i = 0; i < SIZE; i++) {
            int jr = SIZE - 1;
            for (int j = 0; j < SIZE; j++) {
                rotateArr[ir][jr] = colors[i][j];
                jr--;
            }
            ir--;
        }

        System.out.println();
        mxOut(rotateArr, SIZE);
    }

}
