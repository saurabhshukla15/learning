public class CountNoOfDigitsInANumber {
    public static int noOfDigits(int number) {
        int noOfDigits = 0;
        while(number > 0) {
            number = number / 10;
            noOfDigits ++;
        }
        return noOfDigits;
    }

    public static void main(String[] a) {
        System.out.println("No of digits: "+noOfDigits(3));
    }
}
