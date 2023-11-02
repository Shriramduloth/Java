import java.util.*;

public class stringPangram {
    public static void main(String[] args) {
        boolean flag = false;

        String str = "The quick brown fox jumps over lazy dog";

        str = str.replace(" ", "");
        str = str.toUpperCase();

        char ch[] = str.toCharArray();
        Arrays.sort(ch);

        int ar1[] = new int[26];
        for (int i = 0; i < ch.length; i++) {
            ar1[ch[i] - 65]++;
        }

        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] == 0) {
                System.out.println("It is not a Pangram");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("It is a Pangram");
        }

    }

}