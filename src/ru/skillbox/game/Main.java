package ru.skillbox.game;

import ru.skillbox.game.character.*;
import ru.skillbox.game.character.Character;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("name", 1);
        Archer archer = new Archer("name", 1);
        Character rouge = new Rogue("name", 1);
        Priest priest = new Priest("priest", 10);

        priest.heal();
    }
}
