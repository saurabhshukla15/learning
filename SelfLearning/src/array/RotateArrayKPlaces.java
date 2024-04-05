package array;

import java.util.Arrays;

public class RotateArrayKPlaces {
    public static void main(String[] a){
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println("Rotated Array: ") ;

        Arrays.stream(rotateArray(nums, 10)).forEach(System.out::println);
    }

    private static int[] rotateArray(int[] nums, int k){
        int len = nums.length;
        if( k > len) {
            k = k % len;
        }
        reverse(nums, 0, len-k-1);
        reverse(nums, len-k, len-1);
        reverse(nums, 0, len-1);
        return nums;

    }

    private static void reverse (int[] num, int start, int end){
        while(start < end ) {
            int temp = num[start];
            num[start] = num[end];
            num[end]  =temp;
            start++;
            end--;
        }
    }
}
