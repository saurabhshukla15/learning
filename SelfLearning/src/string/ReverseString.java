package string;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class ReverseString {

    private static char[] reverseString(String reverse) {

        if(reverse.isBlank() || reverse. isEmpty()) {
            return  null;
        }
        char[] input = reverse.toCharArray();
        int len = reverse.length()-1;

        for (int i=0; i<len; i++, len--){
            char temp = input[i];
            input[i] = input[len];
            input[len] = temp;
        }
        return input;
    }

    private static void printArray(char[] input) {
        if(Objects.isNull(input)) {
            System.out.print("String is Null");
            return;
        }
        for(char c: input){
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        printArray(reverseString("Mamta"));
    }
}
