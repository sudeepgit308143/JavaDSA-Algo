package org.sudeep.arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 5;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                System.out.println(i);
            }

        }
    }


}
