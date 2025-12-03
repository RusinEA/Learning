package ru.skillbox.gameAbstract.character;

public class Rogue extends Character implements Attacker{

    public Rogue(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Плут наносит скрытный удар");
    }
}
