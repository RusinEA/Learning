public class SPaceCouanter {

    /*Напишите программу, которая получает символы, введенные с клавиатуры, до
    тех пор, пока не встретится точка. Предусмотрите в программе счетчик пробелов.
    Сведения о количестве пробелов должны выводиться в конце программы.*/
    public static void main(String [] args)
        throws java.io.IOException {

            char keysym, clbuf;

            int symsp;

            symsp = 0;

            do {
                keysym = (char) System.in.read(); //буферизируем все введённые знаки


                do {
                    clbuf = (char) System.in.read(); //очищаем буфер, читая каждый символ
                    if (clbuf == ' ') symsp++; // сыитаем введённые пробелы
                } while (clbuf != '\n'); //пока не введён символ возврата каретки (ожидание клавиши enter)

            } while (keysym != '.'); //выход из программы, если введена точка

            System.out.println(symsp);
        }
}
