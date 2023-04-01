package BinarySearch_0704;

public class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int middle = low + ((high - low) / 2);
            int guess = nums[middle];

            if (guess > target) {
                high = middle - 1;
            } else if (guess < target) {
                low = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}