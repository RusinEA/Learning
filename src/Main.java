import ru.netology.service.Book;

public class Main {
    public static void main(String[] args) {
        Book newBook = new Book("Solaris", 1961, "Lem", 210);
        System.out.println(newBook.isBig());
        System.out.println(newBook.matches("Lem"));
        System.out.println(newBook.estimatePrice());

    }
}
