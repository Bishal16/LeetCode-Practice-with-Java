package dev.Mahathir.Solutions;

import java.util.ArrayList;
import java.util.List;

public class ValidString_3211 {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < Math.pow(2,n); i++){
            String x = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
            if(!x.contains("00"))
                ans.add(x);
        }
        return ans;
    }
}