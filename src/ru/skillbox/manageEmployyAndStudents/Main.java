package ru.skillbox.manageEmployyAndStudents;

import ru.skillbox.manageEmployyAndStudents.person.Student;
import ru.skillbox.manageEmployyAndStudents.person.Teacher;

public class Main {
    public static void main(String[] args) {

        Address addressTeacher = new Address("Main", "Moscow", "100");
        Teacher teacher = new Teacher("John", 30, addressTeacher, 10000);
        System.out.println(teacher.getName() + " Salary: " + teacher.getSalary());


        Address addressStudent = new Address("Yasnaya", "Moscow", "100");
        Student student = new Student("Alice", 18, addressStudent, 100);
        System.out.println(student + "Course: " + student.getCourse());

    }
}
