package ru.skillbox.ClassesAndMethods_2.PersonTask.src;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int hashInt;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person person = (Person) obj;
        return this.age == person.age && this.name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name) * 31 + this.age;
    }

    @Override
    public String toString() {
        return "Персона " +
                "Имя = " + name + ", " +
                "Возраст = " + age;
    }

}
