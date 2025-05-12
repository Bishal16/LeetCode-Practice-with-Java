package dev.Mahathir.Solutions;

import java.util.*;

public class FindEvenNumbers_2090 {
    public int[] findEvenNumbers(int[] digits) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(digits).forEach(d -> map.put(d, map.getOrDefault(d, 0) + 1));
        List<Integer> ans = new ArrayList<>();
        for(int number = 100; number <= 998; number +=2){
            Map<Integer, Integer> copy = new HashMap<>(map);
            int[] digs = new int[3];
            digs[0] = number / 100;
            digs[1] = (number/10) % 10;
            digs[2] = number % 10;

            boolean flag = true;
            for(int val:digs){
                if(copy.containsKey(val)){
                    copy.put(val, copy.get(val)-1);
                    if(copy.get(val)==0)
                        copy.remove(val);
                }
                else {
                    flag = false;
                    break;
                }
            }
//            for(char c : Integer.toString(number).toCharArray()){
//                int val = c-'0';
//                if(copy.containsKey(val)){
//                    copy.put(val, copy.get(val)-1);
//                    if(copy.get(val)==0)
//                        copy.remove(val);
//                }
//                else {
//                    flag = false;
//                    break;
//                }
//            }
            if(flag)ans.add(number);
        }

        int[] arr = new int[ans.size()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = ans.get(i);
        return arr;
    }
}
