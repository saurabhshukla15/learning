package recursion;

public class SumOfDigitsNumber {

    public static int sumOfDigits(int n) {

        int remainder = n % 10;
        if (n < 10) return remainder;
        return sumOfDigits(n/10) + remainder;
    }

    public static void main(String[] a){
        System.out.println("Sum of digits: " +sumOfDigits(34256));
    }
}
