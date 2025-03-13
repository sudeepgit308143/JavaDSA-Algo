package org.sudeep.arrays;

public class FindFirstAndLastIndex {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;

        int firstIndex = findFirstIndex(nums, target);
        int lastIndex = findLastIndex(nums, target);

        int[] ans = new int[2];
        ans[0] = firstIndex;
        ans[1] = lastIndex;

        for(int num:ans){
            System.out.println(num+" ");
        }
    }


    private static int findFirstIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        int ans = -1;
        while (low <= high) {

            int mid = (low + high) / 2;

            if (target == nums[mid]) {
                ans = mid;
                high = mid - 1; //continue searching left side
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }


    private static int findLastIndex(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == nums[mid]) {
                ans = mid;
                low = mid + 1;//continue searching right side
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
