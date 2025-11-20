package ru.skillbox.game.character;

public class Mage extends Character implements CombatHealer{
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Маг кастует файрбол");
    }

    @Override
    public void heal() {
        System.out.println("Маг исцеляет");
    }
}
