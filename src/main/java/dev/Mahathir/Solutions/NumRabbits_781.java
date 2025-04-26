package dev.Mahathir.Solutions;

import java.util.HashMap;
import java.util.Map;

public class NumRabbits_781 {
    public int numRabbits(int[] answers) {
        int answer = 0;
        HashMap<Integer, Integer> colorVsCount = new HashMap<>();
        for (int rabit : answers) {
            if(rabit == 0) {
                answer++;
            }
            else if (!colorVsCount.containsKey(rabit)) {
                colorVsCount.put(rabit, 1);
            }
            else {
                colorVsCount.put(rabit, colorVsCount.get(rabit) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : colorVsCount.entrySet()) {
           if(entry.getValue() <= entry.getKey() + 1)
               answer = answer + entry.getKey() + 1;
           else {
               int group = entry.getKey()+1;
               int val = entry.getValue();
               int x =  (int)Math.ceil((double) val /group);
               answer = answer + group * x;
           }
        }
        return answer;
    }
}
