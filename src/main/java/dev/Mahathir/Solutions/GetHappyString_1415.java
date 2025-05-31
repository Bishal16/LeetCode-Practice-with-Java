package dev.Mahathir.Solutions;

import java.util.ArrayList;
import java.util.List;

public class GetHappyString_1415 {
    List<String> happyString  = new ArrayList<>();
    public String getHappyString(int n, int k) {
        generateString("", n);
        return happyString.size()  >= k ? happyString.get(k - 1) : "";
    }
    void generateString(String s, int n) {
        if(s.length() == n){
            happyString.add(s);
            return;
        }
        if(s.isEmpty()) {
            generateString(s + "a", n);
            generateString(s + "b", n);
            generateString(s + "c", n);
        }
        else{
            if( s.charAt(s.length()-1) == 'a')
                generateString(s+"b", n);
            if(s.charAt(s.length()-1) == 'a')
                generateString(s+"c", n);

            if(s.charAt(s.length()-1) == 'b')
                generateString(s+"a", n);
            if(s.charAt(s.length()-1) == 'b')
                generateString(s+"c", n);

            if(s.charAt(s.length()-1) == 'c')
                generateString(s+"a", n);
            if(s.charAt(s.length()-1) == 'c')
                generateString(s+"b", n);
        }

    }
}
