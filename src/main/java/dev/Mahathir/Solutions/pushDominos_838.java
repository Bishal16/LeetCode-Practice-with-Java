package dev.Mahathir.Solutions;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class pushDominos_838 {
    public String pushDominoes(String dominoes) {
        ArrayList<Character> dominoList = new ArrayList<>();
        int n = dominoes.length();
        int first = -1, last = -1;
        for(int i = 0; i < n; i++) {
            dominoList.add(dominoes.charAt(i));
            if(dominoes.charAt(i) != '.' && first == -1) {first=i;}
            if(dominoes.charAt(n-i-1) != '.' && last == -1) {last=n-i-1;}
        }

        int count = 0 , lStart=0;
        char x=' ',y;
        if(first == -1 && last == -1) {
            return dominoList.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining());
        }
        else if(first != -1 && last != -1 && first != last) {
            for(int i = first; i <= last; i++) {

                if(dominoes.charAt(i) != '.') {
                    x = dominoList.get(i);
                    count = 0;
                    lStart = i;
                }
                else {
                    count++;
                    if(i<n && dominoes.charAt(i+1) != '.') {
                        y = dominoes.charAt(i+1);
                        if(x=='R' && y=='L'){
                            editDomino(dominoList, lStart+1,i,'x');
                        }
                        else if(x=='L' && y=='R'){

                        }
                        else {
                            editDomino(dominoList, lStart+1,i,dominoes.charAt(i+1));
                        }
                    }
                }
                System.out.println(dominoList);
            }
        }
        else {
            if(dominoes.charAt(first) == 'R') {
                for(int i = first+1; i < n; i++) {
                    dominoList.set(i, 'R');
                }
            }
            else if(dominoes.charAt(last) == 'L') {
                for(int i = last-1; i >= 0; i--) {
                    dominoList.set(i, 'L');
                }
            }
        }
        //corner case
        if(first != 0 && dominoes.charAt(first) == 'L') {
            for(int i = first-1; i >= 0; i--) {
                dominoList.set(i, 'L');
            }
        }
        if(last != n-1 && dominoes.charAt(last) == 'R') {
            for(int i = last+1; i < n; i++) {
                dominoList.set(i, 'R');
            }
        }
        return dominoList.stream()
                .map(String::valueOf)  // Convert each Character to String
                .collect(Collectors.joining());
    }
    private void editDomino(ArrayList<Character> dominoList, int start, int end, char type){
        if(type=='x'){
            int middle =(end+start)/2;
            if((end+start)%2==0){
                for(int i = start; i <= end; i++){
                    if(i<middle)dominoList.set(i, 'R');
                    if(i>middle)dominoList.set(i, 'L');
                }
            }
            else {
                for (int i = start; i <= end; i++) {
                    if (i <=middle) dominoList.set(i, 'R');
                    if (i > middle) dominoList.set(i, 'L');
                }
            }
        }
        else {
            for(int i = start; i <= end; i++) {
                dominoList.set(i, type);
            }
        }
    }
}