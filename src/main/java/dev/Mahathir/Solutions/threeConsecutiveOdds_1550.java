package dev.Mahathir.Solutions;

public class threeConsecutiveOdds_1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0; i < arr.length-2; i++)
            if(arr[i]%2 == 1)
                if(arr[i+1]%2 == 1)
                    if(arr[i+2]%2 == 1)
                        return true;
        return false;
    }
}
