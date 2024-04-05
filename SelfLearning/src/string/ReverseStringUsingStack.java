package string;

import java.util.Objects;
import java.util.Stack;

public class ReverseStringUsingStack {

    private static String reverseString(String reverse) {
        if (Objects.isNull(reverse) || reverse.isEmpty() || reverse.isBlank()) {
            System.out.println("String is Empty/Blank");
            return null;
        }

        char[] input = reverse.toCharArray();
        StringBuilder stringBuffer = new StringBuilder();
        Stack<Character> characters = new Stack<Character>();
        for(char c: input) {
            characters.push(c);
        }

        while(!characters.isEmpty()) {
            stringBuffer.append(characters.pop());
        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println("Reversed String: "+reverseString("Saurabh Shukla"));
        System.out.println("Reversed String: "+reverseString(null));
    }

}
