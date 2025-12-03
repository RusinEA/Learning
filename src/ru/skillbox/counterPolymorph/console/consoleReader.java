package ru.skillbox.counterPolymorph.console;

import ru.skillbox.counterPolymorph.Reader;

import java.util.Scanner;

public class consoleReader implements Reader {

    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
