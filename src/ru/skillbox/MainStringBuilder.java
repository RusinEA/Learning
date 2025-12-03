package ru.skillbox;

public class MainStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            sb.append("число: ")
                    .append(i)
                    .append("; ");
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
