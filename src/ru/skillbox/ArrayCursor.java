package ru.skillbox;

import java.lang.reflect.Array;
import java.math.BigDecimal;

public class ArrayCursor {
    public static void main(String[] args) {
        int[][] array = new int[5][2];
        array[0][0] = 1;
        array[0][1] = -1;

        array[1][0] = 2;
        array[1][1] = -1;

        array[2][0] = 3;
        array[2][1] = -1;

        array[3][0] = 4;
        array[3][1] = -1;

        array[4][0] = 5;
        array[4][1] = -1;

        array[0][0] = 6;
        array[0][1] = 1;

        array[1][0] = 7;
        array[1][1] = 2;

        array[2][0] = 8;
        array[2][1] = 3;

        array[3][0] = 9;
        array[3][1] = 4;

        array[4][0] = 10;
        array[4][1] = 0;

        array[0][0] = 11;
        array[0][1] = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i][1] == -1) {
                System.out.println(array[i][0]);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i][1] != -1) {
                System.out.println(array[i][0]);
            }
        }

        BigDecimal expences = new BigDecimal("400");
        BigDecimal income = new BigDecimal("10");

        BigDecimal total = income.subtract(expences);
        System.out.println("total: " + total);
    }
}
