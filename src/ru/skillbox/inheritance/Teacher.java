package ru.skillbox.inheritance;

public class Teacher extends Person {

    private int salary;

    public Teacher(String name, int age, int salary, Address address) {
        super(name, age, address);
        this.salary = salary;
    }

    @Override
    public String getName() {
        return "Teacher : " + super.getName();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public Teacher setName(Person teacher) {
        super.setName(teacher);
        return this;
    }
}
