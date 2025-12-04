package ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation;

public class FuelManager implements Refuelled {
    private double maxfuelcapacity;
    private double fuelnow;

    public void setMaxfuelcapacity(double maxfuelcapacity) {
        this.maxfuelcapacity = maxfuelcapacity;
    }

    public FuelManager(double maxcapacity) {
        this.maxfuelcapacity = maxcapacity;
        this.fuelnow = 0.0;
        valid();
    }

    @Override
    public void refuel() {
        fuelnow = maxfuelcapacity;
    }

    private void valid() {
        if (maxfuelcapacity <= 0.0) {
            System.out.println("отрицательное или нулевое значение емкости бака");
        }
    }
}