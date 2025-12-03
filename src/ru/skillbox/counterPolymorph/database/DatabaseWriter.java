package ru.skillbox.counterPolymorph.database;

import ru.skillbox.counterPolymorph.Writer;

public class DatabaseWriter implements Writer {

    @Override
    public void write(String text) {
        System.out.println("DB: " + text);
    }
}
