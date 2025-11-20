package ru.skillbox.game.character;

public class Archer extends Character implements Attacker {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Лучник стреляет из лука");
    }
}
