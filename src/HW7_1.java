public class HW7_1 {
    public static  void main(String[] args) {
        String res = concatenate("a", "b", "c", "d", "e");
        System.out.println(res);
    }

    public static String concatenate(String ...sb) {
        String result = "";
        for (int i = 0; i < sb.length; i++) {
            result += sb[i] + " " ;
        }
        return result;
    }

}
