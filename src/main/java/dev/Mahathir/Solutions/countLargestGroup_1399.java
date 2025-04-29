package dev.mahathir.solutions;

import java.util.HashMap;

public class countLargestGroup_1399 {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 1; i <= n; i++) {
            int sumDigits = sumOfDigits(i);
            if(!map.containsKey(sumDigits)) {
                map.put(sumOfDigits(i), 1);
            }
            else{
                map.put(sumDigits, map.get(sumDigits) + 1);
            }
            if(map.get(sumDigits) > max) {max = map.get(sumDigits);}
        }
        int ans = 0;
        for(int i : map.values()) {
            if(i==max)
                ans++ ;
        }
        return ans;
    }
    int sumOfDigits(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}