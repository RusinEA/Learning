package ru.skillbox.counter;

public class Counter {

    public void processText(String text) {
        int[] chars = count(text);

        for (char i = 0; i < chars.length; i++) {
            if (chars[i] != 0) {
                System.out.println("'" + i + "' Встретилось "
                        + chars[i] + " раза");
            }

        }
    }

    private int[] count(String text) {
        int[] arr = new int[128];
        char[] chars = text.toCharArray();

        for (char ch : chars) {
            arr[ch]++;
        }
        return arr;
    }
}
