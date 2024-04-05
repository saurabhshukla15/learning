package string;
/*
https://www.youtube.com/watch?v=I0vmCnkcGW4

Brut-Force Approach:
 - Initialize a second same size temp array.
 - Place 0th element of original array into the temp array.
 - Iterate the original array from first position till end and check if the element at 1 st position is not present in the temp array.
 - If the element is not present increase the index in the temp array and place the element.
 */
public class RemoveDuplicatesFromSortedArray2 {

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};
        System.out.println("Array after removing duplicates");
        int rd = removeDuplicates(nums);
        for (int i =0 ; i< rd ; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static int removeDuplicates(int[] nums) {

        int rd = 0;
        for (int i =1; i< nums.length; i++) {
            if (nums[rd] != nums[i]){
                rd++;
                nums[rd] = nums[i];
            }
        }
        return rd+1;
    }
}
