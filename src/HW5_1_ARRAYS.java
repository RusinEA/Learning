public class HW5_1_ARRAYS {
    public static void main (String [] args){

        //------------HW 5.1.1 Вывести в строку имя не используя String
        char[] name = {'E', 'g', 'o', 'r'};


        for (int i = 0; i < name.length; i++ )
            System.out.print(name[i]);

        System.out.println();
        //------------HW 5.1.2 Вывести в строку имя из массива используя String
        String sname = "";
        for (int i = 0; i < name.length; i++ )
            sname = sname + name[i];

        System.out.println(sname);

    }
}
