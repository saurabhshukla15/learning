package recursion;

public class SumOfArrayElements {

    public static int sumOFArray(int[] input, int len){

        if(len == 1) return input[0];
        return sumOFArray(input, len-1) + input[len-1];
    }

    public static void main(String[] a){
        int[] arr = new int[]{1,3,5,6,10};
        System.out.println("Sum of Array : " + sumOFArray(arr, arr.length));
    }

}
