package org.sudeep.arrays;

public class RotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = rotatedSortedArray(nums, target);

        System.out.println(result);

    }

    private static int rotatedSortedArray(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            //check iof first half is sorted.

            if (nums[low] <= nums[mid]) {
                //check if target exists
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }
            //2nd part is sorted
            else {
                //check if target exists
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        }
        return -1;
    }
}
