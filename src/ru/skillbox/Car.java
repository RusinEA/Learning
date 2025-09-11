package ru.skillbox;

public class Car {
    int distance;
    static int allDistance;

    public void move(int distance) {
        this.distance += distance;
        this.allDistance += distance;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getAllDistance() {
        return this.allDistance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
