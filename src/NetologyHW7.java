import ru.netology.service.Basket;

import java.util.Scanner;

public class NetologyHW7 {
    public static void main(String[] args) {

        String[] productsArr = {"Хлеб", "Яблоки", "Молоко", "Гречневая крупа"};
        int[] pricesArr = {14, 30, 50, 80};
        Scanner scanner = new Scanner(System.in);
        int[] countProductsArr = new int [4];
        System.out.println("В нашей лавке сегодня такие продукты: ");

        for (int i = 0; i < productsArr.length; i++) {
            System.out.println("Наименование: " + (i+1) + " - " + productsArr[i] + " | Стоимость: " + pricesArr[i] + "р/шт");
        }

        while (true){

            System.out.println("Выберите индекс продукта (от 1 до 4) и его количество, или введите end для выхода из программы");

            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            String [] parts = input.split(" ");

            int productNumber = Integer.parseInt(parts[0]);
            int productCount = Integer.parseInt(parts[1]);

            countProductsArr[productNumber-1] += productCount;

        }

        System.out.println("Ваша корзина: ");
        for (int i = 0; i < productsArr.length; i++  ){
            Basket.basketOut(productsArr[i], countProductsArr[i], pricesArr[i]);
        }

        int summ = 0;

        for (int i = 0; i < productsArr.length; i++  ){
            summ += Basket.basketSummOut(countProductsArr[i], pricesArr[i]);
        }

        System.out.println();

        System.out.println("Всего в вашей корзине товаров на сумму - " + summ + " руб");

    }
}
