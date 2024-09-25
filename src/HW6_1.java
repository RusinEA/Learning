import java.util.Scanner;
public class HW6_1 {
    public static void main(String[] args) {
//        Создаем сканер для чтения с клавиатуры
        Scanner scanner = new Scanner(System.in);

//        Выводим сообщение "Enter string: " в консоль.
//        Данное сообщение не является обязательным, лишь информирует пользователя,
//        какое действие от него ожидается
        System.out.print("Enter string: ");
//        Объявляем переменную s типа String и записываем в нее значение, введенное с клавиатуры
        String s = scanner.nextLine();

//        Сканер более не используется, ее необходимо закрыть.
//        Зачем - разберемся, когда будем изучать I/O Streams
        scanner.close();

        prnt(bot(s));
    }

    public static String bot(String s) {
        //        Используем конструкцию switch-case для переменной s

        switch (s) {
            case "Hi":
                return "Hello";

            case "Bye":
                return "Good bye";

            case "How are you":
                return "How are your doing";

            default:
                return "Unknown message";
        }
    }

    public static void prnt(String s){
        System.out.println(s);
    }


}