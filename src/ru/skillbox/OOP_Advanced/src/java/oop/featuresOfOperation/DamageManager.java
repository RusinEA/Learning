package ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation;

class DamageManager implements Breakable {
    boolean isBroked = false;

    public DamageManager(boolean isBroked) {
        this.isBroked = isBroked;
    }

    @Override
    public boolean isBroken() {
        return isBroked;
    }

}