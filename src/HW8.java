public class HW8 {
    public static void main(String[] args) {

        Counter evenNumber = new Counter("Чётные числа");
        Counter oddNumber = new Counter("Нечётные числа");


        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                evenNumber.increment();
            } else {
                oddNumber.increment();
            }
        }

        printCounterValue(evenNumber);
        printCounterValue(oddNumber);
    }

    static void printCounterValue(Counter counter) {
        System.out.printf("%s: %d\n", counter.name, counter.count);
    }

}
