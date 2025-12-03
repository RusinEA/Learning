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

    @Override
    public double maxCapacity() {
        return maxfuelcapacity;
    }

    @Override
    public double fuelNow() {
        return fuelnow;
    }

    @Override
    public void recieveFuel(double fuelcount) {
        if (fuelcount < 0.0) {
            System.out.println("не могу получить отрицательное значение топлива");
            return;
        }

        if (fuelcount + fuelnow >= maxfuelcapacity) {
            refuel();
            return;
        }
        fuelnow += fuelcount;
    }

    @Override
    public void useFuel(double fuelcount) {
        if (fuelcount < 0.0) {
            System.out.println("не могу потратить отрицательное значение топлива");
            return;
        }

        fuelnow -= fuelcount;
        if (fuelnow <= 0.0) {
            fuelnow = 0.0;
        }
    }

    @Override
    public boolean isFuelEmpty() {
        return fuelnow == 0.0;
    }

    @Override
    public void emptyFuel() {
        fuelnow = 0.0;
    }
1
    private void valid() {
        if (maxfuelcapacity <= 0.0) {
            System.out.println("отрицательное или нулевое значение емкости бака");
        }
    }
}