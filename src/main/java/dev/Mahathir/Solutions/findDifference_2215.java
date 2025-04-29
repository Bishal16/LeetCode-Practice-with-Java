package dev.mahathir.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class findDifference_2215 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> numSet1 = new HashSet<Integer>();
        for(int num :nums1){
            numSet1.add(num);
        }
        HashSet<Integer> numSet2 = new HashSet<Integer>();
        for(int num:nums2){
            numSet2.add(num);
        }
        ArrayList<Integer> ans1 = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();

        numSet1.forEach(num -> {
            if(!numSet2.contains(num)){
                ans1.add(num);
            }
        });
        numSet2.forEach(num -> {
            if(!numSet1.contains(num)){
                ans2.add(num);
            }
        });
        return Arrays.asList(ans1, ans2);
    }
}
