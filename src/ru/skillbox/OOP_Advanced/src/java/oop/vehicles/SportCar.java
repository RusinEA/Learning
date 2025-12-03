package ru.skillbox.OOP_Advanced.src.java.oop.vehicles;

import ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation.FuelManager;

public class SportCar extends Vehicle {

//    private int fuel;
//    private int maxFuel;
    private int fuelPerKm;
    FuelManager tank;

    public SportCar(String model, int speed, int x, int maxFuel, int fuelPerKm) {
        super(model, speed, x);
        tank = new FuelManager(maxFuel);
        this.fuelPerKm = fuelPerKm;
//        this.maxFuel = maxFuel;
//        this.fuel = maxFuel;
    }

    @Override
    public void move() {
        tank.useFuel(fuelPerKm);
        if (tank.isFuelEmpty()) {
            tank.refuel();
        }
        super.move();
    }
1
    public double getFuel() {
        return tank.fuelNow();
    }

//    public void setFuel(int fuel) {
//        this.fuel = fuel;
//    }

}
