package ru.skillbox.gameAbstract.character;

public class Priest extends Character implements Healer{

    public Priest(String name, int health) {
        super(name, health);
    }

    @Override
    public void heal() {
        System.out.println("Priest heal");
    }
}
