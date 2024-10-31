import ru.netology.service.Book;

public class Main {
    public static void main(String[] args) {
        Book newBook = new Book("Solaris", 1961, "Lem", 210);
        System.out.println("Большая ли книга");
        System.out.println(newBook.isBig());
        System.out.println("Содержится ли в описании книги (названии или в имени автора) переданное параметром слово");
        System.out.println(newBook.matches("Lem"));
        System.out.println("Оценка стоимости книги (целое число в рублях) по формуле 3 рубля за страницу");
        System.out.println(newBook.estimatePrice());

    }
}
