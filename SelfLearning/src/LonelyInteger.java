import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
array of numbers, where ll  other numbers are in pair except one.
for example [1,2,3,4,3,2,1] so the lonely integer is 4
https://www.youtube.com/watch?v=6lWyyPrvkvI&list=PLU83Ru7iGtAvP1rqt65MCDSBPFCzUKGXG&index=24
 */
public class LonelyInteger {

    public static int lonelyInteger( int[] input) {

        Arrays.sort(input);
        for(int i=0; i<=input.length-2; i+=2 ) {
            if(input[i] != input[i+1]) {
                return input[i];
            }
        }
        return input[input.length-1];
    }

    /*
    XOR operation with two same no will result in 0
     */
    public static int lonelyIntegerEfficient( int[] input) {

        int result = 0;
        int i = 0;
        int j = input.length-1;
        while(i < j) {
            int multi = input[i] ^ input[j];
            result = result ^ multi;
            i++;
            j--;
        }
        return result ^ input[input.length/2];
    }

    public static void main(String[] a) {
        int[] intArray = new int[]{1,2,4,3,3,2,1};
       // System.out.println("Lonely Integer is: "+lonelyInteger(intArray));
        System.out.println("Lonely Integer is: "+lonelyIntegerEfficient(intArray));
    }
}
