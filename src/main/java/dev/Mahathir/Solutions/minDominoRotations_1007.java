package dev.Mahathir.Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class minDominoRotations_1007 {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        boolean[] validity = new boolean[6];
        Arrays.fill(validity, true);

        List<Integer> topAlter = new ArrayList<>(Collections.nCopies(6, 0));
        List<Integer> bottomAlter = new ArrayList<>(Collections.nCopies(6, 0));

        for (int i = 0; i < tops.length; i++) {
            for(int x = 1; x <= 6; x++) {
                if(tops[i]==x && bottoms[i]==x) {

                }
                else if (tops[i]==x) {
                    bottomAlter.set(x-1, bottomAlter.get(x-1)+1);
                }
                else if (bottoms[i]==x) {
                    topAlter.set(x-1, topAlter.get(x-1)+1);
                } else {
                    validity[x-1] = false;
                }
            }
        }
        int ans = -1;
        for(int i=0; i<6; i++) {
            if(validity[i]) {
                ans = Math.min(topAlter.get(i), bottomAlter.get(i));
            }
        }
        return ans;
    }
}