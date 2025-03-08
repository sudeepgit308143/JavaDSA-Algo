package org.sudeep.arrays;

public class FindPeakElement {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int result = findPeakElement(nums);

        System.out.println(result);

    }

    private static int findPeakElement(int[] nums) {

        int peakElement = nums[0];
        int peakIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (peakElement < nums[i]) {
                peakElement = nums[i];
                peakIndex = i;
            } else {
                return peakIndex;

            }
        }
        return peakIndex;
    }
}
