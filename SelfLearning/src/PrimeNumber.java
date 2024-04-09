public class PrimeNumber {
    public static boolean isPrime(int input) {

        for (int i=2; i<= input/2; i++) {
            if (input % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeEfficient(int input) {

        for (int i=2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] a){
        System.out.println("Is Prime : "+isPrime(10));
        System.out.println("Is Prime Efficient: "+isPrimeEfficient(25));
    }

}
