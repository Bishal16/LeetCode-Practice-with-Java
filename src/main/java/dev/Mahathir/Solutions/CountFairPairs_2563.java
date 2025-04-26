package dev.Mahathir.Solutions;

import java.util.Arrays;

public class CountFairPairs_2563 {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return sol(nums, upper + 1) - sol(nums, lower);
    }

    private long sol(int[] nums, int val) {
        int left = 0, right = nums.length - 1;
        long count = 0;
        while (left < right) {
            if (nums[left] + nums[right] < val) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}