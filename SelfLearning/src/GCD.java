/*
https://www.youtube.com/watch?v=B1gbmQF4o80&list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG&index=11
 */
public class GCD {
    public static int gcd(int a, int b) {

        while (a !=0 && b !=0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return Math.max(a,b);
    }

    public static void main (String[] a) {
        System.out.println("GCD :"+ gcd(20, 15) );
    }

}
