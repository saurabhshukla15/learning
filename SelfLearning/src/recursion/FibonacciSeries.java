package recursion;

public class FibonacciSeries {

    /*
    https://www.youtube.com/watch?v=6lZ_iQJaKxM&list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG&index=33
     */
    public static void printFibonacciSeries(int first, int second, int n) {

        if (n<1) return;
       int sum = first + second;
       System.out.println(sum);
       printFibonacciSeries(second, sum, n-1);
    }

    public static void main(String[] a){
        printFibonacciSeries(1,1,6);
    }
}
