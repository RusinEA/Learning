package ru.skillbox.game.character;

public abstract class Character {
    private final String name;
    private int health;
    private int x;
    private int y;
    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

}
