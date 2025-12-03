package ru.skillbox;

public class MainExtractCode {
    public static void main(String[] args) {

        System.out.println(extractProductCode("12"));
        System.out.println(extractProductCode("12__23"));
        System.out.println(extractProductCode("a__b"));
        System.out.println(extractProductCode("z__b__a"));

        System.out.println(splitProductCode("12"));
        System.out.println(splitProductCode("12__23"));
        System.out.println(splitProductCode("a__b"));
        System.out.println(splitProductCode("z__b__a"));

    }

    private static String extractProductCode(String code) {

        String delimeter = "__";
        int indexOfDelimeter = code.indexOf(delimeter);

        if (indexOfDelimeter <0 ) {
            return code;
        }

        return code.substring(0, indexOfDelimeter);

    }

    private static String splitProductCode(String code) {
        String delimeter = "__";
        String[] arr = code.split(delimeter);
        return arr[0];
    }

}
