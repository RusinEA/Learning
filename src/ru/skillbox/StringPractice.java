package ru.skillbox;

public class StringPractice {
    public static void main(String[] args) {
        String withSpaces = "\t  Java  \n \t";
        String withTabsLineBreak = "\u2000Java \t asdfasdf \t\t\t\t\n\t\n\t";
// \u2000 это тоже символ пробела, записанный как код символа
        System.out.println("<" + withSpaces.trim() + ">");
        System.out.println("<" + withTabsLineBreak.trim()+ ">");
        System.out.println("<" + withSpaces.strip()+ ">");
        System.out.println("<" + withTabsLineBreak.strip()+ ">");

        String input = "ADD Олег";
        String[] components = input.split(" ");
        String command = components[0];
        String name = components[1];
        System.out.println("Команда: " + command + "\n"
                + "Имя: " + name);
    }

}
