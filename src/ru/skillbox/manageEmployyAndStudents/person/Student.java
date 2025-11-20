package ru.skillbox.manageEmployyAndStudents.person;

import ru.skillbox.manageEmployyAndStudents.Address;

public class Student extends Person {

    private int course;

    public Student(String name, int age, Address address, int course) {
        super(name, age, address);
        this.course = course;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }

    public String getStudentName() {
        return getName();
    }
}
