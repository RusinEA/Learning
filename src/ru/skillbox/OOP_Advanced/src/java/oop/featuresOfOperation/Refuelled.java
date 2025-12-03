package ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation;

public interface Refuelled {
    void refuel();
    double maxCapacity();
    double fuelNow();
    void recieveFuel(double fuelcount);
    void useFuel(double fuelcount);
    boolean isFuelEmpty();
    void emptyFuel();
}
