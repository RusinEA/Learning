package ru.skillbox.OOP_Advanced.src.java.oop.featuresOfOperation;

class DamageManager implements Health {
    boolean isBroked = false;

    public DamageManager(boolean isBroked) {
        this.isBroked = isBroked;
    }

    @Override
    public boolean isBroken() {
        return isBroked;
    }

    @Override
    public void Destroy() {
        isBroked = true;
    }

    @Override
    public void FullRecover() {
        isBroked = false;
    }

}