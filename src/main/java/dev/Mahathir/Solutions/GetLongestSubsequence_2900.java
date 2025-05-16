package dev.Mahathir.Solutions;

import java.util.ArrayList;
import java.util.List;

public class GetLongestSubsequence_2900 {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        if(words.length == 1) return new ArrayList(List.of(words[0]));
        int firstOne = -1, firstZero = -1, x = 0, n = groups.length;
        List<String> ans1 = new ArrayList<String>();
        List<String> ans2 = new ArrayList<String>();

        while(x<n){
            if(groups[x] == 1 && firstOne == -1) {
                firstOne = x;
                ans1.add(words[firstOne]);
                int lastNumber = groups[firstOne];
                for(int i = firstOne+1; i < n;i ++){
                    if(lastNumber != groups[i]){
                        lastNumber = groups[i];
                        ans1.add(words[i]);
                    }
                }
            }
            if(groups[x] == 0 && firstZero == -1) {
                firstZero = x;
                ans2.add(words[firstZero]);
                int lastNumber = groups[firstZero];
                for(int i = firstZero+1; i < n;i ++){
                    if(lastNumber != groups[i]){
                        lastNumber = groups[i];
                        ans2.add(words[i]);
                    }
                }
            }

            if(firstOne != -1 && firstZero != -1) break;
            x++;
        }


        // System.out.println(ans1);
        // System.out.println(ans2);

        // System.out.println(firstOne);
        // System.out.println(firstZero);
        return ans1.size() >= ans2.size() ? ans1 : ans2;
    }
}