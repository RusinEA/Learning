package ru.skillbox.OOP_Advanced.src.java.oop.vehicles;

import ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation.Breakable;
import ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation.Refuelled;

public class SportCar extends Vehicle implements Refuelled, Breakable {

    private int fuel;
    private int maxFuel;
    public SportCar(String model, int speed, int x, int maxFuel) {
        super(model, speed, x);
        this.maxFuel = maxFuel;
        this.fuel = maxFuel;
    }

    @Override
    public void move() {
        this.fuel -= 1;
        if (this.fuel < 1) {
            refuel();
            return;
        }
        super.move();1
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void refuel() {
        this.fuel = maxFuel;
    }

    @Override
    public boolean isBroken() {
        return Math.random() <= 0.75;
    }
}
