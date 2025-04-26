package dev.Mahathir.Solutions;

import java.util.ArrayList;
import java.util.List;

public class countInterestingSubarrays_2845 {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        int start = 0;
        for(int n:nums){
            if(n % modulo == k){
                start++;
                arr1.add(start);
            }
        }
        int ans = 0, cnt = 0;
        for(int i = 0; i < nums.size(); i++){
            for(int j = i; j < nums.size(); j++){
                cnt = arr1.get(j) - arr1.get(i) +1;
                if(cnt % modulo == k){
                    ans++;
                }
            }
        }
        return ans;
    }
}