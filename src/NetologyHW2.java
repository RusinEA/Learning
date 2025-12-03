import java.util.Scanner;
import ru.netology.service.CustomService;

public class NetologyHW2 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.):");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.):");
        int weight = scanner.nextInt();

        System.out.println(CustomService.calculateCustoms(price, weight));

    }
}
