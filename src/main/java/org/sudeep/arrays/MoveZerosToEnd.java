package org.sudeep.arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZerosToEnd(nums);
        //iterating the result array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void moveZerosToEnd(int[] nums) {

        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            //if it is non-zero element swap the i index element to count index element and increment count.
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }

        }
        //setting remaining count index elements to zero as swap is done till the non-zero elements.
        while (count < n) {
            nums[count] = 0;
            count++;
        }

    }

}
