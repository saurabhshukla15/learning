package recursion;

import java.util.ArrayList;
import java.util.List;

public class StringSubsequence {

    public static void stringSubsequence(String input, String ans) {


        if(input.isEmpty()) {
            System.out.println(ans);
            return;
        }
        stringSubsequence(input.substring(1), ans+input.charAt(0));
        stringSubsequence(input.substring(1), ans);
    }

    public static void main(String[] a) {
        stringSubsequence("abc", "");
    }

}
