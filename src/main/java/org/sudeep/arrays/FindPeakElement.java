package org.sudeep.arrays;

public class FindPeakElement {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int result = findPeakElement(nums);
        int binaryResult = findPeakElementUsingBinarySearch(nums);

        System.out.println(result);

        System.out.println(binaryResult);

    }

    private static int findPeakElementUsingBinarySearch(int[] nums) {

        int n = nums.length;

        if (n == 1) {
            return 0;
        }

        if (n == 2) {

            if (nums[0] > nums[1]) {
                return 0;
            }

            return 1;


        }

        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }

        int low = 0;
        int high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            } else if (nums[mid] < nums[mid - 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private static int findPeakElement(int[] nums) {

        int peakElement = nums[0];
        int peakIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (peakElement < nums[i]) {
                peakElement = nums[i];
                peakIndex = i;
            }
           /* else {
                return peakIndex;

            }*/
        }
        return peakIndex;
    }
}
