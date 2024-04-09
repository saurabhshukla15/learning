package Recursion;

public class FactorialOfANumber {

    public static int factorial(int n) {
        int result=1;
        if(n<1) {
            return result;
        } else{
            result = n * factorial(n-1);
        }
        return result;
    }

    public static void main(String[] a){
        System.out.println("Factorial is : "+factorial(5));
    }
}
