/*
https://www.youtube.com/watch?v=3-IrS8nD5Yc&list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG&index=12
 */
public class LCM {

    public static int calculateLCMBruteForce(int a, int b){
        int lcm = 0;
        int biggerInt = Math.max(a, b);
        while(biggerInt%a !=0 || biggerInt%b !=0) {
            biggerInt += 1;
            lcm = biggerInt;
        }
        return lcm;
    }

    /*
    LCM(a,b) x GCD (a,b) = axb
     */
    public static int efficientLCM(int a, int b) {
        return a*b / GCD.gcd(a,b);

    }

    public static void main(String[] a){
        System.out.println("LCM is : "+calculateLCMBruteForce(3, 5));
        System.out.println("LCM calculated in efficient way is : "+calculateLCMBruteForce(3, 5));
    }
}
