package ru.skillbox.counterPolymorph.console;

import ru.skillbox.counterPolymorph.Writer;

public class consoleWriter implements Writer {

    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
