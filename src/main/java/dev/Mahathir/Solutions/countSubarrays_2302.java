package dev.Mahathir.Solutions;

public class countSubarrays_2302 {
    public long countSubarrays(int[] nums, long k) {
        long currentSum = 0, count = 0;
        int i=0;
        for(int j = 0; j < nums.length; j++) {
            currentSum += nums[j];
            while(currentSum*(j-i+1) >= k) {
                currentSum -= nums[i];
                i++;
            }
            count+=j-i+1;
        }
        return count;
    }
}
