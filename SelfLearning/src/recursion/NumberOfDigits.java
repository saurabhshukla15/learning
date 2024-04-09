package recursion;

public class NumberOfDigits {

    public static int countDigits(int n){
        if (n == 0) return 0;
        return countDigits(n/10) +1;
    }

    public static void main(String[] a){
        System.out.println("No of digits: "+countDigits(986345));
    }


}
