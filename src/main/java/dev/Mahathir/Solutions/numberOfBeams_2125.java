package dev.Mahathir.Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class numberOfBeams_2125 {
    public int numberOfBeams(String[] bank) {
        List<Integer> list = new ArrayList<>();
        Arrays.stream(bank).sequential()
                .forEach(s -> Arrays.stream(s.split("")).count() );
        for (String s : bank) {
            int count = 0;
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == '1')
                    count++;
            if (count > 0)
                list.add(count);
        }
        if (list.size() < 2 ) return 0;
        int ans = 0;
        for (int i = 0; i < list.size()-1; i++){
            int x = list.get(i);
            int y = list.get(i+1);
            ans += x * y;
        }
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        return ans;
    }
}
