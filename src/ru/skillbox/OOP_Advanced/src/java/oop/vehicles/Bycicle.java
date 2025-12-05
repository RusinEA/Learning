package ru.skillbox.OOP_Advanced.src.java.oop.vehicles;

import ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation.Breakable;
import ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation.Refuelled;

public class Bycicle extends Vehicle implements Breakable {
    private double breakLimit;

    public Bycicle(String model,
                   int speed,
                   int x,
                   double breakLimit) {
        super(model, speed, x);
        this.breakLimit = breakLimit;
    }

    @Override
    public void move() {
        if (isBroken()) {
            return;
        }
        super.move();
    }

    @Override
    public boolean isBroken() {
        return Math.random() > this.breakLimit;
    }
}
