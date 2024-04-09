package Recursion;

public class IsPalindrome {

    public static boolean isPalindrome(String input) {

        if(input.length()==1) return true;
        String firstChar = input.substring(0,1);
        String lastChar = input.substring(input.length()-1);
        if (!firstChar.equals(lastChar)) return false;
        return isPalindrome(input.substring(1, input.length()-1));
    }

    public static void main(String[] a) {
        System.out.println("Is String Palindrome: " + isPalindrome("madam"));
    }
}
