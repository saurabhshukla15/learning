package string;

import java.util.Objects;

//https://www.youtube.com/watch?v=uX0-xyPkR2w
public class LongestPalindromeSubstring {

    private static String longestPalindromeSubstring(String s) {
        if (Objects.isNull(s) || s.isEmpty()) {
            System.out.println("String is blank");
            return null;
        }
        String longestPalindromeSubstring = "";
        if(s.length() == 1) {
            return s;
        }

        for (int i = 1; i < s.length(); i++) {
            int left=i, right=i;
            while(s.charAt(left) == s.charAt(right)){
                left --;
                right ++;
                if(left < 0 || right == s.length()){
                    break;
                }
            }
            String palindrome = s.substring(left+1, right);
            if (palindrome.length() > longestPalindromeSubstring.length()) {
                longestPalindromeSubstring = palindrome;
            }


                left = i-1;
                right = i;
                while(s.charAt(left) == s.charAt(right)){
                    left--;
                    right++;

                    if(left<0 || right < s.length()) break;
                }
                String palindromeEven = s.substring(left+1, right);
                if(palindromeEven.length() > longestPalindromeSubstring.length()) {
                    longestPalindromeSubstring = palindromeEven;
                }
            }



        return longestPalindromeSubstring;
    }

    public static void main(String[] args) {
        System.out.println("Longest palindrome substring: "+ longestPalindromeSubstring("a"));
    }
}
