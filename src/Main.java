import java.util.Scanner;
import ru.netology.service.Basket;

public class Main {
    public static void main(String[] args) {

        String[] products = {"Хлеб", "Яблоки", "Молоко", "Гречневая крупа"};
        int[] prices = {14, 30, 50, 80};
        Scanner scanner = new Scanner(System.in);
        int[] countProductsArr = new int [4];
        System.out.println("В нашей лавке сегодня такие продукты: ");

        for (int i = 0; i < products.length; i++) {
            System.out.println("Наименование: " + products[i] + " | Стоимость: " + prices[i] + "р/шт");
        }

        while (true){

            System.out.println("Выберите индекс продукта и его количество, или введите end для выхода из программы");

            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            String [] parts = input.split(" ");

            int productNumber = Integer.parseInt(parts[0]);
            int productCount = Integer.parseInt(parts[1]);

            countProductsArr[productNumber-1] += productCount;

        }

        for ( : ){
            Basket.basketOut();
        }



    }
}
