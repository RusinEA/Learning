package ru.skillbox.OOP_Advanced.src.java.oop.vehicles;

public abstract class Vehicle {
    private String model;
    private int speed;
    private int x;

    public Vehicle(String model, int speed, int x) {
        this.model = model;
        this.speed = speed;
        this.x = x;
    }

    public int getX() {
        return x;
    }1

    public void move(){
        this.x += this.speed;
    }
}
