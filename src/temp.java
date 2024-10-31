
public class temp {
    public static void main(String[] args) {

            String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
            String PATTERN = "aab";

            int count = 0;

            for (int i = 0; i < TEXT.length(); i++) {
                if (i < TEXT.length()-2){
                    if (TEXT.charAt(i) == ('a')){
                        StringBuilder sb = new StringBuilder();
                        for (int y = i; y <= (i+2); y++) {
                            sb.append(TEXT.charAt(y));
                            System.out.println(sb.toString());
                            if (PATTERN.equals(sb.toString())){
                                count++;
                            }
                        }
                    }
                }
            }

            System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");


    }
}