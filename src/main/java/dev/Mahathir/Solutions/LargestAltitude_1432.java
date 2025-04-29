package dev.mahathir.solutions;

public class LargestAltitude_1432 {
    public int largestAltitude(int[] gain) {
        int highestAlt = 0, curretnAlt = 0;
        for(int i = 0; i < gain.length; i++){
            curretnAlt += gain[i];
            if(curretnAlt > highestAlt){
                highestAlt = curretnAlt;
            }
        }
        return highestAlt;
    }
}
