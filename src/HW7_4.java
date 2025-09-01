import java.util.Scanner;

public class HW7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = scanner.nextInt();

        scanner.close();

        if (x <= 0) {
            System.out.println("The number must be at least 1");
            return;
        }

        System.out.println(rootsPlus(x));
    }

    static double rootsPlus (int number) {
        return rootsPlus(1, number);

    }

    static double rootsPlus(int x, int maxNumber) {
        if (x == maxNumber) {
            return Math.sqrt(x);
        }

        return Math.sqrt(x + rootsPlus(x+1, maxNumber));
    }

}
