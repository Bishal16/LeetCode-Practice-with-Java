package dev.Mahathir.Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class countSubarrays_2962 {
    public long countSubarrays(int[] nums, int k) {

        long ans = 0, max = Arrays.stream(nums).max().getAsInt();
        ArrayList<Integer> queue = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == max)
                queue.add(i);
            int ln = queue.size();
            if(ln >= k){
                ans+= queue.get(ln-k)+1;
                System.out.println(queue.get(ln-k)+1);
            }
        }
        return ans;
    }
}