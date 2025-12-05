package ru.skillbox.OOP_Advanced.src.java.oop;

import ru.skillbox.OOP_Advanced.src.java.oop.vehicles.Vehicle;

public class Competition {

    public static void race(Vehicle[] vehicles, int vehicleCount, int raceSize) {
        Vehicle[] vehicleInRace = vehicles;
        Vehicle winner = null;
        boolean endOfRace = false;
        do {
            int i = 0;
            while (i <= 2) {
                vehicleInRace[i].move();
                if (vehicleInRace[i].getX() >= raceSize) {
                    winner = vehicleInRace[i];
                    endOfRace = true;
                    break;
                }
                i++;
            }
        } while (endOfRace != true);
        System.out.println("Race completed! Winner is: " + winner.toString());
    }
}
