package dev.Mahathir.Solutions;

import java.util.Arrays;

public class smallestNumber_2375 {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        int[] nums = new int[n+1];

        for(int i=1; i<=n; i++) {
            nums[0] = i;
            for(int j=0; j<n; j++) {
                if(pattern.charAt(j) == 'I' && nums[j] < 9) {
                    nums[j+1] = nums[j]+1;
                }
                else if(pattern.charAt(j) == 'D' && nums[j] > 1) {
                    nums[j+1] = nums[j]-1;
                }
                else break;
            }
        }
        return Arrays.toString(nums);
    }
}
