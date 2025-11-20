package ru.skillbox.manageEmployyAndStudents.person;

import ru.skillbox.manageEmployyAndStudents.Address;

public class Teacher extends Person {

    private int salary;

    public Teacher(String name, int age, Address address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    @Override
    public String getName() {
        return "Teacher: " + super.getName();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String description(){
        String description = name + " " + salary;
        return description;
    }

    @Override
    public void setAge(int age){
        this.setAge(age);
    }

    public Teacher setName(Person teacher) {
        super.setName(teacher);
        return this;
    }
}
