import java.util.Scanner;
/*
https://www.youtube.com/watch?v=57hXUDXVY8s&list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG&index=10
 */
public class FactorialAndTrailingZeros {
    public static int calculateFactorial(int n){
        int factorial=1;
        if(n == 0) {
            return factorial;
        } else {
            for (int i=1; i<=n; i++) {
                factorial = factorial*i;
            }
        }
        return factorial;
    }

    public static int trailingZeros(int input) {
        int noOfTrailingZeros = 0;
        while(input % 10 == 0){
            input = input / 10;
            noOfTrailingZeros++;
        }
        return noOfTrailingZeros;
    }

    public static int trailingZerosAnotherWay(int input) {
        int noOfTrailingZeros = 0;
        if (input < 5) return noOfTrailingZeros;
        for (int i=5; i<=input; i= i+5) {
            int j = i;
            while( j % 5 == 0) {
                 j =  j / 5;
                noOfTrailingZeros++;
            }
        }
        return noOfTrailingZeros;
    }

    public static int trailingZerosBestWay(int input) {
        int noOfTrailingZeros = 0;
        int powerOf5 =5;
        while(input >= powerOf5){
            int quotient = input / powerOf5;
            powerOf5 *=5;
            noOfTrailingZeros += quotient;
        }
        return noOfTrailingZeros;
    }

    public static void main (String[] a) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int factorial = calculateFactorial(input);
        //System.out.println("Factorial of "+ input + " is "+ factorial);
       // System.out.println("No of tailing Zeros is/are "+ trailingZeros(factorial));
       // System.out.println("No of tailing Zeros is/are "+ trailingZerosAnotherWay(input));
        System.out.println("No of tailing Zeros is/are "+ trailingZerosBestWay(input));
    }
}
