package ru.skillbox;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegularExpression {
    public static void main(String[] args) {

        String phone1 = "+7 903 712-37-54";
        String phone2 = "7 (903) 968-60-45";
        String phone3 = "7999-666-66-66";
        String phone4 = "7(903)9616asdfasdf#%245";

        System.out.println(formatPhoneNumber(phone1));
        System.out.println(formatPhoneNumber(phone2));
        System.out.println(formatPhoneNumber(phone3));
        System.out.println(formatPhoneNumber(phone4));

        //разбиение текста на слова
        String text = "I know something about it";
        String[] words = text.split("\\s");
        // \s - пробел, перенос строки, символ табуляции и ещё некоторые варианты пробельных символов
        for (String word : words) {
            System.out.println(word);
        }

        text = "I  know\tsomething   about\n  it";
//      Регулярное выражение рассчитано на разбиение строк по одному пробелу,
//      а не по нескольким. Чтобы решить эту проблему, добавим символ плюса,
//      означающий, что пробельный символ может встретиться как один раз, так и несколько:
        words = text.split("\\s+");
//      Такое выражение также будет работать корректно и разбивать текст на слова
//      по одному или нескольким стоящим подряд пробельным символам.
        for (String word : words) {
            System.out.println(word);
        }

        String number = "А674МР197";
        String lettersRange = "[АВЕКМНОРСТУХ]";
        String regex = lettersRange + "[0-9]{3}" + lettersRange + "{2}[0-9]{2,3}";
        System.out.println(number.matches(regex));


        //Поиск по шаблону из текста при помощи паттерна и матчера
        text  = """
                Алексей, добрый день!\nМой гитхаб — https://github.com/, 
                а также ссылка на мой персональный сайт — https://www.skillbox.ru/\n
                Если возникнут вопросы, пишите мне напрямую. https://pikabu.ru, Я всегда доступен";""";

        regex = "https://[^,\\s]+";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }
        System.out.println();

        matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        //Маски
        //"«([^»]+)»" всё в ковычках, () - но без них
        //"«[^»]+»" всё в ковычках
        text = """
                Дмитрий сообщил следующее: 
                «Я вернусь в 12:40 и, будьте добры, подготовьте к этому времени все документы!» 
                На что Анна ему ответила: 
                «А документы-то так и не привезли». 
                Дмитрий удивлённо посмотрел на неё и сказал: 
                «Ну и ладно», — вздохнул, махнул рукой и удалился.""";

        regex = "«([^»]+)»";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text);
        while (matcher.find()) {
            String citation = matcher.group(1);
            System.out.println(citation);
        }

        String data = "weight: 540,687;   2   height: 546;";

        String[] dataArr = data.split("\\s+[^,;:]\\s+");
        for (String word : dataArr) {
            System.out.println(word);
        }
    }

    //удаление лишних символов из строки перечисляя в квадратных скобках
    public static String formatPhoneNumber(String phone) {
        String regex = "[^0-9]"; // ^ - кроме
        //String regex = "[!-/]"; // перечисленные символы с воскл. знака по деление
        return phone.replaceAll(regex, "");
    }

}
