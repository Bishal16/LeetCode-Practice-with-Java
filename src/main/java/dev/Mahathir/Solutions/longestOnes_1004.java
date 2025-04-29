package dev.mahathir.solutions;

public class longestOnes_1004 {
    public int longestOnes(int[] nums, int k) {
        int p = 0, q = 0, zero = 0, max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }
            while(zero>k){
                if(nums[p] == 0){
                    zero--;
                }
                p++;
            }
            if(max>q-p+1)
                max = q-p+1;
        }
        return max;
    }
}
