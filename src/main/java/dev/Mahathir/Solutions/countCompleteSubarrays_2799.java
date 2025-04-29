package dev.mahathir.solutions;

import java.util.HashSet;
import java.util.*;
import java.util.stream.Collectors;


public class countCompleteSubarrays_2799 {
    public int countCompleteSubarrays(int[] nums) {

        int ans = 0, countDistinct = Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
        for(int i = 0; i < nums.length-(countDistinct-1); i++) {
            HashSet<Integer> set = new HashSet<>();
            for(int j = i ; j < nums.length; j++) {
                set.add(nums[j]);
                if(set.size() >= countDistinct) {
                    ans++;
                }
            }
        }
        return ans;
    }
}