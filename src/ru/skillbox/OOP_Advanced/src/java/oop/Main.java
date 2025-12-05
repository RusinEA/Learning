package ru.skillbox.OOP_Advanced.src.java.oop;

import ru.skillbox.OOP_Advanced.src.java.oop.vehicles.Bycicle;
import ru.skillbox.OOP_Advanced.src.java.oop.vehicles.HeavyMachines;
import ru.skillbox.OOP_Advanced.src.java.oop.vehicles.SportCar;
import ru.skillbox.OOP_Advanced.src.java.oop.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        SportCar fordGT40 = new SportCar("Ford GT40", 5, 0, 40, 2, 5, 0.50);
        HeavyMachines t34 = new HeavyMachines("T34", 4, 0, 100, 2, 0.75);
        Bycicle moscow80 = new Bycicle("Moscow-80", 3, 0, 0.99);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = fordGT40;
        vehicles[1] = t34;
        vehicles[2] = moscow80;
        Competition.race(vehicles, 3, 300);

    }
}
