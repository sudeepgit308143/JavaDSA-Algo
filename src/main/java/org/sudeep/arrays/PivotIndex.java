package org.sudeep.arrays;

public class PivotIndex {

    public static void main(String[] args) {

        //int[] nums = {1, 7, 3, 6, 5, 6};
        int[] nums = {2, 1, -1};

        int result = findPivotIndex(nums);
        System.out.println(result);

    }

    private static int findPivotIndex(int[] nums) {


        int n = nums.length;

        if (n == 0) {
            return -1;
        }
        int totalSum = 0;

        //get the total sum

        for (int i = 0; i < n; i++) {
            totalSum += nums[i];

        }
// using prefix sum for leftsum and postfix sum for rightSum and compare both sums and return the matching index.
        int leftSum = 0;
        int rightSum = totalSum;
        for (int i = 0; i < n; i++) {
            rightSum = rightSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum = leftSum + nums[i];

        }
        return -1;
    }
}
