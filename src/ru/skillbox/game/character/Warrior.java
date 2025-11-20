package ru.skillbox.game.character;

public class Warrior extends Character implements Attacker{

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Воин атакует мечом");
    }
}
