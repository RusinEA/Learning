import ru.skillbox.ClassesAndMethods_2.PersonTask.src.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Katya", 20);
        Person person2 = new Person("Igor", 25);
        Person person3 = new Person("Katya", 28);
        Person person4 = new Person("Igor", 25);

        System.out.println("Равна ли 2 и 4 персона? - " + person2.equals(person4));
        System.out.println(person2.toString());
        System.out.println(person4.toString());
        System.out.println("Хэш персоны 2 - " + person2.hashCode());
        System.out.println("Хэш персоны 4 - " + person4.hashCode());

        System.out.println();

        System.out.println("Равна ли 1 и 3 персона? - " + person1.equals(person3));
        System.out.println(person1.toString());
        System.out.println(person3.toString());
        System.out.println("Хэш персоны 1 - " + person1.hashCode());
        System.out.println("Хэш персоны 3 - " + person3.hashCode());

    }
}
