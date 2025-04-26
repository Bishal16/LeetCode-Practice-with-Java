package dev.Mahathir.Solutions;

public class countSubArrays_2444 {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int min = -1, max = -1, out = -1;
        long ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == minK) min = i;
            if(nums[i] == maxK) max = i;
            if(nums[i] < minK || nums[i] > maxK)  out = i;
            if(min != -1 && max != -1){
                ans += Math.max(0,Math.min(min, max) - out);
                System.out.println(ans+".  "+i+"    mn mx "+min+" "+max+"  out "+out);
            }
        }
        return ans;
    }
}