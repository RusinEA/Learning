public class logictable {

    public static void main(String [] args) {

        boolean p, q;
        byte bt;
        System.out.println("p\t\tq\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true;
        q = true;

        //bt = (byte) (p);

        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p|q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = true;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p|q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p|q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p|q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));


    }
}
