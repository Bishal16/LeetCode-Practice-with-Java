package dev.Mahathir.Solutions;

public class CountAndSay_38 {
    public String countAndSay(int n) {
        String currentRLE = "1", Ans = "1";
        if (n == 1) {
            return Ans;
        }
        for (int i = 1; i < n; i++) {
            currentRLE = findAns( currentRLE);
        }
        return Ans;
    }
    private String findAns(String currentRLE) {
        if (currentRLE.equals("1")) {
            return "11";
        }
        StringBuilder ans = new StringBuilder();
        int sequenceLength = 1, number = 0;
        for (int i = 0; i < currentRLE.length() - 1; i++) {
            if(currentRLE.charAt(i) == currentRLE.charAt(i + 1)) {
                sequenceLength++;
            }
            else {
                number = currentRLE.charAt(i) - '0';
                ans.append(sequenceLength).append(number);
                sequenceLength = 1;
            }
        }
        number = currentRLE.charAt(currentRLE.length()-1) - '0';
        ans.append(sequenceLength).append(number);
        return ans.toString();
    }
}
