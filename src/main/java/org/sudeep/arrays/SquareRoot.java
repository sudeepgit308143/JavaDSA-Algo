package org.sudeep.arrays;

public class SquareRoot {

    public static void main(String[] args) {

        int input = 8;
        int result = findSquareRoot(input);

        System.out.println(result);
    }

    private static int findSquareRoot(int input) {
        int low = 0;
        int high = input;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            long square = (long) mid * mid;


            if (input == square) {
                return mid;
            } else if (input < square) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;

            }
        }
        return ans;
    }

}
