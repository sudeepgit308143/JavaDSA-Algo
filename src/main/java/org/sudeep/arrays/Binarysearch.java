package org.sudeep.arrays;

public class Binarysearch {

    public static void main(String[] args) {
       /* int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;*/
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        int result = binarySearch(nums, target);

        System.out.println(result);
    }

    private static int binarySearch(int[] nums, int target) {

        //assigning low to zero index
        int low = 0;
        //assigning high to last index
        int high = nums.length - 1;

        while (low <= high) {
            //get the mid index using low and high
            int mid = (low + high) / 2;

            //if target equals to mid-index element then return mid-index
            if (nums[mid] == target) {
                return mid;
            }
            //if target is less than mid-index then target will be present in left side of array, so move high index to mid-1
            else if (target < nums[mid]) {
                high = mid - 1;
            }
            //if target is more than mid-index then target will be present in right side of array, so move low index to mid+1
            else {
                low = mid + 1;
            }


        }

        return -1;
    }
}
