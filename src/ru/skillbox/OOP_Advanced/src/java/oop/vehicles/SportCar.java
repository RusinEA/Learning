package ru.skillbox.OOP_Advanced.src.java.oop.vehicles;

import ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation.Breakable;
import ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation.Refuelled;

public class SportCar extends Vehicle implements Refuelled, Breakable {
    private int fuel;
    public SportCar(String model, int speed, int x, int fuel) {
        super(model, speed, x);
        this.fuel = fuel;
    }

    @Override
    public void move() {
        if (this.fuel < 1) {
            refuel();
            return;
        }
        super.move();
    }

    @Override
    public void refuel() {

    }

    @Override
    public boolean isBroken() {
        return Math.random() <= 0.75;
    }
}
