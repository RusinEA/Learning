public class inpkey {
    public static void main(String [] args)
        throws java.io.IOException{

            char inpch;

            System.out.println("Ожидание ввода... ");

            inpch = (char) System.in.read();

            System.out.println("Была введена клавиша - " + inpch);

            //перевод в верхний регистр
            inpch = (char) (inpch - 32);

            System.out.println("введённый символ -32 значения - " + inpch);

        }
}
