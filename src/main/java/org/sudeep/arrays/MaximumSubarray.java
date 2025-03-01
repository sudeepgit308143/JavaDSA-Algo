package org.sudeep.arrays;

public class MaximumSubarray {

    public static void main(String[] args) {
        //int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums = {5, 4, -1, 7, 8};
        int result = maximumSubArray(nums);
        System.out.println(result);

    }

    private static int maximumSubArray(int[] nums) {

        int n = nums.length;
        int sum = 0;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            sum += nums[i];
            //if ans is less than sum then assign sum to ans, so that ans will be highest
            if (ans < sum) {
                ans = sum;
            }

            //if sum is becoming less than zero then reset the sum to zero, as negative sum won't contribute.
            if (sum < 0) {
                sum = 0;
            }
        }

        return ans;
    }
}
