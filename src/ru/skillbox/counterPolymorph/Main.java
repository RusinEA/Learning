package ru.skillbox.counterPolymorph;

import ru.skillbox.counterPolymorph.console.consoleReader;
import ru.skillbox.counterPolymorph.console.consoleWriter;
import ru.skillbox.counterPolymorph.database.DatabaseReader;
import ru.skillbox.counterPolymorph.database.DatabaseWriter;

public class Main {

    public static void main(String[] args) {
        Reader reader = new DatabaseReader();
        Writer writer = new DatabaseWriter();
        Counter counter = new Counter(writer, reader);

        counter.processText();

        /*
        String s = "AaA sfFFF";
        int[] arr = new int[128];
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            arr[(int) (chars[i])]++;
            System.out.println((int) (chars[i]) + "'" + chars[i] + "'");
            System.out.println(arr[(int) (chars[i])]);
            System.out.println();
        }*/
          /*  for (char ch : chars) {
                arr[ch]++;
                System.out.println((int) (ch));
                System.out.println("'" + ch + "'");
                System.out.println(arr[ch]);
                System.out.println();
            }*/

    }
}
