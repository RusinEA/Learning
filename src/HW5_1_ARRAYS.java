public class HW5_1_ARRAYS {
    public static void main (String [] args){

        //------------HW 5.1
        /*
        Создать массив char, заполненный буквами своего имени в верном порядке. Используя этот массив, вывести свое имя в консоль.
        Вариант 1: не используя переменную типа String;
        Вариант 2: предварительно собрав значения массива в переменную типа String.
        Подсказка для варианта 2: создать пустую строку можно так: String s = "";
        */

        char[] name = {'E', 'g', 'o', 'r'};

        //без String
        for (int i = 0; i < name.length; i++ )
            System.out.print(name[i]);

        System.out.println();
        //со String
        String sname = "";
        for (int i = 0; i < name.length; i++ )
            sname = sname + name[i];

        System.out.println(sname);

    }
}
