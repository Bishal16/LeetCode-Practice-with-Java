package dev.Mahathir.Solutions;

public class minOperations_1769 {
    class Solution {
        public int[] minOperations(String boxes) {
            int n = boxes.length();
            int[] ans = new int[n] ;

            for(int i = 0; i < n; i++){  //110 113
                int p = i-1, j = 1, q = i+1;
                while(p >= 0){
                    if(boxes.charAt(p) == '1'){
                        ans[i]+=j;
                    }
                    j++;
                    p--;
                }
                j=1;
                while(q<n){
                    if(boxes.charAt(q) == '1'){
                        ans[i]+=j;
                    }
                    j++;
                    q++;
                }
            }
            return ans;
        }
    }
}
