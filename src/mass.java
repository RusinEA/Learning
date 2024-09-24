import java.util.Scanner;

public class mass {
    public static void main(String  [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your name: ");
        String s = in.nextLine();


        char[] ChMas = new char[s.length()];

        for (int i = 0; i <= s.length()-1; i++){
            ChMas[i] = s.charAt(i);
            System.out.println(ChMas[i]);
        }


        in.close();

        }
}

