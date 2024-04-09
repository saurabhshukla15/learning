package recursion;

public class ReverseString {

    public static void reverseString(String input){

        if (input.isEmpty()) return;
        System.out.print(input.substring(input.length()-1));
        reverseString(input.substring(0, input.length()-1));

    }

    public static void main(String[] a){
        reverseString("madam");
    }

}
