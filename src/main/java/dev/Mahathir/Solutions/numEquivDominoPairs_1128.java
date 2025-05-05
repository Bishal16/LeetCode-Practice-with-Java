package dev.Mahathir.Solutions;

import java.util.Collections;
import java.util.HashMap;

public class numEquivDominoPairs_1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int [] pair : dominoes) {
            int fixVal = pair[0]<pair[1] ? pair[0]*10+pair[1] : pair[1]*10+pair[0];
            if(!map.containsKey(fixVal))
                map.put(fixVal, 1);
            else
                map.put(fixVal, map.get(fixVal)+1);
        }
        int answer = 0;
        System.out.println(map.values());
        for(int count: map.values()) {
            answer += count*(count-1)/2;
        }
        return answer;
    }
}