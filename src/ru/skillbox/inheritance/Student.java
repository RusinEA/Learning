package ru.skillbox.inheritance;

public class Student extends Person {

    private int course;

    public Student(String name, int age, int course, Address address) {
        super(name, age, address);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
