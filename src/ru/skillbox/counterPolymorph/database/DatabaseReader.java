package ru.skillbox.counterPolymorph.database;

import ru.skillbox.counterPolymorph.Reader;

public class DatabaseReader implements Reader {

    @Override
    public String read() {
        return "Java is cool!";
    }
}
