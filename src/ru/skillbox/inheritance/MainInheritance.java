package ru.skillbox.inheritance;

public class MainInheritance {
    public static void main(String[] args) {

        Address addressTeacher = new Address("Main", "Moscow", "232233");
        Teacher teacher = new Teacher("Jonh", 30, 10000, addressTeacher);
        System.out.println(teacher.getName() + " salary: " + teacher.getSalary());

        Address addressStudent = new Address("Yasnaya", "Moscow", "232232");
        Student student = new Student("Alice", 18, 1, addressStudent);
        System.out.println(student);

    }
}
