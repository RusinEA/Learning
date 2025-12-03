package ru.skillbox.counterPolymorph;

public class Counter {
    private Writer writer;
    private Reader reader;

    public Counter(Writer writer, Reader reader) {
        this.writer = writer;
        this.reader = reader;
    }

    public void processText() {
        String text = reader.read();
        int[] chars = count(text);

        for (char ch = 0; ch < chars.length; ch++) {
            if (chars[ch] != 0) {
                writer.write("'" + ch + "' Встретилось "
                        + chars[ch] + " раза");
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
