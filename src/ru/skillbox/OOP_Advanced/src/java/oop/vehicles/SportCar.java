package ru.skillbox.OOP_Advanced.src.java.oop.vehicles;

import ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation.Acceleration;
import ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation.Breakable;
import ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation.Refuelled;

public class SportCar extends Vehicle implements Refuelled, Breakable, Acceleration {

    private int fuel;
    private int maxFuel;
    private int fuelPerKm;
    private int nitroCapacity;
    public SportCar(String model, int speed, int x, int maxFuel, int fuelPerKm, int nitroCapacity) {
        super(model, speed, x);
        this.maxFuel = maxFuel;
        this.fuel = maxFuel;
        this.fuelPerKm = fuelPerKm;
        this.nitroCapacity = nitroCapacity;
    }

    @Override
    public void move() {
        this.fuel -= fuelPerKm;
        if (this.fuel < 1) {
            refuel();
            return;
        }
        if (isBroken()){
            return;
        }
        if (nitroCapacity > 0) {
            accelerate();
        }
        super.move();
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
        return Math.random() > 0.75;
    }


    @Override
    public void accelerate() {
        this.nitroCapacity -= 1;
        super.move();
    }
}
