package org.sudeep.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindPeaks {

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 8, 5};

        List<Integer> peaks = findPeakIndex(nums);

        for (Integer peak : peaks) {
            System.out.print(peak+" ");
        }
        System.out.println("");
        System.out.println("--------------");

        peaks.forEach(peak -> System.out.print("peaks are:" + peak + " "));
    }

    private static List<Integer> findPeakIndex(int[] nums) {
        int n = nums.length;
        List<Integer> peaks = new ArrayList<>();
        if (n < 3) {
            return peaks;
        }

        for (int i = 1; i < n - 1; i++) {

            if (nums[i] > nums[i + 1] && nums[i] > nums[i - 1]) {

                peaks.add(i);
            }

        }
        return peaks;
    }
}
