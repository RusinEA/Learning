package ru.netology.service;

public class Basket {
    public static void basketOut(String name, int count, int price) {

        if (count > 0) {
            int summ = count * price;
            System.out.println(name + " " + count + " шт " + price + " руб/шт - " + summ + " руб в сумме");
        }
    }

    public static int basketSummOut(int count, int price) {
        return count * price;
    }


}
