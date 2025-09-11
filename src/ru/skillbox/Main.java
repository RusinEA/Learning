package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.move(100);
        car2.move(400);
        car3.move(200);

        System.out.println(Car.allDistance);

    }
}

