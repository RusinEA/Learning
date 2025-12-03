public class switchcase {

    public static void main(String[] args) {

        int i;

        for (i = 0; i <= 10; i++)
            switch (i) {
                case 0 -> System.out.println("i равно нулю");
                case 1 -> System.out.println("i равно единице");
                case 2 -> System.out.println("i равно двум");
                case 3 -> System.out.println("i равно трем");
                case 4 -> System.out.println("i равно четырем");
                case 5, 6, 7, 8, 9, 10 -> System.out.println("i равно или больше пяти");
            }

        int day = 3;

        String text = switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";

            default -> "N/A";
        };
        System.out.println(text);

        int value = 2;
        switch (value) {
            case 1 -> {
                System.out.println("One");
            }
            case 2 -> {
                System.out.println("Two");
            }
        }

        day = 5;

        String text2 = switch (day) {
            case 1: yield "Понедельник";
            case 2: yield "Вторник";
            case 3: yield "Среда";
            case 4: yield "Четверг";
            case 5: yield "Пятница" + " да, и выражения можно возвращать";
            case 6: yield "Суббота";
            case 7: yield "Воскресенье";

            default: yield "N/A";
        };
        System.out.println(text2);

    }

}