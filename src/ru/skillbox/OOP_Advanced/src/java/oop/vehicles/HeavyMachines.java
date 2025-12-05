package ru.skillbox.OOP_Advanced.src.java.oop.vehicles;

import ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation.Acceleration;
import ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation.Breakable;
import ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation.Refuelled;

public class HeavyMachines extends Vehicle implements Refuelled, Breakable {
    private int fuel;
    private int maxFuel;
    private int fuelPerKm;
    private double breakLimit;

    public HeavyMachines(String model,
                         int speed,
                         int x,
                         int maxFuel,
                         int fuelPerKm,
                         double breakLimit) {
        super(model, speed, x);
        this.maxFuel = maxFuel;
        this.fuel = maxFuel;
        this.fuelPerKm = fuelPerKm;
        this.breakLimit = breakLimit;
    }

    @Override
    public void move() {
        this.fuel -= fuelPerKm;
        if (this.fuel < 1) {
            refuel();
            return;
        }
        if (isBroken()) {
            return;
        }
        super.move();
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void refuel() {
        setFuel(maxFuel);
    }

    @Override
    public boolean isBroken() {
        return Math.random() > this.breakLimit;
    }

}
